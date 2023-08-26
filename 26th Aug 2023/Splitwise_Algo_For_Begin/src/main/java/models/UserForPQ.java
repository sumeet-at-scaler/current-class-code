package models;

import java.util.PriorityQueue;

public class UserForPQ implements Comparable<UserForPQ> {
    private String name;
    private int balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public UserForPQ(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    @Override
    public int compareTo(UserForPQ o) {
        return o.balance - this.balance;
    }
}
