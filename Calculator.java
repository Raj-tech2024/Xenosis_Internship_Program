import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter an operation (+, -, *, /): ");
                char operation = scanner.next().charAt(0);

                System.out.print("Enter the number of values you want to operate on: ");
                int count = scanner.nextInt();

                // Initialize result variable
                double result = 0;

                System.out.print("Enter the numbers: ");
                for (int i = 0; i < count; i++) {
                    double num = scanner.nextDouble();
                    if (i == 0) {
                        // For the first number, initialize result
                        result = num;
                    } else {
                        // Apply the operation to result and next number
                        switch (operation) {
                            case '+':
                                result += num;
                                break;
                            case '-':
                                result -= num;
                                break;
                            case '*':
                                result *= num;
                                break;
                            case '/':
                                if (num != 0) {
                                    result /= num;
                                } else {
                                    System.out.println("Error: Division by zero!");
                                    scanner.close();
                                    return;
                                }
                                break;
                            default:
                                System.out.println("Error: Invalid operation!");
                                return;
                        }
                    }
                }

                System.out.println("Result: " + result);
            }
        }

