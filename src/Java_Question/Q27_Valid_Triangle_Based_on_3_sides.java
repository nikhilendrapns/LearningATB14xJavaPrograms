package Java_Question;
import java.util.Scanner;
public class Q27_Valid_Triangle_Based_on_3_sides {
  public  static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1: ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2: ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3: ");
        double side3 = sc.nextDouble();

        // Check triangle validity using the triangle inequality theorem
        if ((side1 + side2 > side3) &&
                (side1 + side3 > side2) &&
                (side2 + side3 > side1)) {

            System.out.println(" The triangle is valid.");
        } else {
            System.out.println(" The triangle is NOT valid.");
        }
    }
}

/*
 public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter length of 1st side ");
        int a=scanner.nextInt();
        System.out.println("Enter length of 2nd side ");
        int b=scanner.nextInt();
        System.out.println("Enter length of 3rd side ");
        int c=scanner.nextInt();

        if((a+b>c) || (b+c>a) ||(a+c)>b)
            System.out.println("It's a valid triangle");
        else System.out.println("Triangle not valid");
        scanner.close();
    }
}
 */

/*
 public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a=0,b=0,c =0;
        System.out.println("Enter the three sides of the triangle");

        if(!sc.hasNextInt())
        {
            System.out.println("Invalid input for first side.");
            return;
        }
        a = sc.nextInt();

       if(!sc.hasNextInt())
       {
           System.out.println("Invalid input for second side.");
           return;
       }
        b = sc.nextInt();

        if(!sc.hasNextInt())
        {
            System.out.println("Invalid input for third side.");
            return;
        }
        c = sc.nextInt();
        if(a<=0 ||b<=0|| c<=0)
        {
            System.out.println("Enter the sides greater than zero");
            return;
        }
        if(a+b >c && b+c> a && c+a > b )
        {
            System.out.println("The triangle is  valid");
        }
        else
        {
            System.out.println("The triangle is invalid");
        }

    }
}
 */

/*
 public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter first side: ");
            int a = scanner.nextInt();

            System.out.println("Enter second side: ");
            int b = scanner.nextInt();

            System.out.println("Enter third side: ");
            int c = scanner.nextInt();

            // Check triangle validity
            if ((a + b > c) && (a + c > b) && (b + c > a)) {
                System.out.println("The triangle is valid.");
            } else {
                System.out.println("The triangle is not valid.");
            }

            scanner.close();
        }
    }
 */
/*
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three sides of a triangle :");
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();
        if(side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2){
            System.out.println("Valid Triangle");
        }
        else {
            System.out.println("Not a Valid Triangle");
        }
    }
}
 */
/*
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three sides of triangle");
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Invalid Triangle");
        }
    }
}
 */
/*
 public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter side_1");
        int side_1 = scn.nextInt();

        System.out.println("enter side_2");
        int side_2 = scn.nextInt();

        System.out.println("enter side_3");
        int side_3 = scn.nextInt();
        if (side_1 > 0 && side_2 > 0 && side_3 > 0) {
            if ((side_1 + side_2 > side_3) && (side_1 + side_3 > side_2) && (side_2 + side_3 > side_1)) {
                System.out.println("triangle is valid");

            }
        }
        else {
            System.out.println("negative and zero  not alowed");
        }



    }
}
 */
/*
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Side 1: ");
        String s1 = sc.next();
        System.out.println("Enter Side 2: ");
        String s2 = sc.next();
        System.out.println("Enter Side 3: ");
        String s3 = sc.next();


        if (Integer.parseInt(s1)>0 && Integer.parseInt(s2)>0 && Integer.parseInt(s3)>0)
        {

            if (s1.equals(s2) && s1.equals(s3)) {
                System.out.println("Equilateral triangle");
            } else if (s1.equals(s2) || s2.equals(s3) || s3.equals(s1)) {
                System.out.println("Isosceles triangle");
            } else {
                System.out.println("Scalene Triangle");
            }
        }
        else
        {
            System.out.println("The side(s) of a triangle can never be zero");
        }

    }
}
 */

/*
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side of the triangle");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // 7, 10 , 5 - all sides equal
        // 1 , 10, 12 - not equal

        if (a+b > c && a+c > b && b+c > a){
            System.out.println("Is valid triangle");
        }
        else {
            System.out.println("Invalid triangle");
        }
    }
}
 */
/*
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three sides of the triangle:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("The given sides form a valid triangle.");
        } else {
            System.out.println("The given sides do not form a valid triangle.");
        }

        scanner.close();
    }
}
 */
/*
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input for three sides
        System.out.print("Enter side 1: ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2: ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3: ");
        double side3 = sc.nextDouble();

        // Step 2: Check if sides are positive
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("❌ Invalid input! Sides must be greater than 0.");
        }
        // Step 3: Apply Triangle Inequality Theorem
        else if ((side1 + side2 > side3) &&
                (side1 + side3 > side2) &&
                (side2 + side3 > side1)) {
            System.out.println("✅ The triangle is valid.");
        }
        else {
            System.out.println("❌ The triangle is NOT valid.");
        }

        sc.close();
    }
}
 */
/*
public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter side1: ");
        int a = s.nextInt();
        System.out.print("Enter side2: ");
        int b = s.nextInt();
        System.out.print("Enter side3: ");
        int c = s.nextInt();

        if(a + b > c && b + c > a && a + c > b) {
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Not a Valid Triangle");
        }
    }
}
 */
/*
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
