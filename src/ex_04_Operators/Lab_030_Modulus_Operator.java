package ex_04_Operators;

public class Lab_030_Modulus_Operator
{
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        int c = a%b; // Modulus operator gives the remainder of the division
        System.out.println(c);
        System.out.println(10%3);
        System.out.println(10%2);
        //To quickly add a line comment in IntelliJ IDEA, press  Ctrl + / on Windows

        //        10 | 20 |  2 - quotient
        //           | 20 |
        //           --------
        //              0 - Remainder
        //           --------

        //  System.out.println(13%7);
        //        7 | 13 | 1 - Q
        //             7
        //           ------
        //             6 - Remainder
        //           ------

        //         11%2 -> 1 , 13%2 -> 1
        //         10%2 -> 0
        //         12%2 -> 0
        //         Number % 2 -> R-> 1 -> odd , 0 -> even
    }

}
