package main.java.hw8week;

import java.time.LocalDate;
import java.util.*;

abstract class Plan {

    String name;
    LocalDate startDate;

    Plan(String name, LocalDate startDate) {
        this.name = name;
        this.startDate = startDate;
    }

    abstract LocalDate renewalDate();
}

class Basic extends Plan {

    Basic(String name, LocalDate date) {
        super(name, date);
    }

    LocalDate renewalDate() {
        return startDate.plusDays(30);
    }
}

class Standard extends Plan {

    Standard(String name, LocalDate date) {
        super(name, date);
    }

    LocalDate renewalDate() {
        return startDate.plusDays(90);
    }
}

class Premium extends Plan {

    Premium(String name, LocalDate date) {
        super(name, date);
    }

    LocalDate renewalDate() {
        return startDate.plusDays(365);
    }
}

public class Problem5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            String type = sc.next();
            String name = sc.next();
            String date = sc.next();

            LocalDate start = LocalDate.parse(date);

            Plan p;

            if (type.equals("BASIC"))
                p = new Basic(name, start);
            else if (type.equals("STANDARD"))
                p = new Standard(name, start);
            else
                p = new Premium(name, start);

            System.out.println(
                    p.name + ": " + p.renewalDate()
            );
        }
    }
}