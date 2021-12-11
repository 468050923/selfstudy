package javase;

public class DiGui {
    public static void main(String[] args) {
        System.out.println(sum(4));
    }

    public static int sum(int x){
        if (x==1)
            return 1;
        else
        return x+sum(x-1);
    }
}
