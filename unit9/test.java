package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("test.txt"));
        String str="";


        List<String> lines = Files.readAllLines(Paths.get("test.txt"));

        System.out.println(lines);


        char[] cbuf = new char[100];

        br.read(cbuf,0,100);

        System.out.println(Arrays.toString(cbuf));

    }
}

