package Java_Programming_Assessment_MCQ;

import java.util.Scanner;

/*
Number Classification
Write a program to check if a number is positive, negative, or zero.

**Requirements:**
- Read an integer from user input
- Use if-else statements to classify the number
- Print appropriate message for each case
 */
public class Q6_Number_Classification {
    public static void main(String[] args) {
        //int a=15, b=-7; c=0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an number: ");
        int num1 = sc.nextInt();

        if (num1>0){
            System.out.println("Positive number:" +num1);
        }
        else if
            (num1<0){
            System.out.println("Negative number:" +num1);
        }
        else {
            System.out.println("Negative number:" +num1);
        }

    }
}
