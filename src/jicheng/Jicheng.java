package jicheng;

import javax.xml.namespace.QName;
import java.util.ArrayList;

public class Jicheng {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        Animal cat = new Cat();
        cat=null;
        cat.run();
    }
}


class Animal{
    public String name;
    public void run(){

    }
}

class Cat extends Animal{

}