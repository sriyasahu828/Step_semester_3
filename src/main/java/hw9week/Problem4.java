package main.java.hw9week;

import java.util.Scanner;

abstract class Cab {
    double distance;
    static final double MIN_FARE = 100.0;

    Cab(double distance) {
        this.distance = distance;
    }

    abstract double calculateBaseFare();

    double calculateFare(boolean night) {
        double fare = Math.max(calculateBaseFare(), MIN_FARE);

        if (night) {
            fare *= 1.20;
        }

        return fare;
    }
}

interface NightService {
    // Marks cabs that support night service.
}

class Mini extends Cab {
    Mini(double distance) {
        super(distance);
    }

    @Override
    double calculateBaseFare() {
        return distance * 10;
    }
}

class Sedan extends Cab implements NightService {
    Sedan(double distance) {
        super(distance);
    }

    @Override
    double calculateBaseFare() {
        return distance * 14;
    }
}

class SUV extends Cab implements NightService {
    SUV(double distance) {
        super(distance);
    }

    @Override
    double calculateBaseFare() {
        return distance * 18;
    }
}

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Cab[] cabs = new Cab[n];
        String[] types = new String[n];
        String[] times = new String[n];

        for (int i = 0; i < n; i++) {
            types[i] = sc.next();
            double distance = sc.nextDouble();
            times[i] = sc.next();

            switch (types[i]) {
                case "MINI":
                    cabs[i] = new Mini(distance);
                    break;
                case "SEDAN":
                    cabs[i] = new Sedan(distance);
                    break;
                case "SUV":
                    cabs[i] = new SUV(distance);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid cab type");
            }
        }

        double total = 0;

        for (int i = 0; i < n; i++) {
            boolean night = times[i].equals("NIGHT");

            if (night && !(cabs[i] instanceof NightService)) {
                System.out.println(
                    types[i] + ": night service not available"
                );
                continue;
            }

            double fare = cabs[i].calculateFare(night);
            total += fare;

            System.out.printf("%s: %.2f%n", types[i], fare);
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}