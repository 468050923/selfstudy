package jihe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class Test01 {
    public static void main(String[] args) {
       Collection con =  new ArrayList();   //有序可重复
       con.add("adc");
       con.add("123");
       con.add('d');
       con.add(new Object());

        Iterator iterator = con.iterator();


        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
