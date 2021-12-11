package jihe;

import java.util.TreeSet;

public class Tree {
    public static void main(String[] args) {
        user user = new user();
        user user1 = new user();
        user user2 = new user();
        user user3 = new user();
        user user4 = new user();

        TreeSet<Object> objects = new TreeSet<>();
        objects.add(user);
        objects.add(user1);
        objects.add(user2);
        objects.add(user3);
        objects.add(user4);
    }
}


class user{
    String name;

}