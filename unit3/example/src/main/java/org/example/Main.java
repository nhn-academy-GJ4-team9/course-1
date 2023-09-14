package org.example;

import java.util.Scanner;
import org.ietf.jgss.GSSContext;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        String title= scanner.next();
//        String author=scanner.next();
//
//        Book book = new Book(title,author);
//
//        String title2= scanner.next();
//        String author2 = scanner.next();
//
//        Book book2 = new Book(title2,author2);
//
//        System.out.println(book.getTitle()+" "+book.getAuthor());
//        System.out.println(book2.getTitle()+" "+book2.getAuthor());
//
//        int price;
//        price=scanner.nextInt();
//        book.setPrice(price);
//
//        System.out.println(book.getPrice());


        UnivercityTextBook firstbook = new UnivercityTextBook("herru potter","gichang","math","hyun");
        System.out.println(firstbook);

        Book secondbook = new Book("namu","gichang");

        TailBook thirdbook = new TailBook(secondbook.getTitle(),secondbook.getAuthor(),"novel");

        System.out.println(secondbook);
        System.out.println(thirdbook);

        firstbook.setPrice(1000);

        System.out.println(firstbook);
        scanner.close();


    }
}