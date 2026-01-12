package Test;
import java.util.Scanner;
import java.util.SortedMap;

public class Maximum_of_Two_Numbers_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int N1 = scanner.nextInt();
        System.out.println("Enter 2nd number");
        int N2 = scanner.nextInt();

        String Max = (N1 > N2 ? "N1 is Max" : (N2 > N1 ? "N2 is Max" : "Both number's are Equal"));
        System.out.println(Max);

    }
}
