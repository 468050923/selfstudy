package javase;

public class Customer {
    public static void main(String[] args) {
        Cuscmomer cuscmomer = new Cuscmomer("张三");
        System.out.println(cuscmomer.getName());
    }
}


class Cuscmomer{
    String name;
    public Cuscmomer(){
    }
    public Cuscmomer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
