package jinjie;

public class NiMing {
    public static void main(String[] args) {
        Med med = new Med();
        med.sum(new Compute() {
            @Override
            public void sum(int a, int b) {
                System.out.println(a+b);
            }
        }, 100, 200);
    }
}


interface Compute{
    void sum(int a,int b);
}


class Med{
    int a;
    int b;
    Compute c;
    public Med() {
    }

    public void sum(Compute c,int a ,int b){
        c.sum(a,b);
    }
}