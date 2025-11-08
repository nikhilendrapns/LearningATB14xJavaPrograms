package Java_Question;

import java.util.Scanner;

/*Take input from user about n and print the triangle pattern.Eg n=3
 *
 **
 ***
 */

public class Q17_Right_Angled_Triangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the height of the triangle:");
        int n=scanner.nextInt();

        for(int i=0;i<n;i++)// Traversing rows
        {
            for(int j=0;j<=i;j++)// traversing column
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
//mirror of right angle triangle
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the num");
    int num = scanner.nextInt();

    for (int i = 0; i < num; i++) {
        for (int j = i; j < num-1; j++) {
            System.out.print("-");
        }
        for (int k = 0; k <= i ; k++) {
            System.out.print("*");
            // --*
            // -**
            // ***
        }
        System.out.println("");
    }
}
*/

/*
 public static void main(String[] args) {
            for(int i=1;i<=5;i++)
            {
                for(int j=1;j<=i;j++)
                {
                   System.out.print("* ");
                }
                System.out.println();
            }

        }


}
 */

/*
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive number");
        if(sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n <= 0)
                System.out.println("Enter value within range");
            else {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }

        else
        {
            System.out.println("Enter a valid number");
        }
    }
}
 */

/*
public class RightTrianglePattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //char a[][]= new char[3][3];
        System.out.println ("Enter the pattern character");
        String a=sc.next();
        System.out.println("Enter the depth of triangle");
        int d=sc.nextInt();
        for(int i=0;i<d;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(a);
            }
            System.out.println("");
        }
    }
}

 */

/*
    public static void main(String[] args) {
            *
          * *
        * * *
      * * * *
    * * * * *
  * * * * * *
        int n=6;
        //Decreasing Spaces
        //Decreasing triangle

        for(int i=1;i<=n;i++)
        {
            //for loop for decreasing spaces
            for(int j=i;j<=n;j++)
            {
                System.out.print("  ");
            }
            //for loop for increasing star
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

 */