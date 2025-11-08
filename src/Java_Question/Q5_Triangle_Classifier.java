package Java_Question;

import java.util.Scanner;

/*Triangle Classifier:

Write a program that classifies a triangle based on its side lengths.
Given three input values representing the lengths of the sides,
determine if the triangle is equilateral (all sides are equal),
isosceles (exactly two sides are equal), or scalene (no sides are equal).
Use an if-else statement to classify the triangle.*/


public class Q5_Triangle_Classifier {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int a,b,c;
        System.out.print("Enter size of side 1: ");
        a = sc.nextInt();

        System.out.print("Enter size of side 2: ");
        b = sc.nextInt();

        System.out.print("Enter size of side 3: ");
        c = sc.nextInt();

        // Triangle inequality check

        if (a+b<=c || b+c<=a || c+a<=b)
        {
            System.out.println("Not a triangle");
        }
        else if (a==b && b==c)
        {
            System.out.println("Triangle is Equilateral");
        }
        else if (a==b || b==c || c==a)
        {
            System.out.println("Triangle is Isosceles");
        }
        else
        {
            System.out.println("Triangle is Scalene");
        }
        sc.close();
    }
}

/*
public static String classifyTriange(int a, int b,int c)
{
    String triangleType="";
    if(a==b && b==c) triangleType="Equilateral";
    else if(a==b || b==c || a==c) triangleType="Isosceles";
    else triangleType="Scalane";
    return triangleType;
}

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter size of side 1");
        a=s.nextInt();
        System.out.println("Enter size of side 2");
        b=s.nextInt();
        System.out.println("Enter size of side 3");
        c=s.nextInt();

        System.out.println("Triangle is "+ classifyTriange(a,b,c));
        s.close();
    }
}

 */