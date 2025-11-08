package Java_Question;
import java.util.Scanner;
// Check if a number is divisible by 5 and 11
public class Q35_Number_Divisible_by_5_And_11_Checker {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");

        int num=sc.nextInt();
        if(num%5==0 && num%11==0)
        {
            System.out.println("Number is divisible by both 5 and 11");
        }
        else{
            System.out.println("Not divisible by 5 and 11");
        }
    }
}

/*
 public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=0;
        while(true)
        {
            try
            {
                System.out.println("Enter number for divisibility check by 5 and 11: ");
                num=sc.nextInt();
                if(num<0)
                {
                    System.out.println("Enter correct number: ");
                    continue;
                }
                break;
            }
            catch(InputMismatchException e)
            {
                System.out.println("Invalid input, please enter correct input: ");
            }
        }
        if(num%5==0 && num%11==0)
        {
            System.out.println("Given number is divisible by 5 & 11 ");
        }
        else
            System.out.println("Given number is not divisible by 5 or 11");
    }
}
 */

/*
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scanner.nextInt();
        String result = (num % 5 == 0 && num % 11 == 0) ? "Number is divisible by 5 and 11" : "Number is not divisible by 5 and 11";
        System.out.println(result);

    }
}
 */

/*
public static void main(String[] args) {
		// TODO Auto-generated method stub
		//22)  Check if a Number is Divisible by 5 and 11
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number to know  if a Number is Divisible by 5 and 11");
		isdivisable(sc);
		sc.close();

	}

	private static void isdivisable(Scanner sc) {
		// TODO Auto-generated method stub
		if (sc.hasNextDouble())
		{
			double userinput = sc.nextDouble();
			if (userinput % 5 == 0 && userinput % 11 == 0)
			{
				System.out.println(userinput + " Is divisible by 5 and 11 both");
			}
			else System.out.println(userinput + " Is not divisible by 5 and 11 both");
		}
		else System.out.println("Enter number properly!!");
	}

}
 */