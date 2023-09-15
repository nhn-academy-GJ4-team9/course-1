public class Child {
    private Parents parents;

    public Child() {
        Parents parents = new Parents();
        parents.createParents();
        System.out.println("Child Class 생성");
    }
}
