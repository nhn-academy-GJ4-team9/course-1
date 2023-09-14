public class Novel extends Book {
    private String type;

    public Novel(String title, String authors, String type) {
        super(title, authors);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void printBook() {
        super.printBook();
        System.out.println("Type: " + type);
    }
}
