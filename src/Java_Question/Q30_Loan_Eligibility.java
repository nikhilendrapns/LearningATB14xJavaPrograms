package Java_Question;

import java.util.Scanner;
/*
 * Take the below User info and store it into the variables:

              Age (integer)

              Salary (double or float)

              Credit Score (integer)



    Age Validation:

              :- Check if the age is a positive integer.

              :- Ensure the age is at least 18 years old.

              :- Max age can be 80.



    Salary Validation:

             :- Check if the salary is a positive number.

             :- Define a minimum salary threshold (e.g., 30,000).

    Credit Score Validation:

             :- Check if the credit score is a positive integer.

             :- Define a minimum credit score threshold (e.g., 650).

             :- Max credit score threshold (e.g., 850).


 */
public class Q30_Loan_Eligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Credit Score: ");
        int creditScore = sc.nextInt();

        if (age <= 0 || salary <= 0 || creditScore <= 0) {
            System.out.println("Invalid input! Enter positive values.");
        } else if (age < 18) {
            System.out.println("Not eligible: Minimum age is 18.");
        } else if (age > 80) {
            System.out.println("Not eligible: Maximum age is 80.");
        } else if (salary < 30000) {
            System.out.println("Not eligible: Salary must be at least ₹30,000.");
        } else if (creditScore < 650) {
            System.out.println("Not eligible: Credit Score must be at least 650.");
        } else if (creditScore > 850) {
            System.out.println("Invalid Credit Score! Max value is 850.");
        } else {
            System.out.println("✅ You are eligible for a loan!");
        }
    }
}
/*
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();

        System.out.print("Enter Sal: ");
        double sal = scanner.nextDouble();

        System.out.print("Enter Credit Score: ");
        int credit_score = scanner.nextInt();

        if (age >= 18 && age <= 80) {
            if (sal >= 30000) {
                if (credit_score >= 650 && credit_score <= 850) {
                    System.out.println("Eligible for Loan");
                } else {
                    System.out.println("Low Credit Score");
                }
            } else {
                System.out.println("Less Salary");
            }
        } else {
            System.out.println("Age Not Eligible");
        }
    }
}
 */

/*

* Take the below User info and store it into the variables:
              Age (integer)
              Salary (double or float)
              Credit Score (integer)
    Age Validation:
              :- Check if the age is a positive integer.
              :- Ensure the age is at least 18 years old.
              :- Max age can be 80.
    Salary Validation:
             :- Check if the salary is a positive number.
             :- Define a minimum salary threshold (e.g., 30,000).
    Credit Score Validation:
             :- Check if the credit score is a positive integer.
             :- Define a minimum credit score threshold (e.g., 650).
             :- Max credit score threshold (e.g., 850).

public class LoanEligibilityCheck {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int age=0;
        double salary=0.00;
        int creditScore=0;
        while(true)
        {
            try
            {
                System.out.println("Enter age,salary and credit score:");
                age=sc.nextInt();
                salary=sc.nextDouble();
                creditScore=sc.nextInt();
                if(age<18 || age>80)
                {
                    System.out.println("Invalid age entered, please enter correct age: ");
                    continue;
                }
                if(salary<0)
                {
                    System.out.println("Invalid Salary entered, please enter correct salary: ");
                    continue;
                }
                if(creditScore<=0)
                {
                    System.out.println("Invalid credit score entered, please enter correct creditScore: ");
                    continue;
                }
                break;
            }
            catch (InputMismatchException e)
            {
                System.out.println("invalid input, please enter correct input:");
                sc.nextLine();
            }
        }
        if(salary>30000)
        {
            if(creditScore>650 && creditScore<=850)
            {
                System.out.println("Eligible for loan");
            }
            else {
                System.out.println("Not eligible for loan");
            }
        }
        else
        {
            System.out.println("Not eligible for loan");
        }

    }
}
 */

/*

Check if a Person is Eligible for a Loan (Based on Age, Salary, and Credit Score)
    * Take the below User info and store it into the variables:
Age (integer)
Salary (double or float)
Credit Score (integer)
Age Validation:
        :- Check if the age is a positive integer.
        :- Ensure the age is at least 18 years old.
        :- Max age can be 80.

Salary Validation:
        :- Check if the salary is a positive number.
        :- Define a minimum salary threshold (e.g., 30,000).

Credit Score Validation:
        :- Check if the credit score is a positive integer.
        :- Define a minimum credit score threshold (e.g., 650).
        :- Max credit score threshold (e.g., 850).

18 )  Electricity Bill Calculation (Based on Units Consumed)
           :- take the input from the user of Units.

Implement Rate Structure:
Define the rate structure for calculating the bill based on the number of units consumed.
            :-  First 100 units: 0.50Rs per unit
            :-  Next 100 units (101-200): 0.75Rs per unit
            :- Next 100 units (201-300): 1.20Rs per unit
            :- Above 300 units: 1.50Rs per unit

19)  Calculate Bonus Based on Salary and Years of Experience.
          :- take the salary and Year info from the User.

Implement Bonus Calculation Logic:
Define the bonus structure based on salary and years of experience.
           :- If years of experience is less than 1 year: No bonus.
           :- If years of experience is between 1 and 3 years: Bonus is 5% of the salary.
           :- If years of experience is between 4 and 6 years: Bonus is 10% of the salary.
           :- If years of experience is greater than 6 years: Bonus is 15% of the salary.



import java.util.Scanner;

public class Q025_LoanEligibilityCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age =getValidAge(sc);
        float salary= getvalidSalary(sc);
        int creditScore =getValidCreditScore(sc);
        System.out.println("Loan Approved!");
        sc.close();
    }

    public static int getValidAge(Scanner sc) {
        System.out.println("Enter age");
        int age = 0;
        if (sc.hasNextInt()) {
            age = sc.nextInt();
            if (age < 0) {
                System.out.println("Age cannot be less than 0");
                System.exit(1);
            } else if (age < 18) {
                System.out.println("Person is too young to get loan");
                System.exit(1);
            } else if (age > 80) {
                System.out.println("Person is too old to get loan");
                System.exit(1);
            }
        } else {
            System.out.println("Enter a valid age");
            System.exit(1);
        }
        return age;
    }

    public static float getvalidSalary(Scanner sc) {
        float sal = 0;
        System.out.println("Enter salary");
        if (sc.hasNextFloat()) {
            sal = sc.nextFloat();
            if (sal < 0) {
                System.out.println("Salary is not valid");
                System.exit(1);
            } else if (sal < 30000) {
                System.out.println("Salary is too low to get a loan");
                System.exit(1);
            }

        } else {
            System.out.println("Enter a valid salary");
            System.exit(1);
        }
        return sal;
    }

    public static int getValidCreditScore(Scanner sc)
    {
        int creditScore=0;
        System.out.println("Enter Credit score");
        if(sc.hasNextInt())
        {
            creditScore=sc.nextInt();
            if(creditScore<0 || creditScore>850)
            {
                System.out.println("Enter a valid credit score");
                System.exit(1);
            }
            else if (creditScore<650)
            {
                System.out.println("Credit score is too low to get a loan");
                System.exit(1);
            }

        }
        else{
            System.out.println("Credit score is not valid");
            System.exit(1);
        }
        return creditScore;
    }

}
 */

/*
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String age_check = Eligiblity_Check_Age(sc, "Enter your age");

        String salary_check = Eligiblity_Check_Salary(sc, "Enter your salary:");

        String credit_score_check=Eligibility_Check_Credit_Score(sc,"Enter your credit score");

        if(age_check.equalsIgnoreCase("age check passed") && salary_check.equalsIgnoreCase("salary check passed") && credit_score_check.equalsIgnoreCase("Credit Score check passed"))
        {
            System.out.println("Congratulations!! You are eligible for loan");
        }
        else{
            System.out.println("Validation check  details");
            System.out.println(age_check);
            System.out.println(salary_check);
            System.out.println(credit_score_check);
            System.out.println("Sorry!! You are not eligible for loan");
        }

    }


    static String Eligiblity_Check_Age(Scanner sc, String prompt) {
        System.out.println(prompt);
        if (sc.hasNextInt()) {
            int age = sc.nextInt();
            String age_status = age > 0 ? (age >= 18 && age <= 80 ? "Age check passed" : "Your age should be above 18 and below 80 to get loan") :
                    "Enter valid age above 0 ";
            return age_status;
        } else {
            return "Enter valid age in number(integer)";
        }
    }

    static String Eligiblity_Check_Salary(Scanner sc, String prompt) {
        System.out.println(prompt);
        if (sc.hasNextInt()) {
            double salary = sc.nextDouble();
            String salary_status = salary > 0 ? (salary >= 30000 ? "Salary check passed" : "Your salary should be above 30000 to get loan")
                    : "Enter valid salary above 0";
            return salary_status;
        } else {
            return "Enter salary in number";
        }
    }
    static String Eligibility_Check_Credit_Score(Scanner sc,String prompt)
    {
        System.out.println(prompt);
        if(sc.hasNextInt()){
            int credit_score= sc.nextInt();
            String credit_score_status=credit_score>0?(credit_score>=650 && credit_score<=850)?"Credit Score check passed":"Credit Score should be greater than 650 and less than 850"
                                                     :"Enter credit score value above 0";
            return credit_score_status;
        }else{
            return "Enter credit score in number";
        }
    }
}
 */

/*
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter your credit score: ");
        int creditScore = sc.nextInt();

        // Validation
        if (age <= 0 || age < 18 || age > 80) {
            System.out.println("Invalid or ineligible age. Must be between 18 and 80.");
        } else if (salary <= 0 || salary < 30000) {
            System.out.println("Ineligible due to low salary. Minimum required is ₹30,000.");
        } else if (creditScore <= 0 || creditScore < 650 || creditScore >= 850) {
            System.out.println("Ineligible due to poor or invalid credit score. Must be between 650 and 850.");
        } else {
            System.out.println("✅ Congratulations! You are eligible for a loan.");
        }
    }
}
 */
/*
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age, Salary and credit score: ");
        int age = scanner.nextInt();
        double salary = scanner.nextDouble();
        int credit_score = scanner.nextInt();

        if (age >= 18 && age <= 80 ){
            if (salary >= 30000){
                if (credit_score >= 650 && credit_score <= 850){
                    System.out.println("You are eligible for a loan");
                }
                else {
                    System.out.println("Not Eligible for Loan! Minimum Credit score must be greater than 650 and maximum 850");
                }
            }
            else {
                System.out.println("Not Eligible for Loan! Minimum Salary must be greater than 30,000");
            }
        }
        else {
            System.out.println("Not Eligible for Loan! Minimum Age must be greater than 18 and maximum 80");
        }
    }
}
 */
/*
  static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println(" Enter Your Salary: ");
        double salary = scanner.nextDouble();

        System.out.println(" Enter Your Credit Score");
        int credit_score = scanner.nextInt();

        if (age < 18 || age > 80) {
            System.out.println("Invalid age. Age must be between 18 and 80.");
        }

        else if (salary < 30000) {
            System.out.println("Salary too low. Minimum salary required is 30,000.");
        }

        else if (credit_score < 650 || credit_score > 850) {
            System.out.println("Credit score not eligible. Must be between 650 and 850.");
        }

        else {
            System.out.println("Congratulations! You are eligible for a loan.");
        }

        scanner.close();
        }
    }
 */
/*
public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Check if a Person is Eligible for a Loan (Based on Age, Salary, and Credit Score)
		int age = 0; float salary= 0; 	int credit_Score= 0;
		Scanner sc = new Scanner(System.in);
		ageValidation(sc, age);
		salaryValidation( sc,  salary);
		creditscoreValidation(sc, credit_Score);
		overall(age, salary, credit_Score);

	}
	private static void overall(int age, float salary, int credit_Score) {
		// TODO Auto-generated method stub
		if (age != 0 && salary!= 0 && credit_Score!=0 )
		{
		System.out.printf("your eligible for a Loan with age %d, salary %f, credit score %d", age,salary,credit_Score);}
		else{System.out.print("you are not eligible for loan");}

	}
	private static void creditscoreValidation(Scanner sc, int credit_Score) {
		// TODO Auto-generated method stub
		System.out.println("Enter your Credit Score: ");
		while(sc.hasNextInt())
		{
			int userscore = sc.nextInt();
			if(userscore< 0 ) System.out.println("Credit Score cant be Negative"); //CCheck if the credit score is a positive integer.

			else if (userscore < 650) System.out.println("Credit Score cant be less then 650"); //Define a minimum credit score threshold (e.g., 650).

			else if (userscore > 850) System.out.println("Credit Score cant be greater than 850"); //Max credit score threshold (e.g., 850).
			else {userscore =  credit_Score; }
			break;
		}

	}
	public static void ageValidation(Scanner sc, int age)
	{
		System.out.println("Enter your Age: ");
		while(sc.hasNextInt())
		{
			int userage = sc.nextInt();
			if(userage< 0 ) System.out.println("Age cant be Negative"); //Check if the age is a positive integer.

			else if (userage > 80) System.out.println("Age cant be greater then 80"); //Max age can be 80.

			else if (userage < 18) System.out.println("You should be atleat 18 years old"); //Ensure the age is at least 18 years old.
			else {age = userage ; }
			break;
		}


}

	public static void salaryValidation(Scanner sc, float salary)
	{
		System.out.println("Enter your current Salary: ");
		while(sc.hasNextFloat())
		{
			float usersalary= sc.nextFloat();
			if (usersalary < 0) System.out.println("Salary cant be negative");//Check if the salary is a positive number.
			else if (usersalary < 30000) System.out.println("Minimum salary should be 30,000");//Define a minimum salary threshold (e.g., 30,000).
			else{salary = usersalary;}
			break;
		}
	}
}
 */

/*
public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Check if a Person is Eligible for a Loan (Based on Age, Salary, and Credit Score)
		int age = 0; float salary= 0; 	int credit_Score= 0;
		Scanner sc = new Scanner(System.in);
		ageValidation(sc, age);
		salaryValidation( sc,  salary);
		creditscoreValidation(sc, credit_Score);
		overall(age, salary, credit_Score);

	}
	private static void overall(int age, float salary, int credit_Score) {
		// TODO Auto-generated method stub
		if (age != 0 && salary!= 0 && credit_Score!=0 )
		{
		System.out.printf("your eligible for a Loan with age %d, salary %f, credit score %d", age,salary,credit_Score);}
		else{System.out.print("you are not eligible for loan");}

	}
	private static void creditscoreValidation(Scanner sc, int credit_Score) {
		// TODO Auto-generated method stub
		System.out.println("Enter your Credit Score: ");
		while(sc.hasNextInt())
		{
			int userscore = sc.nextInt();
			if(userscore< 0 ) System.out.println("Credit Score cant be Negative"); //CCheck if the credit score is a positive integer.

			else if (userscore < 650) System.out.println("Credit Score cant be less then 650"); //Define a minimum credit score threshold (e.g., 650).

			else if (userscore > 850) System.out.println("Credit Score cant be greater than 850"); //Max credit score threshold (e.g., 850).
			else {userscore =  credit_Score; }
			break;
		}

	}
	public static void ageValidation(Scanner sc, int age)
	{
		System.out.println("Enter your Age: ");
		while(sc.hasNextInt())
		{
			int userage = sc.nextInt();
			if(userage< 0 ) System.out.println("Age cant be Negative"); //Check if the age is a positive integer.

			else if (userage > 80) System.out.println("Age cant be greater then 80"); //Max age can be 80.

			else if (userage < 18) System.out.println("You should be atleat 18 years old"); //Ensure the age is at least 18 years old.
			else {age = userage ; }
			break;
		}


}

	public static void salaryValidation(Scanner sc, float salary)
	{
		System.out.println("Enter your current Salary: ");
		while(sc.hasNextFloat())
		{
			float usersalary= sc.nextFloat();
			if (usersalary < 0) System.out.println("Salary cant be negative");//Check if the salary is a positive number.
			else if (usersalary < 30000) System.out.println("Minimum salary should be 30,000");//Define a minimum salary threshold (e.g., 30,000).
			else{salary = usersalary;}
			break;
		}
	}
}
 */