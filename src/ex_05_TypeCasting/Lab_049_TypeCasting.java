package ex_05_TypeCasting;

public class Lab_049_TypeCasting
{
    public static void main(String[] args) {
        byte b = 10;
        int a = b; // Valid Syntax -> Widening -> Implicit Casting - Automatically done.
        System.out.println(a);

        int a1 = (int) b; // Valid Syntax -> Widening -> Explicit Casting - not required
        // Explicit casting where we tell the JVM to datatype
        System.out.println(b);


    }
}
