package Test_2;

import java.util.Scanner;

public class Check_String_Length {
    public static void main(String[] args) {

   Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String input = scanner.next();

        if (input.length()>10){
            System.out.println("String lenght is greater then 10");
        }
        else {
            System.out.println("String lenght is not greater then 10");
        }
    }
}
