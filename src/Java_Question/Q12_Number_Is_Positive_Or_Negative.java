package Java_Question;
import java.util.Scanner;
// Check if a Number is Positive or Negative.

public class Q12_Number_Is_Positive_Or_Negative {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=scanner.nextInt();
        if(num>0)
            System.out.println("Number is positive");

        else if (num<0)
            System.out.println("Number is negative");

        else if(num==0)
            System.out.println("Number is 0");
        scanner.close();
    }
}

/*
  public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number ");

        int num = sc.nextInt();

        String result = num >= 0 ? "Positive" : "Negative";

        System.out.println(result);

    }
}
 */

/*
public class Task_001_Check_Number_Is_Positive_Or_Negative {
    public static void main(String[] args) {
        System.out.println("Enter an integer:");
        Scanner sc=new Scanner(System.in);
        if(sc.hasNextInt())
        {
            int number= sc.nextInt();
            if(number<0)
            {
                System.out.println("You number is Negative Integer");
            } else if (number==0) {
                System.out.println("Your number is Zero");

            }else{
                System.out.println("Your number is positive integer");
            }
        }
        else {
            System.out.println("Enter valid integer number");
            sc.next();
        }
        sc.close();
    }
}
 */

/*
public class NumberPositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        if(sc.hasNextInt())
        {
            int number = sc.nextInt();
            if( number <0)
                System.out.println("Number is negative");
            else if (number>0)
                System.out.println("Number is positive");
            else System.out.println("Entered number is 0");
        }
        else {
            System.out.println("Enter a valid integer number");
        }
        sc.close();
    }

}
 */