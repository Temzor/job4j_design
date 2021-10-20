package black.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) throws IOException {
        try (FileReader reader = new FileReader("TestRubai.txt");
        FileWriter writer = new FileWriter("TestRubai.txt", true)) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println();
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
