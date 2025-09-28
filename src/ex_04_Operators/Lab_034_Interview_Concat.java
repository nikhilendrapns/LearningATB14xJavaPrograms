package ex_04_Operators;

public class Lab_034_Interview_Concat
{

    public static void main(String[] args) {

        String first_name = "Nikhilendra";
        String last_name = " P N S";

        int a = 10;
        int b = 10;

        System.out.println(first_name + last_name + a + b); // Concatenation first, then addition as strings.
        System.out.println(a + b + first_name + last_name); // Addition first, then concatenation.

        // BOD-MAS - Bracket of Div, mul, add, sub
        System.out.println(first_name + last_name + (a + b));
    }
}
