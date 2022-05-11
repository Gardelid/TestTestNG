import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double number1 = input.nextDouble();
        System.out.println("Enter operator [+ - * /]: ");
        char op = input.next().charAt(0);
        System.out.println("Enter second number: ");
        double number2 = input.nextDouble();
        Main.calculator(number1, op, number2);
    }

    public static double calculator(double number1, char op, double number2) {
        double result = 0;
        switch (op) {
            case '+' -> result = number1 + number2;
            case '-' -> result = number1 - number2;
            case '*' -> result = number1 * number2;
            case '/' -> result = number1 / number2;
            default -> System.out.println("Wrong operator input");
        }
        System.out.println(number1 + " " + op + " " + number2 + " = " + result);
        return result;
    }
}
