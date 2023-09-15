package org.example;

public class TestBankAccount {
    public static void main (String[] args) {
        BankAccount ba = new BankAccount("Mario", "Rossi");
        BankAccount ba2 = new BankAccount("Mario2", "Rossi2");
        System.out.println("Before the operations: " + ba);
        System.out.println("Before the operations: " + ba2);
        ba.deposit(1000);
        ba.withdraw(100);
        System.out.println("After the operations:  " + ba);
        System.out.println("After the operations:  " + ba2);
        ba2.borrow(ba,100);
        System.out.println("After the operations:  " + ba);
        System.out.println("After the operations:  " + ba2);

    }
}
