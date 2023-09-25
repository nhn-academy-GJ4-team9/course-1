package com.nhnacademy.exercise.chapter9;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    private static final String FILE_NAME = "exercise9_6";
    private static final int CHAR_LIMIT = 80;

    public static void main(String[] args) {
        int charCount = 0;
        try (FileReader reader = new FileReader(FILE_NAME + ".txt")) {
            int read = 0;

            while ((read = reader.read()) != -1) {
                charCount++;
            }
            if (charCount > CHAR_LIMIT) {
                throw new ExceptionLineTooLong("The strings is too long → " + charCount);
            }
        } catch (FileNotFoundException e) {
            e.getMessage();
            System.out.println("파일이 없거나 찾을수 없습니다.");
        } catch (IOException e) {
            e.getMessage();
            System.out.println("입력/출력이 잘 못되었습니다.");
        }
        System.out.println("The strings count → " + charCount);
    }
}

class ExceptionLineTooLong extends RuntimeException {

    ExceptionLineTooLong(String str) {
        super(str);
    }
}
