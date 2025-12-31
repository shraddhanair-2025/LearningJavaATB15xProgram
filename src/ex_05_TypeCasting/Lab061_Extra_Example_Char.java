package ex_05_TypeCasting;

public class Lab061_Extra_Example_Char {
    public static void main(String[] args) {
         char ch = 'A';
         int ascii = ch; //Widening

        int num = 66; //Narrow
        char letter = (char) num;
        System.out.println(ascii);
        System.out.println(letter);
    }
}
