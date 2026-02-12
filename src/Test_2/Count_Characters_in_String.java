package Test_2;

import java.util.Scanner;

public class Count_Characters_in_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = scanner.nextLine();
        int count = input.replace(" ","").length();
        System.out.println("Total characters (excluding spaces):" +count);


    }

    }

