package ex_14_Strings;

public class LabStringExample3 {
    public static void main(String[] args) {

        String s = "Java".substring(2);
      //  String s1 = "Java".substring(1,3);
        System.out.println(s);

        // "unhappy".substring(2) returns "happy" "
        // Harbison".substring(3) returns "bison"
        // "emptiness".substring(9) returns "" (an empty string)

        char[] arr = "Java".toCharArray();
        System.out.println(arr);

        boolean b = "  ".isBlank();
        Boolean b1 = "".isEmpty();
        System.out.println(b);
        System.out.println(b1);

        String s2 = "=".repeat(3);
        String s3 = "Pramod".repeat(3);
        System.out.println(s3);
        System.out.println(s2);

        boolean b11 = "Java".equalsIgnoreCase("java");
        System.out.println(b11);

        long count = "a\nb\nc".lines().count();
        System.out.println(count);

        System.out.println("=".repeat(10));
        System.out.println("Here we go");
        System.out.println("=".repeat(10));







    }
}
