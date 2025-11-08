package Java_Question;
import java.util.Scanner;
public class Q16_Person_is_Check_Eligible_to_vote {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the age");
        int age=scanner.nextInt();

        if(age>=21)
            System.out.println("Person is eligible to vote");
        else
            System.out.println("Person is not eligible to vote");

        scanner.close();
    }
}

/*
 public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        agetest(scan, "Enter Your age");

    }

    static void agetest(Scanner scan, String prompt) {
        System.out.println(prompt);
        int age = scan.nextInt();
        if (age > 21) {
            System.out.println("Eligibe to vote");

        } else {
            System.out.println("Not eligible to vote");
        }
    }
}
 */

/*
public static void main(String[] args) {
        {
            int age;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your age");
            if(sc.hasNextInt())
            {
                age= sc.nextInt();
                String status=age>18?"You are eligible to vote":"You are not eligible to vote";
                System.out.println(status);
            }
            else
                System.out.println("Enter valid age in number");
        }
    }
}
 */