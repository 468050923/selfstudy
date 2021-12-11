package jicheng;

import java.util.Objects;

public class Account {
    private String id;
    private double balance;

    public Account() {
    }

    public Account setId(String id) {
        this.id = id;
        return this;
    }

    public Account(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public Account setBalance(double balance) {
        this.balance = balance;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Double.compare(account.balance, balance) == 0 && Objects.equals(id, account.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, balance);
    }
}
