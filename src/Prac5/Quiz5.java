package Prac5;

public class Quiz5 {
    /*This program uses the previous code from quiz 4 with certain modifications*/

    // global variables for all questions


    private static int[] userAnswers;
    private static AdditionQuestion5[] questions;
    public static void main(String[] args) {
        System.out.println("Welcome to the quiz");
        generateQuestions();
        askQuestions();
        checkAnswers();
    }

    public static void generateQuestions() {
        questions =new AdditionQuestion5[10];
        for (int i = 0; i < 10; i++) {
            questions[i] = new AdditionQuestion5();

        }
    }
    public static void askQuestions() {
        userAnswers = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println(questions[i].getQuestion()) ;
            userAnswers[i] = textio.TextIO.getlnInt();
        }
    }
    public static void checkAnswers() {
        int correctNumber = 0;
        for (int i = 0; i < 10; i++) {
            if (userAnswers[i] == questions[i].getCorrectAnswer()) {
                System.out.println("Question " + (i + 1) + " is correct.");
                correctNumber++;
            } else {
                System.out.println("Question " + (i + 1) + " is incorrect.");
                System.out.println("The correct answer is " + questions[i].getCorrectAnswer());
            }
        }
        System.out.println("You got " + correctNumber + " correct answers");
    }


}
