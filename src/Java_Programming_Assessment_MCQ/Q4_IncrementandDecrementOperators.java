package Java_Programming_Assessment_MCQ;
/*
Increment and Decrement Operators
Create a program that demonstrates pre-increment, post-increment, pre-decrement, and post-decrement operators.

**Requirements:**
- Show the difference between ++i and i++
- Show the difference between --i and i--
- Print values before and after operations
 */
public class Q4_IncrementandDecrementOperators {
    public static void main(String[] args) {
        int a=5;


        System.out.println("Initial value of a: " + a);

        // Pre-increment: value is increased first, then used
        System.out.println("\nPre-increment (++a):");
        System.out.println("Value before: " + a);
        System.out.println("Returned value: " + (++a));
        System.out.println("Value after: " + a);

        // Post-increment: value is used first, then increased
        System.out.println("\nPost-increment (a++):");
        System.out.println("Value before: " + a);
        System.out.println("Returned value: " + (a++));
        System.out.println("Value after: " + a);

        // Pre-decrement: value is decreased first, then used
        System.out.println("\nPre-decrement (--a):");
        System.out.println("Value before: " + a);
        System.out.println("Returned value: " + (--a));
        System.out.println("Value after: " + a);

        // Post-decrement: value is used first, then decreased
        System.out.println("\nPost-decrement (a--):");
        System.out.println("Value before: " + a);
        System.out.println("Returned value: " + (a--));
        System.out.println("Value after: " + a);
    }
}
