package main.java.hw2week;

import java.util.Scanner;

public class InventoryCSVParser {

    public static void parseInventoryRecord(String csvLine) {

        String[] fields = csvLine.split(",");

        if (fields.length != 3) {
            System.out.println("Invalid Record");
            return;
        }

        System.out.println(
                "Product: " + fields[0] +
                " | SKU: " + fields[1] +
                " | Qty: " + fields[2]);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter CSV Record: ");
        String csv = sc.nextLine();

        parseInventoryRecord(csv);

        sc.close();
    }
}