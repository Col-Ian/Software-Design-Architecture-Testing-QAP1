package com.qap1;

public class Account {
    private String id;
    private String name;
    private int balance = 0;

    public Account(String i, String n){
        this.id = i;
        this.name = n;
    }

    public Account(String i, String n, int b){
        this.id = i;
        this.name = n;
        this.balance = b;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int add){
        balance = this.balance+add;
        return balance;
    }

    public int debit(int amount){
        if (amount <= this.balance){
            balance = this.balance-amount;
        } else{
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public int transferTo(Account transf, int amount){
        if (amount<= this.balance){
            this.debit(amount);
            transf.credit(amount);
            System.out.println("Transfer complete. $"+amount+" transferred to "+transf.name+".");
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public String toString(){
        return ("ID: "+this.id+ " Name: "+this.name+" Balance: $"+this.balance);
    }
}
