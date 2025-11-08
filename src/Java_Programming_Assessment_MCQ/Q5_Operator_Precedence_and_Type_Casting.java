package Java_Programming_Assessment_MCQ;
import java.util.Scanner;
/*
Operator Precedence and Type Casting
Write a program that demonstrates operator precedence and type casting in Java.

**Requirements:**
- Show operator precedence with complex expressions
- Demonstrate implicit and explicit type casting
- Print results with explanations
 */
public class Q5_Operator_Precedence_and_Type_Casting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter an integer: ");
        int num1 = sc.nextInt();

        System.out.print("Enter a decimal number: ");
        double num2 = sc.nextDouble();

        // Demonstrating operator precedence
        // Multiplication and division have higher precedence than addition and subtraction
        double expressionResult = num1 + num2 * 3 - 5 / 2;
        // num2 * 3 happens before + and -, and 5 / 2 happens before subtraction

        // Implicit casting: int + double -> double
        double implicitCasting = num1 + num2;

        // Explicit casting: manually converting double to int
        int explicitCasting = (int)(num1 + num2);

        // Display results
        System.out.println("\n--- Results ---");
        System.out.println("Expression: num1 + num2 * 3 - 5 / 2");
        System.out.println("Operator Precedence Result: " + expressionResult);
        System.out.println("Explanation: Multiplication (*) and division (/) are done before addition (+) and subtraction (-).");

        System.out.println("\nImplicit Casting (int + double): " + implicitCasting);
        System.out.println("Explanation: int is automatically converted to double during addition.");

        System.out.println("\nExplicit Casting ((int)(num1 + num2)): " + explicitCasting);
        System.out.println("Explanation: The double result is manually converted (truncated) to int.");
    }
}


