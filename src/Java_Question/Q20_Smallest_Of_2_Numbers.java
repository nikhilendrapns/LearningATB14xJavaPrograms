package Java_Question;
import java.util.Scanner;

//Find the Smallest of Two Numbers.
public class Q20_Smallest_Of_2_Numbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number ");
        int n1 = scanner.nextInt();
        System.out.println("Enter 2nd number ");
        int n2 = scanner.nextInt();

        int smallest= (n1<n2)? n1 :n2;

        System.out.println("Smallest among 2 numbers is "+smallest);
    }
}
/*
public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the 2 numbers");
        int a,b;
        if(sc.hasNextInt()) {
             a = sc.nextInt();
        }
        else {
            System.out.println("Invalid input.Enter a valid first number");
            return;
        }
        if(sc.hasNextInt()) {
             b = sc.nextInt();
        }
        else {
            System.out.println("Invalid input.Enter a valid second number");
            return;
        }
        if(a< b)
        {
            System.out.println("Smallest number is " +a);
        }
        else if(a==b)
        {
            System.out.println("Two numbers are equal.Enter different numbers");

        }
        else {
            System.out.println("Smallest number is " +b);
        }
    }
}
 */

/*
 public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the 2 numbers");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        if(num1<num2){
            System.out.println("num1 is smaller"+num1);
        }
        else if(num2<num1){
            System.out.println("num2 is smaller"+num2);
        }
        else{
            System.out.println("Both numbers are equal");
        }
    }
}
 */