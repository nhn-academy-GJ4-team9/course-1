package com.exam;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileRead {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("file.txt")))) {
            br.read();      // -1 -> 파일의 끝 (EOF) End of File
            br.readLine();  // 파일의 끝 -> null

            int len;
            char[] buf = new char[2048];
            while ((len = br.read(buf)) != -1) {
                sb.append(buf, 0, len);

            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        String string = sb.toString();

        string.replaceAll(" ", "");
    }
}
