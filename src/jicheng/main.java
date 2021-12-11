package jicheng;

public class main {
    public static void main(String[] args) {
        Credit credit = new Credit();
        System.out.println(credit.getDay());
        System.out.println(credit.equals(credit));
        System.out.println(credit.getClass());

        Account account = new Account();
        Account account1 = new Account();
        account.getId();

        if (10>5){
            System.out.println("1");
        }else {
            System.out.println("22");
        }

        System.out.println(account.equals(account1));

    }
}
