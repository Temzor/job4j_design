package ru.job4j.spammer;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class ImportDB {

    private final Properties cfg;
    private final String dump;

    public ImportDB(Properties cfg, String dump) {
        this.cfg = cfg;
        this.dump = dump;
    }

    public List<User> load() {
        List<User> users = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(dump))) {
            bufferedReader.lines().forEach(s -> {
                String[] data = s.split(";");
                if (data.length != 2 || data[0].isEmpty() || data[1].isEmpty() || !data[1].contains("@")) {
                    throw new IllegalArgumentException("name or email incorrect, check your dump file.");
                }
                users.add(new User(data[0], data[1]));
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return users;
    }

    public void save(List<User> users) throws ClassNotFoundException, SQLException {
        Class.forName(cfg.getProperty("jdbc.driver"));
        try (Connection cnt = DriverManager.getConnection(
                cfg.getProperty("jdbc.url"),
                cfg.getProperty("jdbc.username"),
                cfg.getProperty("jdbc.password")
        )) {
            for (User user : users) {
                try (PreparedStatement statement = cnt.prepareStatement("INSERT INTO users(name, email) VALUES(?,?)")) {
                    statement.setString(1, user.name);
                    statement.setString(2, user.email);
                    statement.execute();
                }
            }
        }
    }

    private static class User {
        String name;
        String email;

        public User(String name, String email) {
            this.name = name;
            this.email = email;
        }
    }
    public static void main(String[] args) throws Exception {
        Properties cfg = new Properties();
        try (FileInputStream in = new FileInputStream("C:\\projects\\job4j_design\\data\\sql\\data\\app_for_spammer.properties")) {
            cfg.load(in);
        }
        ImportDB db = new ImportDB(cfg, "C:\\projects\\job4j_design\\data\\dump.txt");
        db.save(db.load());
    }
}