package ex_05_TypeCasting;

public class Lab059_TypeCasting_Narrrowing {
    public static void main(String[] args) {

        int val = 300;
        //000000000000000100101100
      //  byte b = val;  Implicit Narrowing
        byte b2 =   (byte)val; // Explicit Narrowing
        System.out.println(b2);
        // 0100101100,  // 0+0+32+0+8+4+0+0 = **44.**
        //**(00101100)₂ = (0 × 2⁷) + (0 × 2⁶) + (1 × 2⁵) + (0 × 2⁴) + (1 × 2³) + (1 × 2²) + (0 × 2¹) + (0 × 2⁰) = (44)₁₀**



    }
}
