package singleton;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SingletonSerializedTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Files.createDirectories(Paths.get("tmp"));

        SerializedSingleton instanceOne = SerializedSingleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("tmp/filename.ser"));
        out.writeObject(instanceOne);
        out.close();

        ObjectInput in = new ObjectInputStream(new FileInputStream("tmp/filename.ser"));
        SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
        in.close();

        System.out.println("instanceOne hashCode=" + instanceOne.hashCode());
        System.out.println("instanceTwo hashCode=" + instanceTwo.hashCode());
    }
}
