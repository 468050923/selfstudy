package jihe;

import java.util.*;

public class Maps {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        int a = 128;
        int b = 128;
        map.put(1,a);
        map.put(1,b);
        map.put(3,1);
        Collection<Integer> values = map.values();
        Iterator<Integer> iterator1 = values.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        System.out.println(map.values());

        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<Integer, Integer>> iterator = entries.iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer, Integer> next = iterator.next();
            System.out.println(next.getKey());
            System.out.println(next.getValue());

        }


    }
}
