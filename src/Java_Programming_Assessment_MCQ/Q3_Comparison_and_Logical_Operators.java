package Java_Programming_Assessment_MCQ;

/*Write a program that demonstrates comparison and logical operators.

**Requirements:**
        - Use comparison operators (==, !=, <, >, <=, >=)
- Use logical operators (&&, ||, !)
- Print boolean results with explanatory messages

 */
public class Q3_Comparison_and_Logical_Operators {
    public static void main(String[] args) {
        int a = 10, b = 20;

        // Comparison operators
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a <= b : " + (a <= b));
        System.out.println("a >= b : " + (a >= b));

        // Logical operators
        System.out.println("(a > b) && (a > 0): " + ((a > b) && (a > 0)));
        System.out.println("(a < b) || (a > 0): " + ((a < b) || (a > 0)));
        System.out.println("!(a > b): " + (!(a > b)));

    }
}
