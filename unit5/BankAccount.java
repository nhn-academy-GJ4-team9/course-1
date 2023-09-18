package org.example;

import java.util.Objects;

public class BankAccount {
    private String name, surname;
    private double balance;

    public BankAccount(String name,String surname){
        this.name=name;
        this.surname=surname;
        this.balance=0;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double val) {
        if (val <= balance)
            balance -= val;
        else
            System.out.println("Not sufficient money for withdrawal");
    }

    public boolean sameOwner(BankAccount ba) {
        return this.name.equals(ba.name) &&
                this.surname.equals(ba.surname);
    }

    public void transferTo (BankAccount ba, double val) {
        if (val <= this.balance) {
            this.withdraw(val);
            ba.deposit(val);
        } else
            System.out.println("It is not possible to withdraw " + val +
                    " Euro from account " + this);
    }

    public void transferFrom (BankAccount ba, double val) {
        if (val <= ba.balance) {
            ba.withdraw(val);
            this.deposit(val);
        } else
            System.out.println("It is not possible to withdraw " + val +
                    " Euro from account " + ba);
    }

    public void deposit(double val) {
        this.balance+=val;
    }

    public String toString(){
        return getName()+" "+getSurname()+" "+getBalance();
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof BankAccount){
            BankAccount test=(BankAccount)o;

            return this.name.equals(test.getName()) && this.getSurname().equals(test.getName());
        }
        else{
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, balance);
    }
}
