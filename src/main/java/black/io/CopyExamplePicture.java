package black.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyExamplePicture {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("4dd8cb2342fb0b33903ef63ce932f17c.jpg");
             FileOutputStream outputStream = new FileOutputStream("clone1.jpg")) {
            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
