package ioandpro;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class IoAndPro {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("info");
        Properties properties = new Properties();
        properties.load(fileReader);

        properties.forEach((key1, value1) -> {
            System.out.println(key1 + "：" + value1);
        });

        for (Map.Entry<Object, Object> entry:properties.entrySet()) {
            System.out.println(entry.getValue());
        }
//        Set<Object> objects = properties.keySet();
//        for (Object obj:objects){
//            System.out.println("key:"+obj+"  "+"value:"+properties.get(obj) );
//        }
    }
}
