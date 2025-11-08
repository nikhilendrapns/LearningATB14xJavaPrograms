package Java_Question;
import java.util.Scanner;
public class Q29_Number_is_an_Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum = sum + (digit * digit * digit);
            num = num / 10;
        }

        if (original == sum)
            System.out.println(original + " is an Armstrong number.");
        else
            System.out.println(original + " is NOT an Armstrong number.");
    }
}

/*
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int num = scanner.nextInt();
        int a1 = num / 100;  // hundreds
        int a2 = (num / 10) % 10; // tens
        int a3 = num % 10; // units
        int sum = (a1*a1*a1) + (a2*a2*a2) + (a3*a3*a3); // 1³ + 5³ + 3³ = 1 + 125 + 27 = 153
        if (num == sum) {
            System.out.println(num + " is Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }
}
 */
/*
 public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=0;
        int n=0;
        int arms=0;

    while(true)
    {
        try
        {
            System.out.println("Enter number for armstrong check: ");
            num=sc.nextInt();
            break;
        }
        catch(InputMismatchException e)
        {
            System.out.println("Enter valid input for Armstrong check");
            sc.nextLine();
        }
    }
    n=String.valueOf(Math.abs(num)).length();
    int original=num;
    for(int i=1;i<=n;i++) {
        int  temp=num%10;

        arms=arms+(int)Math.pow(temp,n);
        num=num/10;
    }
    if(original==arms)
    {
        System.out.println("Armstrong number");
    }
    else
    {
        System.out.println("Not an Armstrong number");
    }
    }
    }
 */
/*

Armstrong Number
abcd = pow(a,n) + pow(b,n) + pow(c,n) + pow(d,n)
    here n=length of the number

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();

        if(IsArmstrongNumber(num))
            System.out.println("Armstrong number");
        else System.out.println("Not a armstrong number");
    }

    public static boolean IsArmstrongNumber(int num)
    {
        int sum=0;
        int temp=num;
        int order=powerOrder(num);
        while(temp!=0)
        {
            sum=sum+ (int)Math.pow(temp%10,order);
            temp=temp/10;
        }
        //  System.out.println(sum);
        return (num==sum) ;
    }

    public static int powerOrder(int num)
    {
        int c=0;
        while(num!=0)
        {
            num=num/10;
            c++;
        }
        return c;
    }
}
 */
/*
 public static void main(String[] args) {
        System.out.println("Enter a number to verify armstrong or not: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
   int compare_num=num,sum=0,last_digit=0;

        while(num>0)//loop execute until num become o
        {
         //to get last digit from number
            last_digit=num%10;
            //To remove last digit from number
            num=num/10;
            //To find armstrong number
            sum=sum+last_digit*last_digit*last_digit;
        }
if(sum==compare_num)
{
    System.out.println("Given number is armstrong");
}
else{
    System.out.println("Given number is not armstrong");
}

        }
    }
 */
/*
 //An Armstrong number is a number that is equal to the sum of its own digits, each raised to the power of the total number of digits.
    // For example, \(153\) is an Armstrong number because it has three digits, and
    // 1^{3}+5^{3}+3^{3}=1+125+27=153
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number :");
        String input = scanner.next();
        int len = input.length();
        int num = Integer.parseInt(input);
        int sum = 0 ;
        while(num != 0){
            int rem = num % 10 ;
            sum = sum + (int)Math.pow(rem,len);
            num = num /10;
        }
        System.out.println(sum);
        if (input.equalsIgnoreCase(String.valueOf(sum))){
            System.out.println("Armstrong Number");
        }else {
            System.out.println("Not an Armstrong Number");
        }
    }
}
 */
/*
public static void main(String[] args) {
		// TODO Auto-generated method stub
		//- Calculation: 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
		//sum of its own digits each raised to the power of the number of digits in the number.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check Armstrong or not");
		int input= sc.nextInt();
		isArmstrong(input);


	}

	public static void isArmstrong(int input)
	{
		int  sum = 0;
		String s = Integer.toString(input);
		for(int i = 0 ; i< s.length() ; i ++)
		{

		    int valueat = s.charAt(i)- '0';  // changes char to int
			sum += Math.pow(valueat, s.length());
			//Compound assignment (+=,-= , etc.) includes implicit casting, while simple assignment (=) requires explicit casting if types differ
		}

		if (sum == input)
		{
			System.out.println("Is Armstrong");
		}
		else System.out.println("Not Armstrong");

	}
}
 */
/*
public static void main(String[] args) {
        int num = 153;
        int digits=String.valueOf(num).length();

        int originalnum=num;

        int sum = 0;


        while ( num>0) {
            int digit=(num%10);
            sum= (int) (sum+Math.pow(digit,digits));
            num=num/10;

        }
        System.out.println("sum is "+ sum);
        if (originalnum == sum)
        {
            System.out.println("number is Armstrongnumber");
        }
        else {
            System.out.println("number is  not Armstrongnumber");
        }
    }
}
 */
/*
 public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        int a1 = num / 100;  // hundreds
        int a2 = (num / 10) % 10; // tens
        int a3 = num % 10; // units
        int sum = (a1*a1*a1) + (a2*a2*a2) + (a3*a3*a3); // 1³ + 5³ + 3³ = 1 + 125 + 27 = 153
        if (num == sum) {
            System.out.println(num + " is Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }
}
 */