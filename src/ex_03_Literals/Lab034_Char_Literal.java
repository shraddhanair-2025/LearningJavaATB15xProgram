package ex_03_Literals;

public class Lab034_Char_Literal {
    public static void main(String[] args) {
        char c1 = 'A';
                // A to Z all the special charactors !@#$%&^*()_+
        // char c = "A"; Strings -"- bunch of characters
        char c2 = 'B';
        System.out.println(c2);
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; // blank space

        // Escape Sequence

        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("PramodeDutta");
        System.out.println("Pramod"+new_line+"Dutta");
        System.out.println("shraddha\nnair"); //it will remove 1st centance
        System.out.println("pramod"+tab_line+"Dutta");
        System.out.println("pramod"+back_space+"Dutta");
        System.out.println("pramod\rDutta");

        System.out.println("Hi, This is first line"+tab_line+"this is second line"+tab_line+"This is third line");


        char c10 = 'A';
        // ASCII (Limited number) - A -> 65

        char ruppes = '₹';
        System.out.println(ruppes);

        char my_laugh_smily = '\u1f60';
        System.out.println(my_laugh_smily); // :)

        char c11 = '\u1f60';


        int binary = 0b1010;
        int hex = 0xFF;
        long amount = 1_000_000L;
        System.out.println(amount);

        // char A = "10"
        char c = 'A'; //65
        System.out.println(c);




    }
}
