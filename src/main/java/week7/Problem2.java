package main.java.week7;

class Scorecard {

    private boolean[] answers;
    private final int totalQuestions;
    private int currentIndex;

    public Scorecard(int totalQuestions) {
        this.totalQuestions = totalQuestions;
        answers = new boolean[totalQuestions];
        currentIndex = 0;
    }

    public void recordAnswer(boolean result) {

        if (currentIndex < totalQuestions) {
            answers[currentIndex] = result;
            currentIndex++;
        }
    }

    public int getScore() {

        int score = 0;

        for (boolean ans : answers) {
            if (ans)
                score++;
        }

        return score;
    }
}

public class Problem2 {

    public static void main(String[] args) {

        Scorecard sc = new Scorecard(4);

        sc.recordAnswer(true);
        sc.recordAnswer(true);
        sc.recordAnswer(false);
        sc.recordAnswer(true);

        System.out.println("Score = " + sc.getScore());
    }
}