import textio.TextIO;

/**
 * This program uses the previous version of quiz and add some extra subtraction questions and
 * string questions whose answer will be an integer
 * */


public class AdvanceQuiz5 {

    // -------------------- Nested classes and interface -----------------------

    interface IntQuestion {
        public String AskQuestions();
        public int getCorrectAnswer();
    }

    static class AdditionQuestion implements IntQuestion {
        private int a, b;
        public AdditionQuestion() { // constructor
            a = (int)(Math.random() * 50 + 1);
            b = (int)(Math.random() * 50);
        }
        public String AskQuestions() {
            return "What is " + a + " + " + b + " ?";
        }
        public int getCorrectAnswer() {
            return a + b;
        }
    }

    static class SubtractionQuestion implements IntQuestion {
        private int a, b;
        public SubtractionQuestion() {
            a = (int)(Math.random() * 50 + 1);
            b = (int)(Math.random() * 50);
            if (b > a) { // Avoid negative answers.
                int temp = a;
                a = b;
                b = temp;
            }
        }
        public String AskQuestions() {
            return "What is " + a + " - " + b + " ?";
        }
        public int getCorrectAnswer() {
            return a - b;
        }
    }



    private static IntQuestion[] questions;

    private static int[] userAnswers;


    public static void main(String[] args) {
        System.out.println();
        System.out.println("Welcome to the quiz");
        System.out.println();
        System.out.println("There are some math questions and a few non-math");
        System.out.println("questions, but the answer to every question is");
        System.out.println("an integer.");
        System.out.println();
        GenerateQuiz();
        administerQuiz();
        gradeQuiz();
    }


    /**
     * Creates the array of objects that holds the quiz questions
     */
    private static void GenerateQuiz() {
        questions = new IntQuestion[10];
        for ( int i = 0; i < 7; i++ ) {
            if (Math.random() < 0.5)
                questions[i] = new AdditionQuestion();
            else
                questions[i] = new SubtractionQuestion();
        }
        questions[7] = new IntQuestion() {
            public String AskQuestions() {
                return "How many states are there in the United States?";
            }
            public int getCorrectAnswer() {
                return 50;
            }
        };
        questions[8] = new IntQuestion() {
            public String AskQuestions() {
                return "How many players are there in an ice hockey team?";
            }
            public int getCorrectAnswer() {
                return 6;
            }
        };
        questions[9] = new IntQuestion() {
            public String AskQuestions() {
                return "Which age do you have to reach to be eligible" +
                        "to become President of the United States?\n?";
            }
            public int getCorrectAnswer() {
                return 35;
            }
        };
    }


    /**
     * Asks the user each of the ten quiz questions and gets the user's answers.
     * The answers are stored in an array, which is created in this subroutine.
     */
    private static void administerQuiz() {
        userAnswers = new int[10];
        for (int i = 0; i < 10; i++) {
            int questionNum = i + 1;
            System.out.printf("Question %2d:  %s ",
                    questionNum, questions[i].AskQuestions());
            userAnswers[i] = TextIO.getlnInt();
        }
    }



    private static void gradeQuiz() {
        System.out.println();
        System.out.println("Correct answers:");
        System.out.println();
        int numberCorrect = 0;
        int grade;
        for (int i = 0; i < 10; i++) {
            System.out.println("Question number " + (i+1) + ":");
            System.out.println("    " + questions[i].AskQuestions());
            System.out.println("    Correct answer:  " + questions[i].getCorrectAnswer());
            if ( userAnswers[i] == questions[i].getCorrectAnswer() ) {
                System.out.println("    You were CORRECT.");
                numberCorrect++;
            }
            else {
                System.out.println("    You said " + userAnswers[i] + ", which is INCORRECT.");
            }
            System.out.println();
        }
        grade = numberCorrect * 10;
        System.out.println();
        System.out.println("You got " + numberCorrect + " questions correct.");
        System.out.println("Your grade on the quiz is " + grade);
        System.out.println();
    }

}

