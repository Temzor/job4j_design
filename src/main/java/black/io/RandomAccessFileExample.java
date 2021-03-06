package black.io;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExample {
    public static void main(String[] args) {
        try (RandomAccessFile randomAccessFile = new RandomAccessFile("test10.txt", "rw")) {
            int i = randomAccessFile.read();
            System.out.println((char) i);
            String s1 = randomAccessFile.readLine();
            System.out.println(s1);

            randomAccessFile.seek(101);
            String s2 = randomAccessFile.readLine();
            System.out.println(s2);

            long position = randomAccessFile.getFilePointer();
            System.out.println(position);

            randomAccessFile.seek(0);
            randomAccessFile.writeBytes("");

            randomAccessFile.seek(randomAccessFile.length() - 1);
            randomAccessFile.writeBytes("\n\t\t\t\t\tWillian Butler Yeats");



        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}
