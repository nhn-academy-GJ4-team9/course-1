package hyunjoong.org.example;

import java.nio.file.Paths;
import java.util.Scanner;
import javax.script.ScriptContext;

public class Main_Sbin03 {
    public static void main(String[] args) {
        //if - else를 이용해서 점수를 입력받아 학점을 출력하는 프로그램을 작성하세요.
        //90점 이상A,80점 이상B,70점 이상C,60점 이상D,그 외에는 F입니다.
        Scanner sc = new Scanner(System.in);
        System.out.println("점수를 입력 해주세요.");
        int n = sc.nextInt();
        sc.close();
        if (n >90){
            System.out.println("A");
        } else if (n >80){
            System.out.println("B");
        } else if (n >70){
            System.out.println("C");
        } else if(n >60){
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
