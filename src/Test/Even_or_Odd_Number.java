package Test;
import java.util.Scanner;
public class Even_or_Odd_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int Number = scanner.nextInt();
        if(Number%2==0){
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd number");
        }
    }
}
