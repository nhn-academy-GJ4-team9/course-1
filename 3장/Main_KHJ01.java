public class Main_KHJ01 {
    public static String changeValueS(String s) {
        s = s.concat("*");
        return s;
    }

    public static void changeValueSB(StringBuilder sb) {
        sb.append("*");
    }

    public static void main(String[] args) {
        String a = "Hello";
        StringBuilder b = new StringBuilder("Ciao");

        System.out.println("String a = " + a);
        System.out.println("StringBuilder b = " + b);

        a = changeValueS(a);
        changeValueSB(b);

        System.out.println("String a = " + a);
        System.out.println("StringBuilder b = " + b);
    }
}