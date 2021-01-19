package com.company.classstructureconstructors;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Asimov", "Foundation");
        book.register("DC16d-iq");
        System.out.println(book.getAuthor() + ": " + book.getTitle() + " " + book.getRegNumber());
        System.out.println(book);
    }
}
