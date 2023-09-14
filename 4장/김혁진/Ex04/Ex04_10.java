/**
 * Exercise 04.10 Write a method with header
 */
public class Ex04_10 {
    public static char lastCharacter(String s){
        return s.charAt(s.length()-1);
    }

    public static void main(String[] args) {
        System.out.println(lastCharacter("asd"));
    }

}
