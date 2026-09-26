package main.java.week8;

import java.util.*;

abstract class Payment {
    double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    abstract double calculateAmount();
}

class CardPayment extends Payment {
    CardPayment(double amount) {
        super(amount);
    }

    double calculateAmount() {
        return amount * 1.02;
    }
}

class WalletPayment extends Payment {
    WalletPayment(double amount) {
        super(amount);
    }

    double calculateAmount() {
        return amount * 1.01;
    }
}

class BankTransfer extends Payment {
    BankTransfer(double amount) {
        super(amount);
    }

    double calculateAmount() {
        return amount;
    }
}

public class Problem1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Payment> list = new ArrayList<>();
        double total = 0;

        for (int i = 0; i < n; i++) {

            String type = sc.next();
            double amt = sc.nextDouble();

            Payment p = null;

            if (type.equals("CARD"))
                p = new CardPayment(amt);
            else if (type.equals("WALLET"))
                p = new WalletPayment(amt);
            else
                p = new BankTransfer(amt);

            list.add(p);
        }

        for (Payment p : list) {

            double value = p.calculateAmount();
            total += value;

            System.out.printf("%.2f%n", value);
        }

        System.out.printf("Total: %.2f%n", total);
    }
}