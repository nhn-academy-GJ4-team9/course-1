package hyunjoong.org.example;

//TODO : a와 b를 비교하여 결과를 예측하세요. 보다 정확한 결과를 얻을 방법을 추가해주세요.
public class Main_hyunjoong01 {
    public static void main(String[] args) {
        double a = 0.1 + 0.2;
        double b = 0.3;
        boolean absValue = Math.abs(a-b) <= Math.pow(10,-14);
        if (absValue) {
            System.out.println("a와 b는 같다");
        } else if (a < b) {
            System.out.println("a는 b보다 작다");
        } else {
            System.out.println("a는 b보다 크다");
        }
    }
}