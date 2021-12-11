package IoStream;

import java.io.*;

public class PrintOut {
    public static void main(String[] args) throws IOException {
        UserXulieHua userXulieHua = new UserXulieHua("mike", true, "4680.com", "侍庄街道");
        FileOutputStream fileOutputStream = new FileOutputStream("text.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(userXulieHua);
        objectOutputStream.flush();

        objectOutputStream.close();

    }
}


class ObjectOutpr {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("text.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Object object = objectInputStream.readObject();
            UserXulieHua object1 = (UserXulieHua) object;
            objectInputStream.close();
            System.out.println(object1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {

        }
    }
}