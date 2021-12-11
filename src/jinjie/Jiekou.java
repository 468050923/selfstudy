package jinjie;
/*实现继承和接口*/
public class Jiekou {
    public static void main(String[] args) {
        B b =  new Test();
        b.sub();

        A a = new Test();
        a.sum();
    }

}

class Test extends B implements A{

    @Override
    public void sum() {
        System.out.println("jiekou");
    }

    @Override
    void sub() {
        System.out.println("jichengleB");
    }
}

interface A{
    String id = null;
    String name = null;
    void sum();
}

class B{

    void sub(){

    }
}


