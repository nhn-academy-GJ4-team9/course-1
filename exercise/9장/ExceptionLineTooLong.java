package org.example;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
https://www.inf.unibz.it/~calvanese/teaching/04-05-ip/lecture-notes/uni09/node26.html
ex9.6
 */

public class ExceptionLineTooLong extends Exception {

    public ExceptionLineTooLong(String message) {
        super(message);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("test.txt"));

            int count = 0;
            String s;
            while ((s = br.readLine()) != null) {
                count += s.length();
            }
            test(count);

        } catch (ExceptionLineTooLong e) {
            System.out.println(e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            br.close();
        }
    }

    private static void test(int count) throws ExceptionLineTooLong {

        if (count > 79) {
            throw new ExceptionLineTooLong("The strings is too long");

        }
    }
}
