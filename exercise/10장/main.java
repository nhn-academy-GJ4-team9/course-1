package ex10;

public class main {

    public static int ackermann(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return ackermann(m - 1, 1);
        } else if (m > 0 && n > 0) {
            return ackermann(m - 1, ackermann(m, n - 1));
        } else {
            throw new IllegalArgumentException("양수를 입력하세요");
        }
    }

    public static void main(String[] args) {
        System.out.println(ackermann(1, 2));
    }
}
