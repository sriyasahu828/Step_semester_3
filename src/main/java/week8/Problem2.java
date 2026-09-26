package main.java.week8;

import java.time.LocalDate;

abstract class LibraryItem {

    String title;

    LibraryItem(String title) {
        this.title = title;
    }

    abstract LocalDate getDueDate();
}

class Book extends LibraryItem {

    Book(String title) {
        super(title);
    }

    LocalDate getDueDate() {
        return LocalDate.of(2023,10,26).plusDays(14);
    }
}

class DVD extends LibraryItem {

    DVD(String title) {
        super(title);
    }

    LocalDate getDueDate() {
        return LocalDate.of(2023,10,26).plusDays(7);
    }
}

class Magazine extends LibraryItem {

    Magazine(String title) {
        super(title);
    }

    LocalDate getDueDate() {
        return LocalDate.of(2023,10,26).plusDays(3);
    }
}

public class Problem2 {

    public static void main(String[] args) {

        LibraryItem b = new Book("1984");
        LibraryItem d = new DVD("Matrix");
        LibraryItem m = new Magazine("Forbes");

        System.out.println(b.title + ": " + b.getDueDate());
        System.out.println(d.title + ": " + d.getDueDate());
        System.out.println(m.title + ": " + m.getDueDate());
    }
}