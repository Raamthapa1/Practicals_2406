package Prac5;

public class AdditionQuestion5 {

    private int a, b;  // The numbers in the problem.

    public AdditionQuestion5() { // constructor
        a = (int)(Math.random() * 50 + 1);
        b = (int)(Math.random() * 50);
    }

    public String getQuestion() {
        return "What is " + a + " + " + b + " ?";
    }

    public int getCorrectAnswer() {
        return a + b;
    }

}
