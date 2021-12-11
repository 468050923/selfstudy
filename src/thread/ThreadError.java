package thread;

public class ThreadError {
    public static void main(String[] args) throws InterruptedException {
        Account account = new Account("act01", 10000);

        AccountThread acd0 = new AccountThread(account);
        AccountThread acd1 = new AccountThread(account);

        acd0.start();
        acd1.start();

        Thread.sleep(1000);


    }
}


class AccountThread extends Thread {
    Account account;

    public AccountThread() {
    }

    public AccountThread(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public AccountThread setAccount(Account account) {
        this.account = account;
        return this;
    }

    @Override
    public void run() {
        synchronized (account){
            try {
                account.withdraw(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class Account {
    private String id;
    private double balance;

    public Account() {
    }

    public Account(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public Account setId(String id) {
        this.id = id;
        return this;
    }

    public double getBalance() {
        return balance;
    }

    public Account setBalance(double balance) {
        this.balance = balance;
        return this;
    }

    public void withdraw(double reduce) throws InterruptedException {
        double after;

            after = this.getBalance() - reduce;
//            Thread.sleep(1000);  //修改余额时延迟了,
            this.setBalance(after);

        System.out.println("当前余额："+this.getBalance());
    }
}

