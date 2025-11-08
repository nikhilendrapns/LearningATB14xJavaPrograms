package Java_Question;

/*
Find if a Person Can Travel Based on Visa Status and Age.
take the input from the user for
Age (integer).
Visa Status (String or boolean).
Check Eligibility:
        :- If age is 18 or older and visa status is valid, the person can travel.
Otherwise, the person cannot travel.
Validation Criteria
Age: - Must be a non-negative integer.
        :- Should be greater than or equal to 18 to be eligible to travel.
Visa Status :- Must be a valid string indicating the visa status (e.g., "valid" or "invalid").
        :- You can also use a boolean where true indicates a valid visa and false indicates an invalid visa.
       */

import java.util.Scanner;

public class Q34_Travel_Visa_Based_On_Status_And_Age {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Visa Status (valid/invalid): ");
        String visa = sc.nextLine().toLowerCase();

        if (age < 0)
            System.out.println("Invalid age entered!");
        else if (age < 18)
            System.out.println("Not eligible: Must be 18 or older to travel.");
        else if (visa.equals("valid"))
            System.out.println("You are allowed to travel.");
        else
            System.out.println("You cannot travel due to invalid visa.");
    }
}

/*
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        System.out.print("Enter Visa Status (valid/invalid): ");
        String visa = scanner.nextLine();

        if (age >= 18) {
            if (visa.equalsIgnoreCase("valid")) {
                System.out.println("Person can travel");
            } else {
                System.out.println("Cannot travel - Visa invalid");
            }
        } else {
            System.out.println("Cannot travel - Age below 18");
        }
    }
}
 */

/*
public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int Age=0;
        boolean visa=false;
        while(true)
        {
            try
            {
                System.out.println("Enter age:");
                Age=sc.nextInt();
                if(Age<0)
                {
                    System.out.println("Invalid age, please enter correct age:");
                    continue;
                }
                System.out.println("Enter Visa status:");
                visa=sc.nextBoolean();
                break;
            }
            catch(InputMismatchException e)
            {
                System.out.println("invalid input,please enter correct input: ");
                sc.nextLine();
            }
        }
        if(Age>=18)
        {
            if(visa)
            {
                System.out.println("Eligible for Travel");
            }
            else
                System.out.println("Not eligible for Travel, as Visa Status is invalid or False");
        }
        else
        {
            System.out.println("Person below 18 years of age are not eligible to Travel");
        }
    }
}
 */

/*
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (isAgeValid(sc) && isVisaValid(sc)) {
            System.out.println("Allowed to travel");
        } else {
            System.out.println("Not allowed to travel");
        }
    }

    public static boolean isAgeValid(Scanner sc)
    {
        System.out.println("Enter a valid age . Age should be greater than or equal to 18");
        int age=sc.nextInt();
        if(age<0)
        {
            System.out.println("Enter a valid age");
            return false;
        }
        if(age<18)
        {
            System.out.println("Too young !");
            return false;
        }
        else return true;
    }

    public static boolean isVisaValid(Scanner sc)
    {
        System.out.println("Is Visa Valid? Enter Y for Valid and I for invalid");
        char visaStatus= sc.next().charAt(0);
        if(visaStatus== 'Y' || visaStatus=='y')
        {
            return true;
        }
        else if(visaStatus=='I' || visaStatus=='i')
        {
            return false;
        }
        else
        {
            System.out.println("Please enter valid status");
            System.exit(1);
            return false;
        }
    }
}
 */

/*
  public static void main(String[] args) {
        int age=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:");
        if(sc.hasNextInt())
        {
            age=sc.nextInt();
        }
        else {
            System.out.println("Enter valid integer");
        }
        System.out.println("Enter your Visa status(valid/Invalid)");
        String visa_status= sc.next().toLowerCase();
        if(age<0)
        {
            System.out.println("Enter valid age");
        } else if (age>=0 && age<18 || visa_status.equalsIgnoreCase("invalid")) {
            System.out.println("Sorry!! You are not eligible to travel!!");
        } else if (age>=18 && (visa_status.equalsIgnoreCase("valid"))) {
            System.out.println("Congratulations!! You are eligible to travel");
        }


    }
}
 */

/*
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age of person: ");
        int age = scanner.nextInt();
        if (age >= 18){
            System.out.println("Enter Visa status(valid/invalid): ");
            String visa_status = scanner.next();
            if (visa_status.equalsIgnoreCase("valid")){
                System.out.println("Person can travel");
            } else if (visa_status.equalsIgnoreCase("invalid")) {
                System.out.println("Person can't travel because of invalid visa");
            }
            else {
                System.out.println("Visa status must be either valid or invalid!!!");
            }
        }
        else if(age < 0){
            System.out.println("Age must be a positive value!!!");
        }
        else {
            System.out.println("Person can't travel as age is less than 18");
        }
    }
}
 */

/*
  static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your age: ");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter visa status (valid / invalid): ");
        String visaStatus = scanner.nextLine().toLowerCase();

        if (age < 0) {
            System.out.println("Invalid age. Age cannot be negative.");
        }

        else if (age >= 18 && visaStatus.equals("valid")) {
            System.out.println(" You are eligible to travel!");
        } else {
            System.out.println(" You cannot travel (either underage or visa invalid).");
        }
        scanner.close();
    }
}
 */

/*
public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Visa Status as Valid Or Invalid");
		String visastatus = sc.nextLine().trim();
		if (visastatus.equalsIgnoreCase("valid"))
		{
			travelcheck(sc);
		}
		else if(visastatus.equalsIgnoreCase("invalid"))
		{
			System.out.println("Not eligible for travel due to Invalid Visa!!");


		}
		else {System.out.println("Please mention Valid or Invalid only!!");}
		sc.close();


	}

	private static void travelcheck(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("Enter your Age");
		int age= sc.nextInt();
		if (age < 18)
		{
			System.out.println("Not eligible for travel due to Age is less than 18");
		}

		else {
			System.out.println("Eligible for travel as Age and Visa are proper!!");

		}

}

}
 */

/*
  public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);
        System.out.println("enter age");
        int age=scn.nextInt();
        System.out.println("enter visa status");
        String visa_status=scn.next();
        if(age>0 & age>18 & visa_status.equals("valid")){
            System.out.println("person can travel");
        }
        else
        {
            System.out.println("person cannot travel");
        }

    }

}
 */

/*

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        System.out.print("Enter Visa Status (valid/invalid): ");
        String visa = scanner.nextLine();

        if (age >= 18) {
            if (visa.equalsIgnoreCase("valid")) {
                System.out.println("Person can travel");
            } else {
                System.out.println("Cannot travel - Visa invalid");
            }
        } else {
            System.out.println("Cannot travel - Age below 18");
        }
    }
}


 */

/*
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Age");
        int age = scanner.nextInt();
        System.out.println("Enter visa status (valid/invalid): ");
        String visa = scanner.next();
        if(age>0 & age >=18 & visa.equalsIgnoreCase("valid")) {
            System.out.println("You can Travel");
        }
            else{
                System.out.println("You cannot Travel");
            }
        }
    }
 */