package Java_Question;
/*Calculate Employee Net Salary (Basic Pay, HRA, DA, Tax Deductions,)
HRA= 10% of basic
DA= 8% of Basic
Gross salary = Basic +HRA+ DA
*/

import java.util.Scanner;

public class Q33_Employee_Net_Salary_Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Pay: ");
        double basic = sc.nextDouble();

        if (basic > 0) {
            double hra = basic * 0.20; // 20% HRA
            double da = basic * 0.10;  // 10% DA
            double gross = basic + hra + da;
            double tax = gross * 0.10; // 10% Tax
            double netSalary = gross - tax;

            System.out.println("\n--- Salary Details ---");
            System.out.println("Basic Pay: ₹" + basic);
            System.out.println("HRA (20%): ₹" + hra);
            System.out.println("DA (10%): ₹" + da);
            System.out.println("Gross Salary: ₹" + gross);
            System.out.println("Tax (10%): ₹" + tax);
            System.out.println("Net Salary: ₹" + netSalary);
        } else {
            System.out.println("Invalid input! Basic pay must be positive.");
        }
    }
}

/*
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Basic Salary: ");
        double basic = scanner.nextDouble();

        double hra = 0.20 * basic;
        double da = 0.10 * basic;
        double gross = basic + hra + da;
        double tax;

        if (gross <= 50000)
            tax = 0;
        else
            tax = 0.10 * gross;

        double net = gross - tax;
        System.out.println("Net Salary = Rs " + net);
    }
}

/*
Net = Gross - Tax
        Gross = Basic + HRA + DA
Tax = 10% if Gross > 50,000, else 0

Enter Basic Salary: 60000
Net Salary = Rs 70200.0
Explanation:
Gross = 60000 + 12000 + 6000 = 78000 → Tax = 10% of 78000 = 7800 → Net = 78000 - 7800 = 70200*/

/*
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input salary components
        System.out.print("Enter Basic Pay: ");
        double basic = sc.nextDouble();

        System.out.print("Enter HRA (percentage of basic, e.g., enter 30 for 30%): ");
        double hraPercent = sc.nextDouble();

        System.out.print("Enter DA (percentage of basic, e.g., enter 20 for 20%): ");
        double daPercent = sc.nextDouble();

        System.out.print("Enter Tax Deduction (percentage of gross salary, e.g., 10 for 10%): ");
        double taxPercent = sc.nextDouble();

        // Calculations
        double hra = basic * hraPercent / 100.0;
        double da  = basic * daPercent  / 100.0;

        double grossSalary = basic + hra + da;
        double taxDeduction = grossSalary * taxPercent / 100.0;

        double netSalary = grossSalary - taxDeduction;

        // Output results with explanations
        System.out.println("\n--- Salary Break-up ---");
        System.out.printf("Basic Pay         : %.2f%n", basic);
        System.out.printf("HRA (%.2f%%)       : %.2f%n", hraPercent, hra);
        System.out.printf("DA (%.2f%%)        : %.2f%n", daPercent, da);
        System.out.printf("Gross Salary      : %.2f%n", grossSalary);
        System.out.printf("Tax Deduction (%.2f%% of gross): %.2f%n", taxPercent, taxDeduction);
        System.out.printf("Net Salary        : %.2f%n", netSalary);

        sc.close();
    }
}
 */
/*
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Annual Basic Salary of the Employee:");
        double basic = scanner.nextDouble();

        double hra = 0.10 * basic;  // 10% of basic
        double da = 0.08 * basic;   // 8% of basic
        double grossSalary = basic + hra + da;

        double tax = calculateTax(grossSalary);
        double netSalary = grossSalary - tax;

        System.out.println("Employee Salary Details:");
        System.out.println("Basic salary: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Tax Deduction: " + tax);
        System.out.println("Net Salary: " + netSalary);
    }

    public static double calculateTax(double grossSalary)
    {
        double tax=0;

        if(grossSalary<=400000)
          tax=0;
        else if(grossSalary<=800000)
            tax=grossSalary*0.05; //5%
        else if(grossSalary<=1200000)
            tax=grossSalary*0.1; //10%
        else if(grossSalary<=1600000)
            tax=grossSalary*0.15; //15%
        else if(grossSalary<=2000000)
            tax=grossSalary*0.2;
        else if(grossSalary<=2400000)
            tax=grossSalary*0.25;
        else tax=grossSalary*0.3;

        return tax;
    }
}
 */

/*
  public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double basic_pay,hra_percent,da_percent,deduction_percent;
        System.out.println("Enter your basic pay:");
        basic_pay= sc.nextDouble();
        System.out.println("Enter your HRA in %");
        hra_percent=sc.nextDouble();
        System.out.println("Enter your DA in %");
        da_percent=sc.nextDouble();
        System.out.println("Enter your deduction in %");
        deduction_percent= sc.nextDouble();
        //to calculate HRA
        double hra=(hra_percent/100)*basic_pay;
        //to calculate DA
        double da=(da_percent/100)*basic_pay;
        //to calculate deduction
        double deduction=(deduction_percent/100)*basic_pay;
        double net_salary=basic_pay+hra+da-deduction;
        System.out.println("Basic Pay:"+basic_pay);
        System.out.println("HRA:"+hra);
        System.out.println("DA"+da);
        System.out.println("Deductions:"+deduction);
        System.out.println("Your Net Pay:"+net_salary);
    }

}

 */

/*
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Basic pay amount: ");
        double basic_pay = scanner.nextDouble();
        double hra = basic_pay * 0.5;
        double da = basic_pay * 0.29;
        System.out.println("Enter Tax Deduction amount: ");
        double tax_deductions = scanner.nextDouble();
        double employee_net_Salary = 0;
        if (basic_pay > tax_deductions){
            employee_net_Salary = (basic_pay + hra +da) - tax_deductions;
            System.out.println("Employee net salary is: "+employee_net_Salary);
        }
        else {
            System.out.println("Basic pay must be greater than tax deductions");
        }
    }
}
 */

/*
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Basic pay amount: ");
        double basic_pay = scanner.nextDouble();
        double hra = basic_pay * 0.5;
        double da = basic_pay * 0.29;
        System.out.println("Enter Tax Deduction amount: ");
        double tax_deductions = scanner.nextDouble();
        double employee_net_Salary = 0;
        if (basic_pay > tax_deductions){
            employee_net_Salary = (basic_pay + hra +da) - tax_deductions;
            System.out.println("Employee net salary is: "+employee_net_Salary);
        }
        else {
            System.out.println("Basic pay must be greater than tax deductions");
        }
    }
}
 */

/*
public static void main(String[] args) {


Scanner sc = new Scanner(System.in);
		System.out.println("Enter Basic Pay");
double pay= sc.nextDouble();

double hRA= pay * 0.2;
double dA = pay * 0.1;
		if (pay > 0 && pay < 50000)
        {
        System.out.println("No tax deducted, Your Net salary is: "+ (pay + hRA + dA));
        }
        else if (pay >50000 && pay < 90000 )
        {
double tax= (pay + hRA + dA)*0.02 ;
			System.out.println("Your HRA: " + hRA);
			System.out.println("Your DA: "+ dA);
			System.out.println("tax cut: "+ tax);
			System.out.println("20% tax deducted, Your Net salary is: "+ ((pay + hRA + dA ) - tax));
        }
        else {
double tax= (pay + hRA + dA)*0.05 ;
			System.out.println("Your HRA: " + hRA);
			System.out.println("Your DA: "+ dA);
			System.out.println("tax cut: "+ tax);
			System.out.println("50% tax deducted, Your Net salary is: "+ ((pay + hRA + dA ) - tax));
        }



        }

        }
 */

/*
 public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter gross sal");
        double grosssal=scn.nextInt();
        System.out.println("enter HRA");
        double HRA=scn.nextInt();
        System.out.println("enter basicpay");
        double basicpay=scn.nextInt();
        System.out.println("enter DA");
        double DA=scn.nextInt();
        double tax=basicpay*0.05;
        double netsal=grosssal-(HRA+basicpay+DA);
        System.out.println("netsal is"+ netsal);
    }
}
 */

/*
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Basic Salary: ");
        double basic = scanner.nextDouble();

        double hra = 0.20 * basic;
        double da = 0.10 * basic;
        double gross = basic + hra + da;
        double tax;

        if (gross <= 50000)
            tax = 0;
        else
            tax = 0.10 * gross;

        double net = gross - tax;
        System.out.println("Net Salary = Rs " + net);
    }
}

/*
Net = Gross - Tax
        Gross = Basic + HRA + DA
Tax = 10% if Gross > 50,000, else 0

Enter Basic Salary: 60000
Net Salary = Rs 70200.0
Explanation:
Gross = 60000 + 12000 + 6000 = 78000 → Tax = 10% of 78000 = 7800 → Net = 78000 - 7800 = 70200*/


/*
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter basic salary");
        double basic = scanner.nextDouble();

        double hra = 0.20 * basic;
        double da = 0.10 * basic;
        double gross = basic + hra + da;
        double tax;
        if(gross <= 1200000)
            tax = 0;
        else
            tax = 0.10 * gross;
        double net = gross - tax;
        System.out.println("Net salary is Rs " +net);
    }
}
 */