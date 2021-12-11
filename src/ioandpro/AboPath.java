package ioandpro;


public class AboPath {
    public static void main(String[] args) {
        String resource = Thread.currentThread().getContextClassLoader().getResource("classinfo2.properties").getPath();
        System.out.println(resource);
    }
}
