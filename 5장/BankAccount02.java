package org.example;


public class BankAccount02 {
    private String name, surname;

    public BankAccount02(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    @Override
    public boolean equals(Object i) {
        if (this == i)
            return true;
        if (i == null)
            return false;
        if (getSurname() != getName()) {
            return true;
        }
        return false;
    }
}