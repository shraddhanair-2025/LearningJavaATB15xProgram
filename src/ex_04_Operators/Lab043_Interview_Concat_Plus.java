package ex_04_Operators;

public class Lab043_Interview_Concat_Plus {
    public static void main(String[] args) {
        String first_name = "Pramod";
        String last_name = "Dutta";

        int a = 10;
        int b = 10;

        System.out.println(first_name+last_name+a+b);
        System.out.println(a+b+first_name+last_name);

        System.out.println(first_name+last_name+(a+b));

   //     BOADMAS - Brackets of Division, mul, sub, add

        //First of all, when ever it sees string
        // it will do concatenation and for the next
        // One it will also do concatenation
        // But when it sees integers first, it will do mathematical operation.
        // The second time it will see strings,
        // Then it will do concatenation as well.
    }
}
