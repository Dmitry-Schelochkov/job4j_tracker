package ru.job4j.pojo;

import java.sql.SQLOutput;

public class Library {
    public static void main(String[] args) {
        Book one = new Book("Head first java", 500);
        Book two = new Book("Java. Полное руководство", 600);
        Book three = new Book("Java. Библиотека профессионала", 300);
        Book four = new Book("Clean code", 400);
        Book[] books = new Book[4];
        books[0] = one;
        books[1] = two;
        books[2] = three;
        books[3] = four;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " - " + book.getPage());
        }
        System.out.println("Castling one to four");
        Book temp = one;
        books[0] = four;
        books[3] = temp;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " - " + book.getPage());

        }
        System.out.println("Only Clean Code");
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if ("Clean code".equals(book.getName())) {
                System.out.println(book.getName() + " - " + book.getPage());
            }
        }
    }
}
