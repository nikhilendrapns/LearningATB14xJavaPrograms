package Java_Question;
import java.util.Scanner;
public class Q14_Max_of_2_Numbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=scanner.nextInt();
        System.out.println("Enter second number");
        int num2=scanner.nextInt();

        if(num1==num2)
            System.out.println("Both numbers are equal");
        else
            System.out.println("Max out of 2 numbers is " +(num1 > num2 ? num1 : num2));

        scanner.close();
    }
}

/*
 static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int max = 0;
        if(a > b)
        {
            max = a;
        }
        else
        {
            max = b;
        }
        System.out.println("Max of the two number is : " + max);
    }
}
 */

/*
public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter scond number");
		int b = sc.nextInt();
		if(a>b){
		System.out.printf("%d is max",a);
		}else{
		System.out.printf("%d is max",b);
		}
	}
}
 */

/*
 public static void main(String[] args) {

        Scanner scn= new Scanner(System.in);
        System.out.println("enter a number");
        int number1=scn.nextInt();
        System.out.println("enter a number");
        int number2=scn.nextInt();
        String num=(number1>number2)? "number1_is big":"number2 is big";
        System.out.println(num);
    }
}
 */
/*
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        if (!sc.hasNextFloat()) {
            System.out.println("Invalid input! Please enter a valid number");
            sc.close();
            return;
        }
        float num1 = sc.nextFloat();
        System.out.println("Enter the second number");
        if (!sc.hasNextFloat()) {
            System.out.println("Invalid input! Please enter a valid number");
            sc.close();
            return;
        }
        float num2 = sc.nextFloat();
        if(num1>num2)
        {
            System.out.println("First number is the greatest");
        } else if (num1< num2)
        {
            System.out.println("second number is the greatest");
        } else if (num1 ==num2)
        {
            System.out.println("Both numbers are equal");
        }
    }
}
       /* {
            float num1 = sc.nextFloat();
            System.out.println("Enter the second number");
            if (sc.hasNextFloat()) {
                float num2 = sc.nextFloat();
                if (num1 > num2) {
                    System.out.println("First number is greatest");
                } else {
                    System.out.println("Second number is greatest");
                }
            } else
            {
                System.out.println("Invalid input! Please enter a valid number");
            }

        } else {
            System.out.println("Invalid input! Please enter a valid number");

        }
    }
}
*/

/*
public class MaximumOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else if (num2 > num1) {
            System.out.println(num2 + " is greater than " + num1);
        } else {
            System.out.println("Both numbers are equal.");
        }

        sc.close();
    }
}
 */
/*
  public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        if(scan.hasNextInt()){
            int num1 = scan.nextInt();
            System.out.println("Enter 2nd number: ");
            if(scan.hasNextInt()) {
                int num2 = scan.nextInt();
                if(num1>num2)
                    System.out.printf("Number %d is maximum", num1);
                else if(num1<num2)
                    System.out.printf("Number %d is maximum", num2);
                else
                    System.out.println("Both Numbers are equal");
            }
            else
                System.out.println("Enter number only");
        }else
            System.out.println("Enter number only");


    }

}
 */

/*
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = maxin(scan,"Enter Num1");
        int num2 = maxin(scan,"Enter Num2");

        if(num1>num2){
            System.out.println("Num 7" + num1 + " is bigger");
        }else{
            System.out.println("Num 8" + num2 + " is bigger");
        }

    }
    static int  maxin(Scanner scan , String prompt){
        System.out.println(prompt);
        if(scan.hasNextInt()){
            return scan.nextInt();
        }else{
            System.out.println("Enter No. only");
            System.exit(0);
            return 0;

        }



    }
}
 */

/*
  public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number ");
        int num2 = sc.nextInt();

        int maxNum = Math.max(num1, num2);

        System.out.println("Max is "+maxNum);
    }
}
 */
/*
 public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number1");
        int number1=scanner.nextInt();
        System.out.println("Enter number2");
        int number2=scanner.nextInt();
        if (number1==number2){
            System.out.println("Both numbers are equal");
        }
        else {
            int max = (number1 > number2) ? number1 : number2;
            System.out.println("Maximum of 2 numbers"+max);
         }



    }
}
 */
/*
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("Maximum is: " + num1);
        } else if (num2 > num1) {
            System.out.println("Maximum is: " + num2);
        } else {
            System.out.println("Both numbers are equal.");
        }

        scanner.close();
    }
}
 */