package javase;

public class S {
    public static void main(String[] args) {
        Se.p("我爱你");
        Se s = new Se();
        System.out.println(s.a);
    }

}


class Se {
    int a = 0;

    static void p(String s) {
        System.out.println(s);
    }

    public static void p(int s) {
        System.out.println(s);
    }

    public static void p(float s) {
        System.out.println(s);
    }

    public static void p(double s) {
        System.out.println(s);
    }

    public static void p(boolean s) {
        System.out.println(s);
    }
}
