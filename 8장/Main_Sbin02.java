package org.example;

import java.io.*;

public class Main_Sbin02 {
  public static void main(String[] args) throws IOException {
    FileWriter f = new FileWriter("test.txt");
    PrintWriter out = new PrintWriter(f);

    out.println("Hello World!!");

    out.close();
    f.close();
  }
}
