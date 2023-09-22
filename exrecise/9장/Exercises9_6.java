package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ExceptionLineTooLong extends Exception {
    public ExceptionLineTooLong(String message) {
        super(message);
    }
}

public class Exercises9_6 {
    public static void main(String[] args) {
        String fileName = "test.txt"; // 파일 이름을 지정하세요.

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            int lineCount = 0;

            while ((line = reader.readLine()) != null) {
                lineCount++;
                if (line.length() > 80) {
                    throw new ExceptionLineTooLong("Line " + lineCount + ": 문자열이 너무 깁니다");
                }
            }

            System.out.println("파일 내 모든 라인의 길이가 80자 이하입니다.");
        } catch (IOException e) {
            System.err.println("파일을 열거나 읽는 중에 오류가 발생했습니다: " + e.getMessage());
        } catch (ExceptionLineTooLong e) {
            System.err.println(e.getMessage());
        }
    }
}
