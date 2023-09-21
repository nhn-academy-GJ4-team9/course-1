package com.nhnacademy.problems.chapter8.손빈;

import java.io.*;

public class Main_Sbin02 {
    private static final String FILE_NAME = "test2";
    private static final String CONTENT = "Hello world!";

    public static void main(String[] args) throws IOException {
        // test.txt 파일을 생성해서 그 파일에 "Hello world!" 라는 문자열을 입력하세요.
        try (FileWriter writer = new FileWriter(FILE_NAME + ".txt")) {
            writer.append(CONTENT);
        } catch (FileNotFoundException e) {
            e.getMessage();
            System.out.println("File ?");
        } catch (IOException e) {
            e.getMessage();
            System.out.println("IO ?");
        }
    }
}