package ru.job4j.io;

import java.io.*;

public class Analyze {
    public void unavailable(String source, String target) {
        try (BufferedReader in = new BufferedReader(new FileReader(source));
        PrintWriter out = new PrintWriter(new FileOutputStream(target))) {
            boolean status200 = true;
            while (in.ready()) {
                String notice = in.readLine();
                String[] data = notice.split(" ");
                int startStatus = Integer.parseInt(data[0]);
                String startDate = data[1];
                if ((startStatus == 400 || startStatus == 500) && status200) {
                    out.println(startDate + ";");
                    status200 = false;
                } else if ((startStatus == 200 || startStatus == 300) && !status200) {
                    out.println(startDate + ";");
                    status200 = true;
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