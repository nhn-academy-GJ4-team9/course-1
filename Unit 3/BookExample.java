package com.introduction.unit3;

import java.util.Arrays;
import java.util.Scanner;

public class BookExample {
    public static void main(String[] args) {
        // Book book = new Book(input[0], input[1], Integer.parseInt(input[2]));
        // book.printBookPrice();
        // input = sc.nextLine().split(" ");
        // Book book2 = new Book(input[0], input[1], Integer.parseInt(input[2]));
        // book2.printBookPrice();
        // System.out.println(book.getPrice());
        // book.setPrice(Integer.parseInt(sc.nextLine()));
        // book.printBookPrice();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("제목, 저자, 가격, 코스, 시설");
        String str = "";
        str = sc.nextLine();
        String[] input = str.split(" ");
        

        UniTextBook uniTextBook = new UniTextBook(input[0], input[1], Integer.parseInt(input[2]), input[3], input[4]);
        System.out.println(uniTextBook.toString());

        String[] input2 = sc.nextLine().split(" ");
        System.out.println("제목, 저자 , 가격");
        Book book = new Book(input2[0], input2[1], Integer.parseInt(input2[2]));
        String[] input3 = sc.nextLine().split(" ");
        System.out.println("제목, 저자, 가격 , 장르");
        Novels novels = new Novels(input3[0], input3[1], Integer.parseInt(input3[2]), input3[3]);
        book.printBookPrice();
        novels.printBookInfo();

        System.out.println(uniTextBook.getPrice());
        System.out.println("가격 수정");
        uniTextBook.setPrice(sc.nextInt());
        uniTextBook.printBookInfo();

    }

}
