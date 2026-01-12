package Test;
import java.util.Scanner;
public class Positive_Negative_or_Zero_5 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        String result = (number > 0 ?"Positive" : (number < 0 ? "negative" : "Zero"));
        System.out.println(result);
        scanner.close();
    }
}
