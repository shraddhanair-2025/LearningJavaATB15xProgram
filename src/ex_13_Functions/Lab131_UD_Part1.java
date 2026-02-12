package ex_13_Functions;

public class Lab131_UD_Part1 {
    public static void main(String[] args) {

        // User Defined function.

        // 1. Without parameters without Return type
        // 1. Without parameters but with Return type
        // 1. With parameters and without Return type -main
        // 1. With parameters and with Return type


        // 1. Without Argument/ Parameters and Without Return Type
        wop_wor_greet();

        //  2. Without Parameters but With Return Type
        String msg = wop_wr_greet_2();

        //  3. With Parameters and Without Return Type ( 90%)
        greet_with_details("Pramod", 65,100);

        //  4. With Parameters and With Return Type
        int sum = sum_of_two_numbers(3,4);
    }
    static void wop_wor_greet(){

    }
    static String wop_wr_greet_2(){
        return "Pramod";
    }
    static void greet_with_details( String Pramod,int i, int i1){
    }
    static int sum_of_two_numbers(int i, int i1){
        return i+i1;
    }

}

