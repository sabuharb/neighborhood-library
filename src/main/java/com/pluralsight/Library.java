package com.pluralsight;

public class Library {
    private Book[] books;

    public Library() {

        books = new book[20];


        books[0] = new Book((1, "123456789", "Joseph The Llama");
        books[1] = new Book(2, "987654321", "Safi The Sleeping King");

    }


    public void ShowAvailableBooks() {
        for (Book book : books) {
            if (!book.isCheckedOut()) {
                System.out.println("ID: " + book.getId() + ", Title: " + book.getTitle());
            }
        }
    }


    public void showCheckedOutBooks() {
        for (Book book : books) {
            if (book.getId() == bookID && book.isCheckedOut()) {
                book.checkIn();
                System.out.println("Book checked in: " + book.getTitle());
                return;;
            }
        }
        System.out.println("Book not found or not checked out.");
    }
}
