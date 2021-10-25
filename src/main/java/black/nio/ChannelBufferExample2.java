package black.nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferExample2 {
    public static void main(String[] args) {
        try (RandomAccessFile randomAccessFile = new RandomAccessFile("test5.txt", "r");
             FileChannel fileChannel = randomAccessFile.getChannel()) {
            ByteBuffer byteBuffer = ByteBuffer.allocate(5);
            fileChannel.read(byteBuffer);
            byteBuffer.flip();
            System.out.println((char) byteBuffer.get());
            System.out.println((char) byteBuffer.get());
            System.out.println((char) byteBuffer.get());
            byteBuffer.rewind();
            System.out.println((char) byteBuffer.get());

            System.out.println("-----------------------------");
            byteBuffer.compact();
            fileChannel.read(byteBuffer);
            byteBuffer.flip();
            while (byteBuffer.hasRemaining()) {
                System.out.println((char) byteBuffer.get());
            }

            System.out.println("-----------------------------");
            byteBuffer.clear();
            fileChannel.read(byteBuffer);
            byteBuffer.flip();
            System.out.println((char) byteBuffer.get());
            byteBuffer.mark();
            System.out.println((char) byteBuffer.get());
            System.out.println((char) byteBuffer.get());
            byteBuffer.reset();
            while (byteBuffer.hasRemaining()) {
                System.out.println((char) byteBuffer.get());
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
