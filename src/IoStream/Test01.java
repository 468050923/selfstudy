package IoStream;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        int readcount = 0;

        try {
            fis = new FileInputStream("F:\\Java\\输入输出流\\day.t xt");

            while (true) {
                byte[] bytes = new byte[10];
                readcount = fis.read(bytes);
                if (readcount == -1)
                    break;
                System.out.println(new String(bytes,0,readcount));
            }


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

