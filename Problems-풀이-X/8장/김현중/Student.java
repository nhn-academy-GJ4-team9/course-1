

public class Student extends Person {

    private String faculty;

    public Student(String n, String r, String faculty) {
        super(n, r);
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    public void printName() {
        System.out.println(this.getName());
    }

    public void printData() {
        System.out.println(this.getName() + " " + this.getResidence() + " " + faculty);
    }


}
