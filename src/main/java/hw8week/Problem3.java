package main.java.hw8week;

import java.util.*;

abstract class Room {
    int units;

    Room(int units) {
        this.units = units;
    }

    abstract double bill();
}

class SingleRoom extends Room {

    SingleRoom(int units) {
        super(units);
    }

    double bill() {
        return units * 8;
    }
}

class SharedRoom extends Room {

    int occupants;

    SharedRoom(int units, int occupants) {
        super(units);
        this.occupants = occupants;
    }

    double bill() {
        return (units * 6.0) / occupants;
    }
}

class AcRoom extends Room {

    AcRoom(int units) {
        super(units);
    }

    double bill() {
        return (units * 10) + 200;
    }
}

public class Problem3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double total = 0;

        for (int i = 0; i < n; i++) {

            String type = sc.next();
            Room r;

            if (type.equals("SINGLE")) {

                int units = sc.nextInt();
                r = new SingleRoom(units);

            } else if (type.equals("SHARED")) {

                int units = sc.nextInt();
                int occ = sc.nextInt();
                r = new SharedRoom(units, occ);

            } else {

                int units = sc.nextInt();
                r = new AcRoom(units);
            }

            double bill = r.bill();
            total += bill;

            System.out.printf("%s: %.2f%n", type, bill);
        }

        System.out.printf("Total: %.2f%n", total);
    }
}