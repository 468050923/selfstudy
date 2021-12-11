package jinjie;
import com.beijingpowernode.javase.helloworld.Helloworld;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name= "我爱你";
        String name1= "我爱你";
        System.out.println(name==name1);
            //垃圾回收

        for (int i = 0; i < 500000; i++) {
            Over over = new Over();
            over= null;
        }

 
    }
}


class Over{
    String name;
    @Override
    protected void finalize() throws Throwable {
        System.out.println("我结束了");
    }

}
