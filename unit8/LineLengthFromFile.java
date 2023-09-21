package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * filename.txt 파일에서 각 줄을 읽고, 각 줄의 길이를 출력하세요.
 * 예) "Hello" 라는 줄이 있다면 출력은 "Line length: 5" 가 됩니다.
 */

public class LineLengthFromFile {
    public static void main(String[] args) throws IOException {
        // 파일을 읽기 위한 FileReader 객체 생성
        FileReader f = new FileReader("filename.txt");

        BufferedReader br = new BufferedReader(f);

        String s;
        while ((s = br.readLine()) != null) {
            System.out.println("Line length: " + s.length());
        }

    }
}