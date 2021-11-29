package ru.job4j.io;

import java.io.*;

public class Analyze {
    public void unavailable(String source, String target) {
        try(
                BufferedReader in = new BufferedReader(new FileReader(source));
                PrintWriter out = new PrintWriter(new FileOutputStream(target))
        ) {
            boolean status200Or300 = true;
            while (in.ready()) {
                String notice = in.readLine();
                String[] data = notice.split(" ");
                int status = Integer.parseInt(data[0]);
                String dateTime = data[1];
                if ((status == 400 || status == 500) && status200Or300) {
                    out.print(status + " | " + dateTime + ";");
                    status200Or300 = false;
                } else if ((status == 200 || status == 300) && !status200Or300) {
                    out.println(status + " | " + dateTime + ";");
                    status200Or300 = true;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        try (PrintWriter out = new PrintWriter(new FileOutputStream("unavailable.csv"))) {
            out.println("15:01:30;15:02:32");
            out.println("15:10:30;23:12:32");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}