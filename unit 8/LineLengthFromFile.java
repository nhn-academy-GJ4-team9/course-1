package unit8;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * filename.txt 파일에서 각 줄을 읽고, 각 줄의 길이를 출력하세요.
 * 예) "Hello" 라는 줄이 있다면 출력은 "Line length: 5" 가 됩니다.
 */

public class LineLengthFromFile {
    public static void main(String[] args) throws IOException {
        // 파일을 읽기 위한 FileReader 객체 생성
        FileInputStream fis = new FileInputStream("/Users/drakedog/Desktop/exxxxxx/src/main/java/unit8/test.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String line;
        int count = 0;
        line = br.readLine();
            for (int i = 0; i < line.length(); i++) {
                count++;
            }

        
        System.out.println("line length : " + count);

    }
}
