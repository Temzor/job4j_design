package black.io;

import java.io.*;

public class CopyExample {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(
                new FileReader("TestRubai.txt"));
            BufferedWriter writer  = new BufferedWriter(
                    new FileWriter("test3.txt", true))) {
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
