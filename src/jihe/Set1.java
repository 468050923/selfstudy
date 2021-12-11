package jihe;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Set1 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(5);
        hashSet.add(4);
        hashSet.add(9);
        hashSet.add(8);

        Iterator iterator = hashSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        ArrayList<Object> objects = new ArrayList<>();
    }
}
