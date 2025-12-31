package ex_04_Operators;

public class Lab048_Interview_IQ {
    public static void main(String[] args) {
        int balaji_salary = 12;
        boolean b = !(balaji_salary>10 || balaji_salary<5);
        System.out.println(b);

        // Devide and conquer

        // A ->balaji_salary > 10 -> 12 >10 -> True
        // B -> balaji_salary < 5 -> 12<5 -> False
        // (A || B) -> True - (True || False) -> True
        // ! (true) -> False
    }
}
