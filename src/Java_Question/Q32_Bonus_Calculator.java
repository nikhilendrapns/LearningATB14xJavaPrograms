package Java_Question;
/*
Calculate Bonus Based on Salary and Years of Experience.
          :- take the salary and Year info from the User.

Implement Bonus Calculation Logic:
Define the bonus structure based on salary and years of experience.
           :- If years of experience is less than 1 year: No bonus.
        :- If years of experience is between 1 and 3 years: Bonus is 5% of the salary.
           :- If years of experience is between 4 and 6 years: Bonus is 10% of the salary.
           :- If years of experience is greater than 6 years: Bonus is 15% of the salary.
*/

import java.util.Scanner;

public class Q32_Bonus_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter salary: ");
        double salary = scanner.nextDouble();
        System.out.println("Enter years of experience(in years): ");
        double year_exp = scanner.nextDouble();
        if (year_exp <= 1){
            System.out.println("No Bonus");
        } else if (year_exp > 1 && year_exp < 4) {
            System.out.println("You got a bonus of 5% of the salary: "+(0.05 * salary));
        } else if (year_exp > 4 && year_exp <= 6) {
            System.out.println("You got a bonus of 10% of the salary: "+(0.10 * salary));
        }
        else {
            System.out.println("You got a bonus of 15% of the salary: "+(0.15 * salary));
        }
    }
}

/*
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter Years of Experience: ");
        int exp = scanner.nextInt();
        double bonus;

        if (exp < 1)
            bonus = 0;
        else if (exp <= 3)
            bonus = 0.05 * salary;
        else if (exp <= 6)
            bonus = 0.10 * salary;
        else
            bonus = 0.15 * salary;

        System.out.println("Bonus = Rs " + bonus);
    }
}
/*
Enter Salary: 40000
Enter Years of Experience: 5
Bonus = Rs 4000*/

/*
  public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double salary=0.00;
        double bonus=0.00;
        float yearOfExperience=0;
        while(true)
        {
            try
            {
                System.out.println("Enter Salary: ");
                salary=sc.nextDouble();
                if(salary<0) {
                    System.out.println("invalid salary, please enter correct salary: ");
                    continue;
                }
                System.out.println("Enter year of experience");
                yearOfExperience=sc.nextFloat();
                if(yearOfExperience<0)
                {
                    System.out.println("Invalid year of experience,please pass correct experience: ");
                    continue;
                }
                break;
            }
            catch (InputMismatchException e)
            {
                System.out.println("Invalid input,please enter correct input: ");
                sc.nextLine();
            }
        }
        if(yearOfExperience>6)
        {
            bonus=salary*0.15;
        }
        else if(yearOfExperience>=4)
                    {
                        bonus=salary*0.10;
                    }
        else if(yearOfExperience>=1)
        {
            bonus=salary*0.05;

        }
        else
        {
           bonus=0;
        }
        System.out.println("Your Bonus is: "+bonus+" .Keep up the good work");
    }

}
 */
/*
 public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter current salary");
        float sal=sc.nextFloat();
        System.out.println("Enter years of experience in years");
        int exp=sc.nextInt();

        System.out.println("Your bonus is Rs "+calculateBonus(sal,exp));
    }

    public static float calculateBonus(float sal, int exp)
    {
        float bonus=0;
        if(exp<1) bonus=0;
        else if (exp <3) bonus= sal *1.05f;
        else if(exp<6) bonus =sal*1.1f;
        else bonus =sal*1.15f;
        return bonus;
    }
}
 */
/*
 public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your salary:");
        double salary=sc.nextDouble();
        System.out.println("Your year of Experience");
        float exp_year=sc.nextFloat();
        double bonus=bonus_calc(salary,exp_year);
        System.out.println("Your Bonus:"+bonus);
    }
    static double bonus_calc(double sal,float experience)
    {

        if(experience<1)
        {
            System.out.println("Sorry!! Your experience is less than a year.No bonus");
            return 0;
        } else if (experience>=1 && experience<=3) {
            return sal*5/100;
        } else if (experience>=4 && experience<=6) {
            return sal*10/100;
        }else if(experience>6){
            return sal*15/100;
        }
        else
        {
            return 0;
        }
    }
}
 */

/*
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Years of Experience: ");
        int years = sc.nextInt();

        double bonus;

        if (years < 1)
            bonus = 0;
        else if (years >= 1 && years <= 3)
            bonus = salary * 0.05;
        else if (years >= 4 && years <= 6)
            bonus = salary * 0.10;
        else
            bonus = salary * 0.15;

        System.out.println("Bonus: ₹" + bonus);
        System.out.println("Total Salary with Bonus: ₹" + (salary + bonus));
    }
}
 */

/*
   static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter your years of experience: ");
        double years = scanner.nextDouble();

        double bonus = 0; // variable to store bonus amount

        // 2. Apply bonus logic
        if (years < 1) {
            bonus = 0;
            System.out.println("No bonus for less than 1 year of experience.");
        } else if (years >= 1 && years <= 3) {
            bonus = salary * 0.05;
        } else if (years >= 4 && years <= 6) {
            bonus = salary * 0.10;
        } else if (years > 6) {
            bonus = salary * 0.15;
        }

        // 3. Display the bonus result
        System.out.println("Salary: Rs " + salary);
        System.out.println("Years of Experience: " + years);
        System.out.println("Bonus Amount: Rs " + bonus);

        scanner.close();

    }
}
 */

/*
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Net Salary: ");
double salary = sc.nextDouble();
		System.out.println("Enter the years of experience: ");
double experience = sc.nextDouble();

		if (salary <= 0  )
        {
        System.out.println("your salary cant be 0 or Negative!! Enter correct information.");
		}
                else if (experience < 0)
        {
        System.out.println("your experience cant be 0 or Negative!! Enter correct information.");
		}
                else {bonusCalculator(salary, experience);}


        }

private static void bonusCalculator(double salary, double experience) {
    // TODO Auto-generated method stub
    double bonus;

    if (experience < 1) {System.out.println("No Bonus. Your salary remains: ₹" + salary);
        return;}
    else if (experience <= 3 && experience>= 1) {bonus= (salary *0.05);}
    else if (experience <= 6 && experience>= 4) {bonus= (salary *0.1);}
    else  {System.out.println(bonus= salary *0.15);}
    System.out.println("Your salary with bonus is :  ₹" + (bonus + salary));

}

}
 */

/*
 public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter yesr of experiance");
        int yearof_experiance = scn.nextInt();
        System.out.println("Enter salary");
        int sal = scn.nextInt();
        int bonus=0 ;
        if (yearof_experiance <1)
        {
            System.out.println("Bonus is" + 0);
        }
        else if (yearof_experiance >= 1 & yearof_experiance <= 3)
        {
            System.out.println("Bonus is"+sal*0.5);
        }
        else if (yearof_experiance >= 4 & yearof_experiance <= 6)
        {
            System.out.println("Bonus is"+sal*0.10);
        }
        else if (yearof_experiance>6)
        {
            System.out.println("Bonus is"+sal*0.15);
        }
    }
}
 */