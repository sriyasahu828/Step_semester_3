package main.java.hw8week;

import java.util.*;

abstract class Vehicle {
    int hours;

    Vehicle(int hours) {
        this.hours = hours;
    }

    abstract double charge();
}

class Bike extends Vehicle {

    Bike(int h) {
        super(h);
    }

    double charge() {
        return hours * 10;
    }
}

class Car extends Vehicle {

    Car(int h) {
        super(h);
    }

    double charge() {
        return 30 + ((hours - 1) * 20);
    }
}

class Truck extends Vehicle {

    Truck(int h) {
        super(h);
    }

    double charge() {
        return Math.max(100, hours * 50);
    }
}

public class Problem2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double total = 0;

        for (int i = 0; i < n; i++) {

            String type = sc.next();
            int hrs = sc.nextInt();

            Vehicle v;

            if (type.equals("BIKE"))
                v = new Bike(hrs);
            else if (type.equals("CAR"))
                v = new Car(hrs);
            else
                v = new Truck(hrs);

            double charge = v.charge();
            total += charge;

            System.out.printf("%s: %.2f%n", type, charge);
        }

        System.out.printf("Total: %.2f%n", total);
    }
}