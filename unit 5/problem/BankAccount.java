package hyunjoong.org.example;

import java.util.Objects;

public class BankAccount {
    private String name, surname;


    public BankAccount(String name, String surname){
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
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return  true;
        }
        if(!(o instanceof BankAccount)){
            return  false;
        }

        BankAccount bankAccount = (BankAccount) o;
        return Objects.equals(name,bankAccount.name) && Objects.equals(surname,bankAccount.surname);
    }
}
