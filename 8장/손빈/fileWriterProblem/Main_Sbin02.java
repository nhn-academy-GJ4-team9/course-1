package sonbin4;

import java.io.*;

public class Main_Sbin02 {
  public static void main(String[] args) throws IOException {
    // test.txt 파일을 생성해서 그 파일에 "Hello world!" 라는 문자열을 입력하세요.
    FileWriter fileWriter = new FileWriter("test.txt");
    PrintWriter printWriter = new PrintWriter(fileWriter);
    printWriter.println("Hello world!");
    printWriter.close();
    fileWriter.close();
  }
}
