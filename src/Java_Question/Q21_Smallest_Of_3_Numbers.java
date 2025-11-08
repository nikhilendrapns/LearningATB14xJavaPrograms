package Java_Question;
import java.util.Scanner;
public class Q21_Smallest_Of_3_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number ");
        int n1 = scanner.nextInt();
        System.out.println("Enter 2nd number ");
        int n2 = scanner.nextInt();
        System.out.println("Enter 3rd number ");
        int n3 = scanner.nextInt();

        int smallest = (n1<=n2 && n1<=n3)?n1 : (n2<=n3)?n2 :n3;

        System.out.println("Smallest among 3 numbers is "+smallest);
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
        if (a < b && a < c) {
            System.out.println("a is the smallest number " + a);
        } else if (b < c && b < a) {
            System.out.println("b is the smallest number " + b);
        } else if (c < a && c < b) {
            System.out.println("c is the smallest number " + c);
        } else if (a == b || a == c || b == c) {
            System.out.println("Two or more numbers are equal.Enter different numbers");
        }
    }

}
 */

/*
 public static void main(String[] args){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the number1");
            int num1=scanner.nextInt();
            System.out.println("Enter the number2");
            int num2=scanner.nextInt();
            System.out.println("Enter the number3");
            int num3=scanner.nextInt();
            if (num1 == num2 && num2 == num3) {
                System.out.println("All three numbers are equal: " + num1);
            }
            else if((num1<=num2)&&(num1<=num3)){
                System.out.println("number1 is smaller"+num1);
            }
            else if((num2<=num3)&&(num2<=num1)){
                System.out.println("number2 is smaller"+num2);
            }
            else{
                System.out.println("number3 is smaller"+num3);
            }
        }
    }
 */

/*
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        if (num1 <= num2 && num1 <= num3){
            System.out.println("Smallest of three numbers is :"+ num1);
        } else if (num2 < num1 && num2 <= num3) {
            System.out.println("Smallest of three numbers is :"+ num2);
        }
        else {
            System.out.println("Smallest of three numbers is :"+ num3);
        }
    }
}
 */

/*
public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter first number");
        int number_1st=scn.nextInt();
        System.out.println("Enter second number");
        int number_2nd=scn.nextInt();
        System.out.println("Enter third number");
        int number_3rd=scn.nextInt();
        String result=(number_1st<number_2nd)?(number_1st<number_3rd)?"number_1stis smallest":"number_3rd is smallest":(number_2nd<number_3rd)?"number_2ndis smallest":"number_3rd is smallest";
        System.out.println("smallest number is "+result);
    }
}
 */

/*
 public static void main(String[] args){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the number1");
            int num1=scanner.nextInt();
            System.out.println("Enter the number2");
            int num2=scanner.nextInt();
            System.out.println("Enter the number3");
            int num3=scanner.nextInt();
            if (num1 == num2 && num2 == num3) {
                System.out.println("All three numbers are equal: " + num1);
            }
            else if((num1<=num2)&&(num1<=num3)){
                System.out.println("number1 is smaller"+num1);
            }
            else if((num2<=num3)&&(num2<=num1)){
                System.out.println("number2 is smaller"+num2);
            }
            else{
                System.out.println("number3 is smaller"+num3);
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
        if (num[0] < num[1] && num[0] < num[2]) {
            System.out.println(num[0] + " is smallest");
        } else if (num[1] < num[0] && num[1] < num[2]) {
            System.out.println(num[1]+" is smallest");
        }
        else {
            System.out.println(num[2]+" is smallest");
        }

    }
}
 */