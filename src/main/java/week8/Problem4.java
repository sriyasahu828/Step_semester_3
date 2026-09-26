package main.java.week8;

abstract class Question {

    int points;

    Question(int points) {
        this.points = points;
    }

    abstract double grade();
}

class MCQ extends Question {

    String correct;
    String student;

    MCQ(String c, String s, int p) {
        super(p);
        correct = c;
        student = s;
    }

    double grade() {
        return correct.equals(student) ? points : 0;
    }
}

class TF extends Question {

    String correct;
    String student;

    TF(String c, String s, int p) {
        super(p);
        correct = c;
        student = s;
    }

    double grade() {
        return correct.equals(student) ? points : 0;
    }
}

public class Problem4 {

    public static void main(String[] args) {

        Question q1 = new MCQ("Paris","Paris",10);
        Question q2 = new TF("True","False",5);

        System.out.println(q1.grade());
        System.out.println(q2.grade());
    }
}