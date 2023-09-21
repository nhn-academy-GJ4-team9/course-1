package com.nhnacademy.problems.chapter8.박기창;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

        try (FileInputStream stream = new FileInputStream(filename);
                BufferedReader reader = new BufferedReader(new InputStreamReader(stream))) {

            String line = "";
            while ((line = reader.readLine()) != null) {
                String[] tmps = line.split(" ");
                sum += Integer.parseInt(tmps[1]);
            }
        } catch (FileNotFoundException e) {
            e.getMessage();
            System.out.println("File ?");
        } catch (IOException e) {
            e.getMessage();
            System.out.println("IO ?");
        }

        return sum;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(solution("test.txt"));
    }
}