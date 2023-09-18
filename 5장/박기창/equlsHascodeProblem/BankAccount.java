package gichang;


import java.util.Objects;

public class BankAccount {
    private String name, surname;

    public BankAccount(String name,String surname){
        this.name=name;
        this.surname=surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return Objects.equals(name, that.name) && Objects.equals(surname, that.surname);
    }
}
