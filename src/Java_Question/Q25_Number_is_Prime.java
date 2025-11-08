package Java_Question;
import java.util.Scanner;

public class Q25_Number_is_Prime {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number");
        int num= scanner.nextInt();

        if(num ==1) System.out.println("Prime number");
        else
        {
            for(int i=2;i<= Math.sqrt(num);i++)
            {
                if(num%i==0) {
                    System.out.println("Not a prime number");
                    return;
                }

            }
            System.out.println("Prime Number");
        }
    }
}

/*
 public static void main(String[] args)

    {
        Scanner sc =new Scanner(System.in);
        boolean status = true;
        System.out.println("Enter value to determine prime number or not");
        if(!sc.hasNextInt())
        {
            System.out.println("Enter a valid input!");
            return;
        }
        else
        {
            int num= sc.nextInt();
            if (num <= 1) {
                System.out.println(num + " is not a prime number.");
                return;
            }
            for(int i=2; i<=num/2;i++) {
                if (num % i == 0)
                {
                    status = false;
                    break;
                }
            }
            if(status== false)
            {
                System.out.println("The number  " + num + " is  not a prime number");
            }
            else
            {
                System.out.println("The number  " + num + " is a prime number");
            }
        }

    }
}
 */

/*
public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number");
            int number = scanner.nextInt();
            boolean isPrime= true;
            if (number<=1) {
                isPrime=false;
            } else {
                for(int i=2;i<=number/2;i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                }
            if(isPrime){
                System.out.println(number+ "is a prime number");
            } else {
                System.out.println(number + "not a prime number");
            }
        }
    }
 */

/*
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = scanner.nextInt();
        int count = 1;
        for (int i = 1; i <= 10;i++){
            if (num % i == 0){
                count++;
            }
        }
        if (count == 2){
            System.out.println("Prime Number");
        }
        else {
            System.out.println("Not a Prime Number");
        }

    }
}
 */

/*
 public static void main(String[] args) {
        int count=0;
        Scanner scn=new Scanner(System.in);
        System.out.println("enter a number");
        int number=scn.nextInt();
        for(int i=1;i<=number;i++)
        {
            if(number%i==0){
                count= count++;
            }
        }
        if(count==2)
        {
            System.out.println("number is a prime number");
        }
        else
        {
            System.out.println("Number is not prime");
        }
    }
}
 */

/*
 public static void main(String[] args) {
        Scanner somu = new Scanner(System.in);
        if(!somu.hasNextInt())
        {
            System.out.println("Only +ve Integer values are allowed");
        }
        int isPrimeOrNot = somu.nextInt();
        int factors = 0;
        if(isPrimeOrNot==0 || isPrimeOrNot ==1)
        {
            System.out.println("0 and 1 aren't considered as a Prime numbers");
        }

        if(isPrimeOrNot==2)
        {
            System.out.println("Not a prime number");
        }
        else
        {
            for(int i=1;i<=isPrimeOrNot/2;i++)
            {
                if(isPrimeOrNot%i==0)
                {
                    factors++;
                    if (factors >=2)
                    {
                        break;
                    }
                }
            }
        }

        if (factors>=2)
        {
            System.out.println("Not a prime number");
        }
        else
        {
            System.out.println("Prime number");
        }
    }
}
 */
/*
  public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=scanner.nextInt();

        boolean isprime=true;

        if (n<=1){
            isprime=false;
        }
        else {
            for (int i = 2; i <=n/2 ; i++) {
                if (n%i==0){
                    isprime=false;
                    break;
                }

            }
        }
        if (isprime){
            System.out.println(n + "->is a prime number");
        }
        else {
            System.out.println(n + " -> is not a prime number");
        }
    }

}
 */
/*
 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = s.nextInt();
        int c = 0;

        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                c++;
            }
        }

        if(c == 2) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
 */
/*
  public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number");
            int number = scanner.nextInt();
            boolean isPrime= true;
            if (number<=1) {
                isPrime=false;
            } else {
                for(int i=2;i<=number/2;i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                }
            if(isPrime){
                System.out.println(number+ "is a prime number");
            } else {
                System.out.println(number + "not a prime number");
            }
        }
    }
 */
/*
public static void main(String[] args) {
        System.out.print("Prime numbers between 1 and 100: ");

        for(int num = 2; num <= 100; num++){
            boolean isPrime = true;

            for (int divisor = 2; divisor * divisor <= num; divisor++){
                if (num % divisor == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}
 */
/*
 public static void main(String[] args) {

        * number should be greater than 1
        * number should have two factors 1 and the same number itself

int num=0,count=0;
num -->to receive user input number from console
 * count-->to count number of factors for that number
 *
Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        if(sc.hasNextInt()){
num=sc.nextInt();
        }
                else{
                System.out.println("Enter a valid integer number");
        }
                if(num>1)
        {
        for(int i=1;i<=num;i++)//To verify the number divisibility from 1 to that number
        {
        if(num%i==0)//To find its factor
        {
count++;
        }
        }
        if(count==2)
        System.out.println("Number "+num+" is prime");
           else
                   System.out.println("Number "+num+" is not a prime");

        }
                else {
                System.out.println("Enter a integer greater than 1");
        }
                }
                }
 */