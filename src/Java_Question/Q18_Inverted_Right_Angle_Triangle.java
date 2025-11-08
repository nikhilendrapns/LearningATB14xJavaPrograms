package Java_Question;

import java.util.Scanner;

/*Take input from user about n and print the triangle pattern.
n=3
***
**
*
 */

public class Q18_Inverted_Right_Angle_Triangle {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the depth of triangle");
        int n= scanner.nextInt();

        for(int i=n;i>=1;i--)// Traversing rows
        {
            for (int j=i;j>=1;j--)//Traversing columns
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
public class InvertedRightTrianglePattern {
        *****
        ****
        ***
        **
        *
public static void main(String[] args) {

int n = 5;
    for (int i =n-1; i>= 0; i--)
    {
        for (int j =0; j <=i;j++ )
        {

    for(int i = 0 ; i < 5 ; i++){
        for(int j = i ; j < 5; j++){
            System.out.print("* ");
        }
        System.out.println();
    }

}
}
 */

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Lab002_InvertedRightAnglePattern {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        try {
            int n = Integer.parseInt(br.readLine());
            if (n > 0 ) {
                for (int i = n; i > 0; i--) {
                    for (int j = i; j > 0; j--) {
                        System.out.print("*");
                    }
                    System.out.println();

                }
            }
            else
                System.out.println("Enter a valid number");

        } catch (NumberFormatException e) {
            System.out.println("Enter a positive integer number");
        }

    }
}
 */
/*
public class Inverted_Right_Triangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //char a[][]= new char[3][3];
        System.out.println ("Enter the pattern character");
        String a=sc.next();
        System.out.println("Enter the depth of triangle");
        int d=sc.nextInt();
        for(int i=0; i<=d;i++)
        {
            for(int j=d;j>i;j--)
            {
                System.out.print(a);
            }
            System.out.println("");
        }
    }
}
 */