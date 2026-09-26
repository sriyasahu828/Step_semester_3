package main.java.week8;

abstract class Transport {

    double distance;

    Transport(double distance) {
        this.distance = distance;
    }

    abstract double fare();
}

class Bus extends Transport {

    Bus(double d) {
        super(d);
    }

    double fare() {

        double fare = 2 + (0.1 * distance);

        return Math.min(fare,10);
    }
}

class Train extends Transport {

    Train(double d) {
        super(d);
    }

    double fare() {
        return 3 + (0.15 * distance);
    }
}

class Metro extends Transport {

    double factor;

    Metro(double d,double f) {
        super(d);
        factor = f;
    }

    double fare() {
        return (1.5 + (0.2 * distance)) * factor;
    }
}

public class Problem5 {

    public static void main(String[] args) {

        Transport t1 = new Bus(15);
        Transport t2 = new Train(50);
        Transport t3 = new Metro(10,1.5);

        System.out.printf("%.2f%n", t1.fare());
        System.out.printf("%.2f%n", t2.fare());
        System.out.printf("%.2f%n", t3.fare());
    }
}