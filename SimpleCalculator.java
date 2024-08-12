import java.util.Scanner;

class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return a / b;
    }
}

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        boolean continueCalculating = true;

        while (continueCalculating) {
            System.out.print("Enter number 1: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter number 2: ");
            double num2 = scanner.nextDouble();
            System.out.print("Select operation (+, -, *, /): ");
            String operation = scanner.next();

            double result = 0;
            switch (operation) {
                case "+":
                    result = calculator.add(num1, num2);
                    break;
                case "-":
                    result = calculator.subtract(num1, num2);
                    break;
                case "*":
                    result = calculator.multiply(num1, num2);
                    break;
                case "/":
                    result = calculator.divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid operation. Please select +, -, *, or /.");
                    continue;
            }

            System.out.println("Result: " + result);

            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String continueInput = scanner.next();
            continueCalculating = continueInput.equalsIgnoreCase("yes");
        }

        scanner.close();
    }
}