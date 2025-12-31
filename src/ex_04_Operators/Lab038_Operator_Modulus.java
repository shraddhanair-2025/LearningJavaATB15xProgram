package ex_04_Operators;

import java.util.SortedMap;

public class Lab038_Operator_Modulus {
    public static void main(String[] args) {
     int a = 20;
     int b = 10;
        System.out.println(a%b);  //Modulus %

        //                     10| 20 | 2 - Quotient
        //                       |  20 |
           //                     ----------
        //                           0  --  Remainder

       // System.out.println(13%7); Remainder -6

        // 11%2 --> 1,  13%2 --> 1
        //         10%2 --> 0
        //         12%2 --> 0
         //        Number % 2 --> Remainder --> 1 --> Odd, 0--> Even

      //  num%2 == 0 -even, else 1 odd
    }
}
