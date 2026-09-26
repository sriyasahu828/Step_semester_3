package main.java.week6;

class MessWallet {

    private double balance;

    public MessWallet(double openingBalance) {

        if (openingBalance < 0) {
            balance = 0;
            System.out.println("Warning: Negative balance not allowed");
        } else {
            balance = openingBalance;
        }
    }

    public void topUp(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid top-up amount");
            return;
        }

        balance += amount;
        System.out.println("Balance after top-up: " + balance);
    }

    public void deduct(double amount) {

        if (amount > balance) {
            System.out.println("Deduct rejected: insufficient balance");
            return;
        }

        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class Problem2 {

    public static void main(String[] args) {

        MessWallet wallet = new MessWallet(500);

        wallet.topUp(200);
        wallet.deduct(1000);

        System.out.println("Final balance: " + wallet.getBalance());
    }
}