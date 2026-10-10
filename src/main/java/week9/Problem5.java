package main.java.week9;

import java.util.Scanner;

abstract class TravelBooking {
    double distance;
    static final double BOOKING_FEE = 50.0;

    TravelBooking(double distance) {
        this.distance = distance;
    }

    abstract double calculateBaseFare();

    double calculateTotal() {
        return calculateBaseFare() + BOOKING_FEE;
    }
}

class Bus extends TravelBooking {
    Bus(double distance) {
        super(distance);
    }

    @Override
    double calculateBaseFare() {
        return distance * 2.0;
    }
}

class Train extends TravelBooking {
    Train(double distance) {
        super(distance);
    }

    @Override
    double calculateBaseFare() {
        return distance * 1.5;
    }
}

class Flight extends TravelBooking {
    Flight(double distance) {
        super(distance);
    }

    @Override
    double calculateBaseFare() {
        return 2500 + distance * 4.0;
    }
}

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        TravelBooking[] bookings = new TravelBooking[n];
        String[] modes = new String[n];

        for (int i = 0; i < n; i++) {
            modes[i] = sc.next();
            double distance = sc.nextDouble();

            switch (modes[i]) {
                case "BUS":
                    bookings[i] = new Bus(distance);
                    break;
                case "TRAIN":
                    bookings[i] = new Train(distance);
                    break;
                case "FLIGHT":
                    bookings[i] = new Flight(distance);
                    break;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.printf(
                "%s: %.2f%n",
                modes[i],
                bookings[i].calculateTotal()
            );
        }

        sc.close();
    }
}