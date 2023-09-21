package com.nhnacademy.problems.chapter8.김혁진;

import java.io.*;

/**
 * filename.txt 파일에서 각 줄을 읽고, 각 줄의 길이를 출력하세요.
 * 예) "Hello" 라는 줄이 있다면 출력은 "Line length: 5" 가 됩니다.
 */

public class LineLengthFromFile {
    private static final String FILE_NAME = "exercise9_6"; // 대충 있는 파일의 이름을 가져다 사용함.

    public static void main(String[] args) throws IOException {
        int count = 0;
        FileReader reader = null;
        try {
            reader = new FileReader(FILE_NAME + ".txt");

            int read = 0;
            while ((read = reader.read()) != -1) {
                count++;
            }
        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (IOException e) {
            e.getMessage();
        } finally {
            reader.close();
        }

        System.out.println("Character Counts: " + count);
    }
}
