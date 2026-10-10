package main.java.hw9week;

import java.util.Scanner;

abstract class CollegeStudent {
    String name;
    static final double TUITION = 40000.0;
    static final double BUS_FEE = 12000.0;

    CollegeStudent(String name) {
        this.name = name;
    }

    abstract double tuitionFee();

    abstract boolean usesBus();

    double calculateFee() {
        double total = tuitionFee();

        if (usesBus()) {
            total += BUS_FEE;
        }

        return total;
    }
}

class DayScholar extends CollegeStudent {
    DayScholar(String name) {
        super(name);
    }

    @Override
    double tuitionFee() {
        return TUITION;
    }

    @Override
    boolean usesBus() {
        return true;
    }
}

class Hosteller extends CollegeStudent {
    static final double HOSTEL_FEE = 60000.0;

    Hosteller(String name) {
        super(name);
    }

    @Override
    double tuitionFee() {
        return TUITION + HOSTEL_FEE;
    }

    @Override
    boolean usesBus() {
        return false;
    }
}

class Scholar extends CollegeStudent {
    Scholar(String name) {
        super(name);
    }

    @Override
    double tuitionFee() {
        return TUITION / 2;
    }

    @Override
    boolean usesBus() {
        return true;
    }
}

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        CollegeStudent[] students = new CollegeStudent[n];

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();

            switch (type) {
                case "DAY_SCHOLAR":
                    students[i] = new DayScholar(name);
                    break;
                case "HOSTELLER":
                    students[i] = new Hosteller(name);
                    break;
                case "SCHOLAR":
                    students[i] = new Scholar(name);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid student type");
            }
        }

        double total = 0;

        for (CollegeStudent s : students) {
            double fee = s.calculateFee();
            total += fee;
            System.out.printf("%s: %.2f%n", s.name, fee);
        }

        System.out.printf("Total Collected: %.2f%n", total);
        sc.close();
    }
}