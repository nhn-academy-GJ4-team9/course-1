package unit8;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_g {

    /**
     * test.txt 이라는 파일에 있는 사용자들이 가지고 있는 돈을 모두 더한 값을
     * 리턴 해주는 함수를 작성하시오
     *
     * @param filename 읽어올 파일 이름
     * @return 총 합계
     * @throws IOException
     */
    public static int solution(String filename) throws IOException {
        int sum = 0;
        FileInputStream fis = new FileInputStream("/Users/drakedog/Desktop/exxxxxx/src/main/java/unit8/test.txt");
        FileOutputStream fos = new FileOutputStream("test.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        

        String line;
        while ((line = br.readLine()) != null) {
            line = line.replaceAll("[^0-9]", "");
            sum += Integer.parseInt(line);            

        }
        return sum;
    }

    public static void main(String[] args) throws IOException {

        System.out.println(solution("test.txt"));
    }
}
