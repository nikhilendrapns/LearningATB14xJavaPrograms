package Java_Question;

import java.util.*;

/*
Grade Calculator:
Write a program that calculates and displays the letter grade
for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
A: 90-100
B: 80-89
C: 70-79
D: 60-69
F: 0-59
*/

public class Q7_Grade_Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of the student: ");
        //if (sc.hasNextInt()) {
            int marks = sc.nextInt();

            if (marks >= 90 && marks <= 100) {
                System.out.println("Grade A");
            }
            else if (marks >= 80 && marks <= 89) {
                System.out.println("Grade B");
            }
            else if (marks >= 70 && marks <= 79) {
                System.out.println("Grade C");
            }
            else if (marks >= 60 && marks <= 69) {
                System.out.println("Grade D");
            }
            else if (marks >= 0 && marks <= 59) {
                System.out.println("Grade F");
            } else {
                System.out.println("Please enter marks in integer");
            }
            sc.close();


        }
    }


//}

/*
public static void main(String[] args) {
        {
            Scanner s= new Scanner(System.in);
            System.out.println("Enter marks of the student: ");
            int marks=s.nextInt();
            char grade=' ';

            if(marks >=90 && marks<=100) grade='A';
            else if(marks>=80 && marks<=89) grade='B';
            else if(marks>=70 && marks<=79) grade='C';
            else if(marks>=60 && marks<=69) grade='D';
            else if(marks<=59) grade='F';

            System.out.println("Grade of the student is "+grade);

            s.close();
        }
    }
}
 */


