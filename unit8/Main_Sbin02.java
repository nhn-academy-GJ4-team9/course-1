package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main_Sbin02 {
    public static void main(String[] args) throws IOException {
        // test.txt 파일을 생성해서 그 파일에 "Hello world!" 라는 문자열을 입력하세요.


        FileWriter f = new FileWriter("test.txt");
        PrintWriter out = new PrintWriter(f);

// 2. writing text on the file
        out.println("Hello world!");

// 3. closing the output channel and the file
        out.close();
        f.close();


    }
}