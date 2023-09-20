

public class Person {
    private String name;
    private String residence;

    public Person(String n, String r) {
        name = n;
        residence = r;
    }

    public String getName() {
        return name;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String newResidence) {
        residence = newResidence;
    }

    public void printData() {
        System.out.println(name + " "+ residence);
    }

}
