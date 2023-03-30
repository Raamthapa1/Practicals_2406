import textio.TextIO;

    public class Calculator3 {
        /* ASk user for simple expression and displays results by calculating them*/
        public static void main(String[] args) {
            double num1, num2, total;
            char op;

            do {
                // Read the first number
                System.out.print("Enter an expression (or 0 to exit): ");
                num1 = TextIO.getDouble();

                // If num1 is 0, exit the program
                if (num1 == 0)
                    break;

                // Read the operator and second number
                op = TextIO.getChar();
                num2 = TextIO.getDouble();

                // Calculate according to the operator
                switch (op) {
                    case '+' -> total = num1 + num2;
                    case '-' -> total = num1 - num2;
                    case '*' -> total = num1 * num2;
                    case '/' -> total = num1 / num2;
                    default -> {
                        System.out.println("Invalid operator");
                        continue;
                    }
                }

                // Print the total
                System.out.printf("%.2f %c %.2f = %.2f\n", num1, op, num2, total);
            } while (true);

            System.out.println("Good bye");
        }
    }

