package ex_05_TypeCasting;

public class Lab_050_TypeCasting_Narrowing
{
    public static void main(String[] args) {
        int val = 300;
        //300 would be converted into its binary equivalent and stored as a sequence of 1s and 0s in a specific memory location
        // 00000000 00000000 00000001 00101100
        //     **0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 1 0 1 1 0 0**

        //  byte b = val; // Narrowing - Implicit Casting - Vaid ? No
        byte b = (byte) val; // Narrowing - Explicit Casting - Valid but data loss will be there
        System.out.println(b);
        //only 8 bit supported hence 00101100
        //  **0 0 1 0 1 1 0 0**
        // Value is
        //
        // 0 + 0 + 32 + 0 + 8 + 4 + 0 + 0 = **44.**
        //
        //**(00101100)₂ = (0 × 2⁷) + (0 × 2⁶) + (1 × 2⁵) + (0 × 2⁴) + (1 × 2³) + (1 × 2²) + (0 × 2¹) + (0 × 2⁰) = (44)₁₀**


    }
}
