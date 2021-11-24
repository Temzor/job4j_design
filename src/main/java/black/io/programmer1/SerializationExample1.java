package black.io.programmer1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializationExample1 {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();
        employees.add("Dmitrii");
        employees.add("Ivan");
        employees.add("Elena");

        try (ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("employees1.bin"))) {
            outputStream.writeObject(employees);
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
