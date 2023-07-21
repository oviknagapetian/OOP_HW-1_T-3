package org.example;

// File: Main.java
public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Мастер и Маргарита", "Михаил Булгаков");
        Book book2 = new Book("1984", "Джордж Оруэлл");
        Book book3 = new Book("Маленький принц", "Антуан де Сент-Экзюпери");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        book1.setAvailable(false);

        library.displayAvailableBooks();

        library.searchByAuthor("Михаил Булгаков");
    }
}
