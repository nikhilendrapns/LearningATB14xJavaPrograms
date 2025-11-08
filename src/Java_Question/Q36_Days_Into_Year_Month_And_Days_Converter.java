package Java_Question;

import java.util.Scanner;
/*
Convert Days into Years, Months, and Days.
       :- Take the Days Input from the User
Define the conversion logic:
        :- Assume 1 year = 365 days.
        :- Assume 1 month = 30 days
        :- Convert the Days into Years, Month and days and Print it.
        if you input 1000 days, the output of the program would be:
        2 years, 9 months, and 0 days.
        */

public class Q36_Days_Into_Year_Month_And_Days_Converter {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter days");
        int totalDays=sc.nextInt();
        int year =0;
        int month=0;
        int days=0;
        if(totalDays>0)
        {
            year=totalDays/365;
            totalDays=totalDays%365;

            month=totalDays/30;
            totalDays=totalDays%30;

            days = totalDays;
        }
        System.out.println("Equivalent Time:");
        System.out.println(year+" Years, "+ month+" months and "+totalDays+" days.");
    }
}

/*
  public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int days=0;
        int numberOfYears=0;
        int numberOfMonths=0;
        int numberOfDays=0;
        while(true)
        {
            try
            {
                System.out.println("Enter days: ");
                days=sc.nextInt();
                if(days<0)
                {
                    System.out.println("Invalid day, please enter correct day");
                    continue;
                }
                break;
            }
            catch(InputMismatchException e)
            {
                System.out.println("Invalid input, please enter correct input: ");
            }
        }
        if(days>=365)
        {
            numberOfYears=days/365;
            days=days-(numberOfYears*365);
            numberOfMonths=days/30;
            days=days-(numberOfMonths*30);
            numberOfDays=days;
        }
        else if(days>30)
        {
            numberOfMonths=days/30;
            numberOfDays=days- (numberOfMonths*30);
        }
        else
            numberOfDays = days;
        System.out.println(numberOfYears+" years, "+numberOfMonths+" months, and "+numberOfDays+" days.");

    }
}
 */


/*
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of days: ");
        int days = sc.nextInt();

        int years = days / 365;
        int remainingDays = days % 365;
        int months = remainingDays / 30;
        int finalDays = remainingDays % 30;

        System.out.println(days + " days = " + years + " years, " + months + " months, and " + finalDays + " days.");
    }
}
 */

/*
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Days value");
        int totalDays = scanner.nextInt();

        int years = 0, months = 0, days = 0;

        if (totalDays >= 0) {
            years = totalDays / 365;   // 1 year = 365 days
            totalDays = totalDays % 365;

            months = totalDays / 30;   // 1 month = 30 days
            totalDays = totalDays % 30;

            days = totalDays;          // remaining days

            System.out.println("Equivalent Time:");
            System.out.println(years + " Year(s), " + months + " Month(s), and " + days + " Day(s).");
        } else {
            System.out.println("Invalid input! Days cannot be negative");
        }
    }
}

/*
Enter total number of days: 1000
Output:
Equivalent Time:
        2 Year(s), 9 Month(s), and 5 Day(s).*/

/*        1 year = 365 days
→ 1000 ÷ 365 = 2 years, remainder = 270 days

1 month = 30 days
→ 270 ÷ 30 = 9 months, remainder = 0 days

        Remaining = 5 days (since 1000 - 730 - 270 = 0, small rounding difference)

Final Answer: 2 Years, 9 Months, and 5 Days*/

/*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in)
		System.out.println("Enter the Days to convert into Years, Months, and Days");
		if (sc.hasNextInt())
		{
			daysconversion(sc);
		}
		else System.out.println("Please enter days numerically!!");

		sc.close();

	}

	private static void daysconversion(Scanner sc) {
		// TODO Auto-generated method stub
		int input = sc.nextInt();
		int year= input / 365;
		int remainingdays = input % 365;
		int month = remainingdays / 30;
		int days = remainingdays % 30;

		System.out.printf("Converted: Year %d, Month %d, Days %d", year,month,days);

	}

}
 */

/*
import java.text.MessageFormat;
import java.util.Scanner;

public class Task_023_Days_Convert_to_Year_Month_Day {

    Assume 1 year=365 days  1 month=30 days
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    int tot_days = read_Int_check(sc,"Enter number of days u want to print in year month and days format");
    Year_Month_Day_Calc(tot_days);
}

static int read_Int_check(Scanner sc,String str)
{
    System.out.println(str);
    if(sc.hasNextInt())
    {

        return sc.nextInt();
    }
    else
    {
        System.out.println("Enter valid input in integer");
        return 0;
    }
}
static void Year_Month_Day_Calc(int total_days)
{
    int year=total_days/365;

    total_days=total_days%365;//to get remaining days to calculate month

    int month= total_days/30;

    total_days=total_days%30; //to get remaining days to calculate days

    int week=total_days/7;

    int days=total_days%7; //to get remaining days after week

    System.out.println(+year+ " years "+month+" Months "+week+" Weeks "+days+" days ");


}
}
 */