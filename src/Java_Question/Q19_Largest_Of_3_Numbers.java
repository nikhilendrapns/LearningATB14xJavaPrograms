package Java_Question;
//Find the Largest of Three Numbers.

import java.util.Scanner;
public class Q19_Largest_Of_3_Numbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number ");
        int n1 = scanner.nextInt();
        System.out.println("Enter 2nd number ");
        int n2 = scanner.nextInt();
        System.out.println("Enter 3rd number ");
        int n3 = scanner.nextInt();

        // Solution 1
        int largest = n1 > n2 ? (n1 >= n3 ? n1 : n3) : (n2 >= n3 ? n2 : n3);
        //Solution 2
        int largest1 = (n1 >= n2 && n1 >= n3) ? n1 : (n2 >= n3) ? n2 : n3;

        System.out.println("Largest among " + n1 + " " + n2 + " " + n3 + " is " + largest);
        System.out.println("Largest among " + n1 + " " + n2 + " " + n3 + " is " + largest1);

        scanner.close();
    }
}
/*
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers");
        double a, b, c;

        if (sc.hasNextDouble()) {
             a = sc.nextDouble();
        }
            else
            {
                System.out.println("Invalid input for first number.");
                return;
            }
            if(sc.hasNextDouble()) {
                b = sc.nextDouble();
            }
            else{
                System.out.println("Invalid input for second number.");
                return;
            }
        if(sc.hasNextDouble()) {
             c = sc.nextDouble();
        }
        else{
            System.out.println("Invalid input for third number.");
            return;
        }
            if (a > b && a > c) {
                System.out.println("a is the greatest number " + a);
            } else if (b > c && b > a) {
                System.out.println("b is the greatest number " + b);
            } else if (c > a && c > b) {
                System.out.println("c is the greatest number " + c);
            } else if (a == b || a == c || b == c) {
                System.out.println("Two or more numbers are equal.Enter different numbers");
            }
        }

    }
 */

/*
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 number to campare the greatest one");
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        int N3 = sc.nextInt();

        if(N1 > N2 && N1 > N3)
        {
            System.out.println("N1 is greatest");
        } else if ((N2> N1 && N2> N3))
        {
            System.out.println("N2 is the greates");
        }
        else
            System.out.println("N3 is greates");

        {

        }
    }
}
 */

/*

//Create a program to find the largest among three numbers using if-else statements.
//
//**Requirements:**
//- Read three integers from user input
//- Use nested if-else or if-else if statements
//- Handle cases where numbers might be equal
public class Find_Largest_of_Three_Numbers {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        int largest;

        // Using if-else statements
        if (num1 > num2 && num1 > num3) {
            largest = num1;
            System.out.println("Largest number is: " + largest);
        } else if (num2 > num1 && num2 > num3) {
            largest = num2;
            System.out.println("Largest number is: " + largest);
        } else if (num3 > num1 && num3 > num2) {
            largest = num3;
            System.out.println("Largest number is: " + largest);
        } else {
            System.out.println("Two or more numbers are equal and largest.");
        }
    }
}
 */
/*
 public static void main(String[] args) {
        int[] num = new int[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < num.length; i++) {

            System.out.println("Enter number:");

            if (sc.hasNextInt()) {
                num[i] = sc.nextInt();
            } else {
                System.out.println("Enter Valid Integer");
                break;
            }
        }
        if (num[0] > num[1] && num[0] > num[2]) {
            System.out.println(num[1] + " is largest");
        } else if (num[1]>num[0] && num[1]>num[2]) {
            System.out.println(num[1]+" is largest");
        }
        else {
            System.out.println(num[2]+" is largest");
        }

    }
}
 */