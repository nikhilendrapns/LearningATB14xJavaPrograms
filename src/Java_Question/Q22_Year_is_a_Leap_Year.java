package Java_Question;
import java.util.Scanner;
public class Q22_Year_is_a_Leap_Year {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter year");
        int year =scanner.nextInt();

        if((year%4==0 && year%100!=0) || (year%400==0))
            System.out.println("Its a leap year");
        else System.out.println("Not a leap year");
    }
}
/*
public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the year");
        int a;
        if(!sc.hasNextInt())
        {
            System.out.println("Enter valid year");
            return;
        }
        else if (sc.hasNextInt())
        {
            a= sc.nextInt();
            if(a%4==0)
            {
                System.out.println("The year " + a+ " is a leap year");
            }
            else
            {
                System.out.println("The year " + a+ " is not a leap year");
            }
        }
    }
 */

/*
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = scanner.nextInt();
        if (year % 400 == 0) {
            System.out.println(year + "is a leap year");
        } else if (year % 100 == 0) {
            System.out.println(year + "not a leap year");
        } else if (year % 4 == 0) {
            System.out.println(year + "is a leap year");
        } else {
            System.out.println(year + "not a leap year");
        }
    }
 */

/*
  int year = 1900;
        if (year % 100 == 0 && year % 400 == 0 && year % 4 == 0
                || (year % 4 == 0 && year % 100 != 0) ){
            System.out.println(year +" is a leap year");
        } else {
            System.out.println(year +" is not a leap year");
        }
    }
}
 */
/*
ublic static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        if(!sca.hasNextInt())
        {
            System.out.println("Only +ve Integers values are allowed");
        }

        boolean flag = false;
        int year = sca.nextInt();

        if(year%4==0)
        {
            flag = true;
            if(year%100==0)//to check if it is a Century year
            {
                if(year%400==0)
                {
                    flag = true;
                }
                else
                {
                    flag = false;
                }
            }
        }
        else
        {
            flag = false;
        }
        if (flag)
        {
            System.out.println("Its a leap year");
        }
        else
        {
            System.out.println("Not a leap year");
        }
    }
}
 */
/*
 public static void main(String[] args) {
        // Check if a Year is a Leap Year
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year");
        if (input.hasNextInt()) {
            int year = input.nextInt();

            if (year <= 0) {
                System.out.println("Please enter a valid positive year.");
            } else {

                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println(year + " is a leap year.");
                } else {
                    System.out.println(year + " is not a leap year.");
                }
            }
        } else {

            System.out.println("Invalid input! Please enter a valid numeric year.");
        }
    }
}
 */