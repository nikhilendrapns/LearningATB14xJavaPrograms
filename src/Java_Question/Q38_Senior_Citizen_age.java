package Java_Question;

/*
Find if a Person is Senior Citizen Based on Age.
        :- take the age input from the user.
Implement Age Category Logic:
Define the criteria for different age categories:
Child: Age 0 to 12
Teenager: Age 13 to 19
Adult: Age 20 to 64
Senior Citizen: Age 65 and older
*/

import java.util.Scanner;


public class Q38_Senior_Citizen_age {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = sc.nextInt();

        if(age<0)
            System.out.println("Not a valid age");
        if(age>=0 && age<=12)
            System.out.println("Child");
        else if(age<=19)
            System.out.println("Teenager");
        else if(age<=64)
            System.out.println("Adult");
        else if(age>=65)
            System.out.println("Senior citizen");
    }
}

/*
public class SeniorCitizenAgeValidation {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int age=0;
        while(true)
        {
            try
            {
                System.out.println("Enter age for verification");
                age=sc.nextInt();
                break;
            }
            catch(InputMismatchException e)
            {
                System.out.println("Invalid input, please enter valid age: ");
                sc.nextLine();
            }
        }
        if(age>=65)
        {
            System.out.println("Senior Citizen");
        }
        else if(age>=20)
        {
            System.out.println("Adult");
        }
        else if(age>=13)
        {
            System.out.println("Teenager");
        }
        else
        {
            System.out.println("Child");
        }
    }
}
 */


