package Java_Question;
import java.util.Scanner;
public class Q13_Number_Is_Even_Or_Odd {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=scanner.nextInt();

        if(num%2==0)
            System.out.println("Number is Even");
        else
            System.out.println("Number is odd");

        scanner.close();
    }
}
/*
public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        if(sc.hasNextInt()) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                System.out.println("The number is an even number");
            } else {
                System.out.println("The number is an odd number");
            }
        }
            else
            {
                System.out.println("Enter an integer to determine whether its odd or even");
            }
        }
}
 */

/*
  public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        oeCheck(scan, "Enter Num");
    }

    static void oeCheck(Scanner scan, String prompt) {
        System.out.println(prompt);
        if (scan.hasNextInt()) {
            int num = scan.nextInt();
            if (num % 2 == 0) {
                System.out.println(num + " is Even No.");
            } else {
                System.out.println(num + " is ODD No.");
            }
        }
    }
}
 */

/*
public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number ");

        int num = sc.nextInt();

        String result = num %2 == 0 ? "Even" : "Odd";

        System.out.println("Number is "+result);

    }
}
 */

/*
public class Task_002_Check_Number_Is_Even_Or_Odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=0;
        if(sc.hasNextInt()){
            number= sc.nextInt();
            if(number>-1) {
                if (number % 2 == 0) {
                    System.out.println("The number is even");
                } else {
                    System.out.println("The number is odd");

                }
            }else {
                System.out.println("Enter positive integer");
            }
        }else {
            System.out.println("Enter valid integer");
        }
    }

}
 */