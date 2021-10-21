package black.io.programmer2;

import black.io.programmer1.Employee;

import java.io.*;

public class SerializationExample2 {
    public static void main(String[] args) {
        Employee bestEmployee;
        try (ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream("employees2.bin"))) {
            bestEmployee = (Employee) inputStream.readObject();
            System.out.println(bestEmployee);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
