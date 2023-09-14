public class BCNTextbook extends Book {
    private String faculty;

    public BCNTextbook(String title, String authors, String faculty) {
        super(title, authors);
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }
    public void printBook() {
        super.printBook();
        System.out.println("Faculty: " + faculty);
    }
}
