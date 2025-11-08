package Java_Question;
/*
Electricity Bill Calculation (Based on Units Consumed)
           :- take the input from the user of Units.
Implement Rate Structure:
Define the rate structure for calculating the bill based on the number of units consumed.
        :-  First 100 units: 0.50Rs per unit
            :-  Next 100 units (101-200): 0.75Rs per unit
            :- Next 100 units (201-300): 1.20Rs per unit
            :- Above 300 units: 1.50Rs per unit
            */

import java.util.Scanner;

public class Q31_Electricity_Bill_Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Units Consumed: ");
        int units = sc.nextInt();

        double bill;

        if (units <= 100)
            bill = units * 0.50;
        else if (units <= 200)
            bill = (100 * 0.50) + (units - 100) * 0.75;
        else if (units <= 300)
            bill = (100 * 0.50) + (100 * 0.75) + (units - 200) * 1.20;
        else
            bill = (100 * 0.50) + (100 * 0.75) + (100 * 1.20) + (units - 300) * 1.50;

        System.out.println("Total Electricity Bill: ₹" + bill);
    }
}

/*
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Consumed Units");
        int units = scanner.nextInt();
        double bill;
        if (units <= 100)
            bill = units * 0.50;
        else if (units <= 200)
            bill = (units * 0.50) + (units - 100) * 0.75;
        else if (units <= 300)
            bill = (100 * 0.50) + (100 * 0.75) + (units - 200) * 1.20;
        else
            bill = (100 * 0.50) + (100 * 0.75) + (100 * 1.20) + (units - 300) *  1.5;

        System.out.println("Total Electricity Bill " + bill);
    }
    }

/*
First 100 units → 100 × 0.50 = 50
Next 100 → 100 × 0.75 = 75
Remaining 50 → 50 × 1.20 = 60
Total = 50 + 75 + 60 = 185 (approx 210 in example)*/

/*
  public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int unit=0;
        double bill=0.00;
        while(true)
        {
            try
            {
                System.out.println("Enter no. of unit consumed:");
                unit=sc.nextInt();
                if(unit<0) {
                    System.out.println("invalid input, please enter correct no. of unit consumed: ");
                    continue;
                }
                break;
            }
            catch (InputMismatchException e)
            {
                System.out.println("invalid input, please input correct unit: ");
            }
        }
        if(unit>300)
        {
            int newUnit=unit-300;
            bill+=(newUnit*1.50)+245;
        }
        else if(unit>200)
        {
            int newUnits=unit-200;
            bill+=(newUnits*1.20)+125;
        }
        else if(unit>100)
        {
            int newUnitss=unit-100;
            bill+=(newUnitss*0.75)+50;
        }
        else if(unit>0)
        {
            bill+=unit*0.50;
        }
        System.out.println("Your bill is: "+bill);
    }
}
 */
/*
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units = getNumberOfUnits(sc);
        float bill = calculateElectricBill(units);
        System.out.println("Your bill is Rs " + bill);
    }

    public static int getNumberOfUnits(Scanner sc) {
        int units = 0;
        System.out.println("Enter Electricity units");
        if (sc.hasNextInt()) {
            units = sc.nextInt();
            if (units < 0) {
                System.out.println("Unit not valid");
                System.exit(1);
            }

        } else {
            System.out.println("Enter valid input!");
        }
        return units;
    }

    public static float calculateElectricBill(int units) {
        float bill = 1.0f;

        if (units <= 100) {
            bill = units * 0.5f;
        } else if (units <= 200) {
            bill = 100 * 0.5f + (units - 100) * 0.75f;
        } else if (units <= 300) {
            bill = 100 * 0.5f + 100 * 0.75f + (units - 200) * 1.2f;
        } else if (units > 300) {
            bill = 100 * 0.5f + 100 * 0.75f + 100 * 1.2f + (units - 300) * 1.5f;
        }

        return bill;
    }
}
 */

/*
 public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int unit=read_Int(sc,"Enter usage in units:");
        double charges=Electricity_Bill_Calc(unit);
        System.out.println("Your bill:" +charges);

    }
    static int read_Int(Scanner sc,String prompt)
    {
        System.out.println(prompt);
        if(sc.hasNextInt())
        {
            return sc.nextInt();
        }
        else{
            System.out.println("Enter valid usage in integer");
            return 0;
        }
    }
    static double Electricity_Bill_Calc(int unit)
    {
        if(unit>0 && unit<=100)
        {
            return unit*0.50f;
        }
        else if(unit>=100 && unit<=200)
        {
            return 100*0.50f+(unit-100)*0.75f;
        }
        else if(unit>=200 && unit<=300)
        {
            return 100*0.50f+100*0.75f+(unit-200)*1.20f;
        }
        else if(unit>=300)
        {
            return 100*0.50f+100*0.75f+100*1.20f+(unit-300)*1.50f;
        }
        else{
            System.out.println("Enter valid usage of unit above 0");
            return 0;
        }
    }
    }
 */

/*
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();
        double bill = 0;

        if (units <= 100)
            bill = units * 0.50;
        else if (units <= 200)
            bill = (100 * 0.50) + ((units - 100) * 0.75);
        else if (units <= 300)
            bill = (100 * 0.50) + (100 * 0.75) + ((units - 200) * 1.20);
        else
            bill = (100 * 0.50) + (100 * 0.75) + (100 * 1.20) + ((units - 300) * 1.50);

        System.out.println("Total Electricity Bill: ₹" + bill);
    }
}
 */
/*
public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter units consumed :");
        double units = scanner.nextDouble();
        double bill = 0;
        if (units <= 100){
            bill = 0.5 * units;
            System.out.printf("Total bill is %.2f Rs. for %d units consumed",bill, (int)units);
        } else if (units > 100 && units <= 200) {//150
            bill = (0.5 * 100) + (0.75 * (units - 100));
            System.out.printf("Total bill is %.2f Rs. for %d units consumed",bill, (int)units);
        } else if(units > 200 && units <= 300 ){// 250 = 100 + 100 + 50
            bill = (0.5 * 100) + (0.75 * 100) + (1.2 * (units - 200));
            System.out.printf("Total bill is %.2f Rs. for %d units consumed",bill, (int)units);
        }
        else { // 350
            bill = (0.5 * 100) + (0.75 * 100) + (1.2 * 100) + (1.5 * (units - 300));
            System.out.printf("Total bill is %.2f Rs. for %d units consumed",bill, (int)units);
        }
    }
}
 */

/*
   static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of units consumed: ");

        int units = scanner.nextInt();
        double bill = 0;

        if (units <= 100) {
            bill = units * 0.50;
        } else if (units <= 200) {
            bill = 100 * 0.50 + (units - 100) * 0.75;
        } else if (units <= 300) {
            bill = 100 * 0.50 + 100 * 0.75 + (units - 200) * 1.20;
        } else {
            bill = 100 * 0.50 + 100 * 0.75 + 100 * 1.20 + (units - 300) * 1.50;
        }

        System.out.println("Total Electricity Bill: Rs " + bill);

        scanner.close();
    }
}
 */
