package gichang4;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


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
        FileReader f = new FileReader("test.txt");
        BufferedReader in = new BufferedReader(f);

        String line;
        while ((line = in.readLine()) != null) {
            String[] money = line.split(" ");
            sum += Integer.parseInt(money[1]);
        }


        return sum;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(solution("test.txt"));
    }
}
