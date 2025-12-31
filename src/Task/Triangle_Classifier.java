package Task;
 import java.util.Scanner;
public class Triangle_Classifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st side of triangle");
        int a = scanner.nextInt();

        System.out.println("Enter 2nd side of triangle");
        int b = scanner.nextInt();

        System.out.println("Enter 3rd side of triangle");
        int c = scanner.nextInt();


        if(a==b && a==c){
            System.out.println("Triangle is Acute");
        } else if (a==b && a!=c)
            System.out.println("Triangle is Isosceles");

        else {
            System.out.println("Triangle is Scalen");
        }
        scanner.close();

    }
}
