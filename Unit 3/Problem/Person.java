

abstract class Person {
    private final String name;
    private final String registrationNumber;

    public Person(String name, String registrationNumber) {
        this.name = name;
        this.registrationNumber = registrationNumber;
    }

    public String getName() {
        return name;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String toString() {
        return getName() + " " + getRegistrationNumber();
    }
}
