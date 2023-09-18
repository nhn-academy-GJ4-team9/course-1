package hyeonjunh;

public class Main_hyunjoong01 {
    public static void main(String[] args) {
        String line = "babab";


        boolean isPalindrome = true;
        isPalindrome = solution(line);
        // 문제 : 거꾸로 해도 같은 문자를 회문이라고 합니다.
        // 문자열을 입력받아 회문인지 아닌지 판별하는 기능을 구현해주세요.
        if (isPalindrome) {
            System.out.println("입력한 문자열은 회문입니다.");
        } else {
            System.out.println("입력한 문자열은 회문이 아닙니다");
        }
    }

    public static boolean solution(String ss) {
        StringBuffer sb = new StringBuffer(ss);
        String revereString = sb.reverse().toString();
        if (ss.equals(revereString)) {
            return true;
        } else {
            return false;
        }

    }
}