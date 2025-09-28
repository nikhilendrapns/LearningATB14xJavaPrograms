package ex_04_Operators;

public class Lab_028_Operators_Arithmetic_Operators

{

/* Operators
            1. An operator is a special symbol
            2. Tells the compiler to perform the specific mathematical or logical operations on operands.
            3. Operators are used to perform operations by using operands. (variable names) -> age
            Unary operator which required with single operand
            Binary operator which required with the two operands
            Ternary operator which required three operands
         */
        public static void main(String[] args) {
            // Arithmetic Operators
            // + (Addition)
            // - (Subtraction)
            // * (Multiplication)
            // / (Division)
            // s% (Modulus) | Modulus - Remainder
            int a = 20;
            int b = 3;
            float c = 3.0f;

            System.out.println("a + b = " + (a + b)); // Addition
            System.out.println("a - b = " + (a - b)); // Subtraction
            System.out.println("a * b = " + (a * b)); // Multiplication
            System.out.println("a / b = " + (a / b)); // Division
            System.out.println("b % a = " + (b % a)); // Modulus

            System.out.println(a/c);
            System.out.println("a+b");
            System.out.println(a+b);
            //  System.out.println("a++ = " + (a++));     // Increment
            //  System.out.println("++a = " + (++a));     // Increment
            //  System.out.println("a-- = " + (a--));     // Decrement
            //  System.out.println("--a = " + (--a));     // Decrement
        }
}
