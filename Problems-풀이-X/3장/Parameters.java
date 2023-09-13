package com.introduction.unit3;

/*
    아래 코드의 변수 a의 메모리에서 변화와 출력결과를 확인하고 b와 같은 출력을 만들어주세요.
 */
public class Parameters{
  public static void changeValueS (String s) {
    s = s.concat("*");
  }

  public static void changeValueSB (StringBuffer sb) {
    sb.append("*");
  }

  public static void main(String[] args) {
    String a = "Hello";
    StringBuffer b = new StringBuffer("Ciao");

    System.out.println("String a = " + a);
    System.out.println("StringBuffer b = " + b);

    changeValueS(a);
    changeValueSB(b);

    System.out.println("String a = " + a);
    System.out.println("StringBuffer b = " + b);
  }
}
