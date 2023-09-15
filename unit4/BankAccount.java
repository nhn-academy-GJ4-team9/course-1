package org.example;

public class BankAccount {
    private String name;
    private String name2;

    private int account;
    BankAccount(String name,String name2){
        this.name=name;
        this.name2=name2;
        this.account=0;
    }

    public void deposit(int x){
        this.account+=x;
    }

    public String getName() {
        return name;
    }

    public String getName2() {
        return name2;
    }

    public int getAccount() {
        return account;
    }

    public void withdraw(int i) {
        this.account-=i;
    }
    public String toString(){
        return getName()+" "+getName2()+" "+getAccount();
    }

    public void borrow(BankAccount ba, int i) {
        ba.withdraw(i);
        this.account+=i;
    }
}
