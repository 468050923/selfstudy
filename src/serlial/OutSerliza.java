package serlial;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class OutSerliza {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student"));
        Object obj = ois.readObject();
        System.out.println(obj);
        ois.close();
    }
}
