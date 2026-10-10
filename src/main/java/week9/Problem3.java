package main.java.week9;

import java.util.Scanner;

abstract class LibraryItem {
    String title;
    int daysLate;

    LibraryItem(String title, int daysLate) {
        this.title = title;
        this.daysLate = daysLate;
    }

    abstract double calculateFine();
}

class Book extends LibraryItem {
    Book(String title, int daysLate) {
        super(title, daysLate);
    }

    @Override
    double calculateFine() {
        return daysLate * 2.0;
    }
}

class DVD extends LibraryItem {
    DVD(String title, int daysLate) {
        super(title, daysLate);
    }

    @Override
    double calculateFine() {
        return Math.min(daysLate * 5.0, 50.0);
    }
}

class Magazine extends LibraryItem {
    Magazine(String title, int daysLate) {
        super(title, daysLate);
    }

    @Override
    double calculateFine() {
        return daysLate;
    }
}

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        LibraryItem[] items = new LibraryItem[n];

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String title = sc.next();
            int daysLate = sc.nextInt();

            switch (type) {
                case "BOOK":
                    items[i] = new Book(title, daysLate);
                    break;
                case "DVD":
                    items[i] = new DVD(title, daysLate);
                    break;
                case "MAGAZINE":
                    items[i] = new Magazine(title, daysLate);
                    break;
            }
        }

        double total = 0;

        for (LibraryItem item : items) {
            double fine = item.calculateFine();
            total += fine;

            System.out.printf("%s: %.2f%n", item.title, fine);
        }

        System.out.printf("Total Fines: %.2f%n", total);
        sc.close();
    }
}