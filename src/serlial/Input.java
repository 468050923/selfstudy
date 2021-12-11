package serlial;

import java.io.*;

public class Input {
    public static void main(String[] args) throws Exception{
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Student"));
        Student stu = new Student("01", "张三", 04);
        oos.writeObject(stu);
        oos.flush();
        oos.close();
    }
}
