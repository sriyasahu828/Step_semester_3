package main.java.week10;

import java.util.Scanner;

class Student {
    String name;
    int[] marks;

    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    double calculateAverage() {
        int sum = 0;

        for (int mark : marks) {
            sum += mark;
        }

        return sum / 3.0;
    }

    char calculateGrade() {
        double avg = calculateAverage();

        if (avg >= 90) {
            return 'A';
        } else if (avg >= 75) {
            return 'B';
        } else if (avg >= 60) {
            return 'C';
        } else if (avg >= 40) {
            return 'D';
        } else {
            return 'F';
        }
    }

    void displayResult() {
        System.out.printf(
            "%s: Average %.1f, Grade %c%n",
            name.toUpperCase(),
            calculateAverage(),
            calculateGrade()
        );
    }
}

public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String name = sc.next();

            int[] marks = new int[3];

            for (int j = 0; j < 3; j++) {
                marks[j] = sc.nextInt();
            }

            Student student = new Student(name, marks);
            student.displayResult();
        }

        sc.close();
    }
}s