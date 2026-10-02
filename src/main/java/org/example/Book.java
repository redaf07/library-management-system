package org.example;

import java.util.Scanner;

 public class Book {
    String title;
    String author;
    long ISBN;
    Book(String title, String author, long ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        String author = sc.nextLine();
        long ISBN = sc.nextLong();
        Book b = new Book(title,author,ISBN);
        System.out.println("Book details:");
        System.out.println("Title of the book :"+b.title);
        System.out.println("Author of the book : "+b.author);
        System.out.println("ISBN Number :"+b.ISBN);
        sc.close();
    }




}
