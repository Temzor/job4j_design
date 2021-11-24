package black.io;

import java.io.*;

public class CopyExample {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(
                new FileReader("4dd8cb2342fb0b33903ef63ce932f17c.jpg"));
            BufferedWriter writer  = new BufferedWriter(
                    new FileWriter("clone.jpg", true))) {
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.write("\n");
            }
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
