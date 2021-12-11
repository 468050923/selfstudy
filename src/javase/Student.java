package javase;

public class Student {
    public static void main(String[] args) {
        Student1 student = new Student1();
        student.setName("张小丽");
        System.out.println(student.getName());
    }
}

class Student1 {
    private int num;
    private String name;
    private long id;

    public int getNum() {
        return num;
    }


    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void study() {
        System.out.println("会学习");
    }


}
