package ru.job4j.jdbc;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;
import java.util.StringJoiner;

public class TableEditor implements AutoCloseable {
    private Connection connection;
    private final Properties properties;

    public TableEditor(Properties properties) throws SQLException, ClassNotFoundException {
        this.properties = properties;
        initConnection();
    }

    private void initConnection() throws ClassNotFoundException, SQLException {
        Class.forName(properties.getProperty("postgres.connection.driver_class"));
        String url = properties.getProperty("postgres.connection.url");
        String login = properties.getProperty("postgres.connection.username");
        String password = properties.getProperty("postgres.connection.password");
        connection = DriverManager.getConnection(url, login, password);
    }

    public void execSql(String query) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            statement.execute(query);
        }
    }

    public void createTable(String tableName) throws Exception {
        execSql(String.format("CREATE TABLE IF NOT EXISTS %s ();", tableName));
        System.out.println(getTableScheme(connection, tableName));
    }

    public void dropTable(String tableName) throws Exception {
        execSql(String.format("DROP TABLE IF EXISTS %s;", tableName));
    }

    public void addColumn(String tableName, String columnName, String type) throws Exception {
        execSql(String.format("ALTER TABLE %s ADD %s %s;", tableName, columnName, type));
        System.out.println(getTableScheme(connection, tableName));
    }

    public void dropColumn(String tableName, String columnName) throws Exception {
        execSql(String.format("ALTER TABLE %s DROP COLUMN IF EXISTS %s;", tableName, columnName));
        System.out.println(getTableScheme(connection, tableName));
    }

    public void renameColumn(String tableName, String columnName, String newColumnName) throws Exception {
        execSql(String.format("ALTER TABLE %s RENAME COLUMN %s TO %s;", tableName, columnName, newColumnName));
        System.out.println(getTableScheme(connection, tableName));
    }

    public static String getTableScheme(Connection connection, String tableName) throws Exception {
        var rowSeparator = "-".repeat(30).concat(System.lineSeparator());
        var header = String.format("%-15s|%-15s%n", "NAME", "TYPE");
        var bufer = new StringJoiner(rowSeparator, rowSeparator, rowSeparator);
        bufer.add(header);
        try (var statement = connection.createStatement()) {
            var selection = statement.executeQuery(String.format(
                    "select * from %s limit 1", tableName
            ));
            var metaData = selection.getMetaData();
            for (int i = 1; i <= metaData.getColumnCount(); i++) {
                bufer.add(String.format("%-15s|%-15s%n",
                        metaData.getColumnName(i), metaData.getColumnTypeName(i))
                );
            }
        }
        return bufer.toString();
    }

    @Override
    public void close() throws Exception {
        if (connection != null) {
            connection.close();
        }
    }

    public static void main(String[] args) throws Exception {
        String tableName = "test_db";
        Properties properties = new Properties();
        properties.load(new FileInputStream("C:/projects/job4j_design/data/app.properties"));
        TableEditor tableEditor = new TableEditor(properties);
        tableEditor.createTable(tableName);
        tableEditor.addColumn(tableName, "test_column", "text");
        tableEditor.renameColumn(tableName, "test_column", "test_column_rename");
        tableEditor.dropColumn(tableName, "test_column_rename");
        tableEditor.addColumn(tableName, "test_column", "text");
        tableEditor.dropTable(tableName);
        tableEditor.close();
    }
}