package black.nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferExample {
    public static void main(String[] args) {
        try (RandomAccessFile randomAccessFile =
                     new RandomAccessFile("test10.txt", "rw");
             FileChannel fileChannel = randomAccessFile.getChannel()) {
            ByteBuffer byteBuffer = ByteBuffer.allocate(150);
            StringBuilder stringBuilder = new StringBuilder();

            int byteRead = fileChannel.read(byteBuffer);
            while (byteRead > 0) {
                System.out.println("Read: " + byteRead);

                byteBuffer.flip();

                while (byteBuffer.hasRemaining()) {
                    stringBuilder.append((char) byteBuffer.get());
                }

                byteBuffer.clear();
                byteRead = fileChannel.read(byteBuffer);

            }
            System.out.println(stringBuilder);
            String text = "\nThere are only two ways to live your life. "
                     + "One is as though nothing is a miracle. "
                     + "The other is as though everything is a miracle.";

            ByteBuffer byteBuffer2 = ByteBuffer.wrap(text.getBytes());
            fileChannel.write(byteBuffer2);

            ByteBuffer byteBuffer1 = ByteBuffer.allocate(text.getBytes().length);
            byteBuffer1.put(text.getBytes());
            byteBuffer1.flip();
            fileChannel.write(byteBuffer1);

            } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
