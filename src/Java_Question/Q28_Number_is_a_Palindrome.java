package Java_Question;
import java.util.Scanner;
public class Q28_Number_is_a_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num, reversed = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }

        if (original == reversed)
            System.out.println(original + " is a Palindrome number.");
        else
            System.out.println(original + " is NOT a Palindrome number.");
    }
}

/*
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 digit number: " );
        int num = scanner.nextInt();
        int first = num / 100;
        int last = num % 10;
        if (first == last) {
            System.out.println(num + " is Palindrome number"); // 121 is a Palindrome number.
        } else {
            System.out.println(num + " not a Palindrome number");
        }

    }
}
 */
/*
  public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s="";
        String rev="";
        while(true)
        {
            try
            {
                System.out.println("Enter string for palindrome check");
                s=sc.nextLine();
                break;
            }
            catch(InputMismatchException e)
            {
                System.out.println("invalid input,please enter string");
                sc.nextLine();
            }

        }
        for(int i=s.length()-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);
        }
        if(s.equals(rev))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a palindrome");
        }

    }
}
 */

/*
public static void main(String[] args) {
        System.out.println("Enter a number to check palindrome or not:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        int chk_num=num;
        int rev = 0;
        if (num == 0) {
            System.out.println("Reverse of " + num + " is " + num+ "hence it is palindrome");
        } else {
            while(num!=0){
                rev =rev*10+num%10;
                num=num/10;
            }
            System.out.println("Reverse of given number is " + rev);
            if(chk_num==rev)
            {
                System.out.println("Given number is palindrome");
            }
            else{
                System.out.println("Given number is not palindrome");
            }
        }
    }
}
 */
/*
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any string :");
        String input = scanner.next();

        StringBuilder sb = new StringBuilder();
        String revstring = sb.append(input).reverse().toString();

        if (input.equalsIgnoreCase(revstring)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }
}
 */
/*
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        int reverseNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reverseNumber = reverseNumber * 10 + digit;
            number = number / 10;
        }
        if (originalNumber == reverseNumber) {
            System.out.println(originalNumber + " is a palindrome number.");
        } else {
            System.out.println(originalNumber + " is not a palindrome number.");
        }
        scanner.close();
    }
}
 */
/*
public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Check if a Number is a Palindrome. Ex Madam

		Scanner sc = new Scanner(System.in);
		System.out.println("Palindrome Check!! Enter your text: ");
		String userInput= sc.nextLine();
		isPalindrome(userInput);


	}
	public static void isPalindrome(String userInput)
	{
		StringBuilder sb = new StringBuilder();
		for(int i = userInput.length()-1 ; i >= 0; i--)
		{
			sb = sb.append(userInput.charAt(i));
		}


		if (userInput.equalsIgnoreCase(sb.toString()))
		{
			System.out.println( userInput+ " is a Palindrome");
		}
		else System.out.println(userInput + " is Not a palindrome!!!");
	}

}
 */
/*
 public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three digit number");
        int num = sc.nextInt();
        int first = num/100;
        int last = num%10;
        if(first==last){
            System.out.println(num + " is a palindrome"); // 131 is a palindrome
        }
        else {
            System.out.println(num + " is not a palindrome");

        }
    }
}
 */