package IoStream;

import javax.swing.*;
import java.io.*;

public class Filechar {
    public static void main(String[] args) {
        FileReader fis = null;
        int readcount = 0;

        try {
            fis = new FileReader("F:\\Java\\输入输出流\\day.txt");
            char[] chars = new char[100];
            fis.read(chars);
            System.out.println(chars);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

