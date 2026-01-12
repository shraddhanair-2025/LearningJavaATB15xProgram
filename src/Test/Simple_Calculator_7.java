package Test;
import javax.xml.transform.Result;
import java.util.Scanner;

public class Simple_Calculator_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = scanner.nextInt();
        System.out.println("Enter 2nd number");
        int b = scanner.nextInt();

        System.out.println("Choose one operation from 1 to 4 ");
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.println("Enter your choice(1-4)");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:

                System.out.println("Addition->" + (a + b));
                break;
            case 2:
                System.out.println("Substraction->"+(a-b));
                break;
            case 3:
                System.out.println("Multiplication->"+(a*b));
                break;
            case 4:
                System.out.println("Division->"+(a/b));
                break;
            default:
                System.out.println("Enter a valid number");


        }
    }
}
