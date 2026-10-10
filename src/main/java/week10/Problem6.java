package main.java.week10;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        boolean prime = num > 1;

        for (int i = 2; i <= num / i && prime; i++) {
            if (num % i == 0) {
                prime = false;
            }
        }

        if (prime) {
            System.out.println(num + " is prime");
        } else {
            System.out.println(num + " is not prime");
        }

        sc.close();
    }
}