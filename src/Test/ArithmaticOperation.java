package Test;
import java.util.Scanner;
public class ArithmaticOperation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scanner.nextInt();
        System.out.println("Enter second number");
        int b = scanner.nextInt();

            System.out.println("Sum-->" + (a + b));
            System.out.println("Difference-->" + (a - b));
            System.out.println("Multiplication-->" + (a * b));
            System.out.println("Division-->" + (a / b));
            System.out.println("Remainder-->" + (a % b));
        }
 }
