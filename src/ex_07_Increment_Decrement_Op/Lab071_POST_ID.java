package ex_07_Increment_Decrement_Op;

public class Lab071_POST_ID {
    public static void main(String[] args) {

        int a = 10;
        a = a++ + a++ + a++;
        System.out.println(a);
        // ERT ( Exp and Result Table)
        // LNo |  a_post | b

        // 6 |  10
        // 7 |  10+11+12 = 33


     //   int a = 3;
      //  int b = a++ * ++a;
      //  System.out.println(b);
      //  System.out.println(a);
        //  16 3 NA
        // 17 15
        // 18 5 15


      //  int a = 5;
       // System.out.println(a++ + a--);
        //  25 5 NA
        // 26 (6+5)11
    }
    }

