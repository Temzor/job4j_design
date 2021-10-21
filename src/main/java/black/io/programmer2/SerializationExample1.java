package black.io.programmer2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class SerializationExample1 {
    public static void main(String[] args) {
        ArrayList<String> employees;
        try (ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream("employees1.bin"))) {
            employees = (ArrayList) inputStream.readObject();
            System.out.println(employees);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
