
public class Quiz4 {
    /*This program ask users 10 simple maths question and display
     if they are correct or not at the end*/

    // global variables for all questions

    private static int[] firstNumbers;
    private static int[] secondNumbers;
    private static int[] userAnswers;
    public static void main(String[] args) {
        System.out.println("Welcome to the quiz");
        generateQuestions();
        askQuestions();
        checkAnswers();
    }

    public static void generateQuestions() {
        firstNumbers = new int[10];
        secondNumbers = new int[10];
        userAnswers = new int[10];
        for (int i = 0; i < 10; i++) {
            firstNumbers[i] = (int) (Math.random() * 20) + 1;
            secondNumbers[i] = (int) (Math.random() * 20) + 1;
        }
    }
    public static void askQuestions() {

        for (int i = 0; i < 10; i++) {
            System.out.println("What is " + firstNumbers[i] + " + " + secondNumbers[i] + "?");
            userAnswers[i] = textio.TextIO.getInt();
        }
    }
    public static void checkAnswers() {
        int correctNumber = 0;
        for (int i = 0; i < 10; i++) {
            if (userAnswers[i] == firstNumbers[i] + secondNumbers[i]) {
                System.out.println("Question " + (i + 1) + " is correct.");
                correctNumber++;
            } else {
                System.out.println("Question " + (i + 1) + " is incorrect.");
            }
        }
        System.out.println("You got " + correctNumber + " correct answers");
    }
}
