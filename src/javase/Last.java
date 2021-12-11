package javase;

public class Last {
    public static void main(String[] args) {
        Hus hus = new Hus(111, "张三", "1012", null);
        Wife wife = new Wife(111, "张三", "1012", hus);
    }
}


class Hus {
    private int id;
    private String name;
    private String brith;
    private Wife wife = null;

    public Hus() {
    }

    public Hus(int id, String name, String brith, Wife wife) {
        this.id = id;
        this.name = name;
        this.brith = brith;
        this.wife = wife;
    }
}

class Wife {
    int id;
    String name;
    String birth;
    Hus hus = null;

    public Wife(int id, String name, String birth, Hus hus) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.hus = hus;
    }

    public Wife() {

    }

}