package jihe;

public class FanXing {
    public static void main(String[] args) {
        Grenn<String> grenn = new Grenn();
        grenn.ssd("123213");
    }
}

/*创建对象的时候泛型可以省略，一旦泛型被声明，方法里面的参数必须使用那种类型*/
class Grenn<Q>{
    public Grenn() {
    }

    public void ssd(Q q){
        System.out.println(q);
    }
}