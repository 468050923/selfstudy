package yichang;

public class Excep {

    public static void main(String[] args) {
        try {
            doSome();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void doSome() throws ClassNotFoundException {
        System.out.println("dosome");
        throw new ClassNotFoundException("没找到相关类");
    }
}


