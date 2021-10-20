package black.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {
        String rubai = "Много лет размышлял я над жизнью земной.\n"
                + "Непонятного нет для меня под луной.\n"
                + "Мне известно, что мне ничего не известно!\n"
                + "Вот последняя правда, открытая мной.\n";

        try (FileWriter writer = new FileWriter("TestRubai.txt", true)) {
            for (int i = 0; i < rubai.length(); i++) {
                writer.write(rubai.charAt(i));
            }
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
