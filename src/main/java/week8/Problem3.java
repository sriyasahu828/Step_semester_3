package main.java.week8;

abstract class Delivery {

    double weight;
    double distance;

    Delivery(double weight, double distance) {
        this.weight = weight;
        this.distance = distance;
    }

    abstract double calculateFee();
}

class Standard extends Delivery {

    Standard(double w, double d) {
        super(w, d);
    }

    double calculateFee() {
        return 5 + (0.5 * weight) + (0.1 * distance);
    }
}

class Express extends Delivery {

    Express(double w, double d) {
        super(w, d);
    }

    double calculateFee() {
        return 15 + weight + (0.2 * distance);
    }
}

class International extends Delivery {

    double customs;

    International(double w, double d, double c) {
        super(w, d);
        customs = c;
    }

    double calculateFee() {
        return 25 + (2 * weight) + (0.5 * distance) + customs;
    }
}

public class Problem3 {

    public static void main(String[] args) {

        Delivery d1 = new Standard(10,50);
        Delivery d2 = new Express(5,20);
        Delivery d3 = new International(20,100,30);

        System.out.println(d1.calculateFee());
        System.out.println(d2.calculateFee());
        System.out.println(d3.calculateFee());
    }
}