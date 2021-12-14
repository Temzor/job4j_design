package ru.job4j.io;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) throws IOException {
        try (ServerSocket server = new ServerSocket(9000)) {
            while (!server.isClosed()) {
                Socket socket = server.accept();
                try (OutputStream out = socket.getOutputStream();
                     BufferedReader in = new BufferedReader(
                             new InputStreamReader(socket.getInputStream()))) {
                    out.write("HTTP/1.1 200 OK\r\n\r\n".getBytes());
                    while (in.ready()) {
                        String line = in.readLine();
                        System.out.println("line");
                        System.out.println(line);
                        String[] values = line.split(" ");
                        for (String value : values) {
                            System.out.println(value);
                        }
                        if ("GET".equals(values[0])) {
                            switch (values[1]) {
                                case "/?msg=Bye" -> {
                                    out.write("Bye bye, my dear friend\r\n\r\n".getBytes());
                                    server.close();
                                }
                                case "/?msg=Hello" -> out.write("Hello, my dear friend\r\n\r\n".getBytes());
                                default -> out.write("What did you say?\r\n\r\n".getBytes());
                            }
                        }
                    }
                    out.flush();
                }
            }
        }
    }
}