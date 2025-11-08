package Java_Programming_Assessment_MCQ;

import java.util.Scanner;

/*
Find Largest of Three Numbers
Create a program to find the largest among three numbers using if-else statements.

**Requirements:**
- Read three integers from user input
- Use nested if-else or if-else if statements
- Handle cases where numbers might be equal
 */
public class Q7_Find_Largest_of_Three_Numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:" );

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b && b == c) {
            System.out.println("All numbers are equal.");
        }

        else if (a>=b && a>=c ){
            System.out.println("Largest number is: " +a);
        }
        else if (b>=a && b>=c) {
            System.out.println("Largest number is: " +b);
        }
        else{
            System.out.println("Largest number is: " +c);
        }


    }
}
