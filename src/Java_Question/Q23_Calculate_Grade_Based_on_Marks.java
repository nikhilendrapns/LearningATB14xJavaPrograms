package Java_Question;

import java.util.Scanner;

/*Calculate Grade Based on Marks. (Follow Below Steps to Write Program.)
Take user input for marks (Use Scanner class).
Check the validity of marks (ensure they are between 0 and 100).
Use if-else-if conditions to determine the grade based on marks.
Display the grade as output.
Grading Criteria (Example)
Marks Range Grade
90 - 100   A+
80 - 89     A
70 - 79      B
60 - 69     C
50 - 59      D
40 - 49      E
Below 40   Fail

 */
public class Q23_Calculate_Grade_Based_on_Marks {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the score");
        if(!sc.hasNextInt())
        {
            System.out.println("Invalid input.Enter the numerical score");
            sc.close();
            return;
        }
        int score= sc.nextInt();
        if( score<0 || score>100)
        {
            System.out.println("Invalid input.Enter score between 0 and 100.");
        }
        if( score >=90 && score<=100) {
            System.out.println("Grade : A");
        }
        else if (score >=80 && score<=89) {
            System.out.println("Grade : B");
        }
        else if (score >=70 && score<=79) {
            System.out.println("Grade : C");
        }
        else if (score >=60 && score<=69) {
            System.out.println("Grade : D");
        }
        else if (score >=0 && score<=59) {
            System.out.println("Grade : F");
        }

    }
}

/*
public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the score");
            int score = scanner.nextInt();
            if (score >= 90 && score <= 100) {
                System.out.println("Grade A");
            } else if (score >= 80 && score <= 89) {
                System.out.println("Grade B");
            } else if (score >= 70 && score <= 79) {
                System.out.println("Grade C");
            } else if (score >= 60 && score <= 69) {
                System.out.println("Grade D");
            } else  {
                System.out.println("Grade F");

            }
        }
    }
 */
/*
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks = sc.nextInt();
        if(marks >= 90)
        {
            System.out.println("A+ grade");
        }
        else if (marks >=80)
        {
            System.out.println("A grade");
        }
        else if (marks >=70)
        {
            System.out.println("B grade");
        }

        else if (marks >=60)
        {
            System.out.println("C grade");
        }
        else if (marks >=50)
        {
            System.out.println("D grade");
        }
        else if (marks >=40)
        {
            System.out.println("E grade");
        }
        else
        {
            System.out.println("Fail! number is below 40");
        }
    }
}
 */
/*
static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks: ");
        int marks = sc.nextInt();

        if(marks>=90 && marks<=100)
        {
            System.out.println("A+");
        }
        else if(marks>=80 && marks<=89)
        {
            System.out.println("A");
        }
        else if(marks>=70 && marks<=79)
        {
            System.out.println("B");
        }
        else if(marks>=60 && marks<=69)
        {
            System.out.println("C");
        }
        else if(marks>=50 && marks<=59)
        {
            System.out.println("D");
        }
        else if(marks>=40 && marks<=49)
        {
            System.out.println("E");
        }
        else if(marks>= 0 && marks<40)
        {
            System.out.println("Fail");
        }
        else
        {
            System.out.println("Check it! ensure they are between 0 and 100!");
        }
    }
}
 */

/*
public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int marks;
        String grade;
        System.out.println("Enter marks ");
        marks =scanner.nextInt();

        if(marks>=0 && marks<=100)
        {
            if(marks>=90) grade="A+";
            else if (marks>=80) grade="A";
            else if(marks >=70) grade="B";
            else if (marks>=60) grade ="C";
            else if (marks >=50) grade ="D";
            else if (marks >=40) grade ="E";
            else grade="F";
            }
        else {
            System.out.println("Enter valid marks!");
            return;
        }
        System.out.println("Grade ="+grade);
    }
}
 */

/*
   public static void main(String[] args) {
        System.out.println("Enter Student Name:");
        Scanner sc = new Scanner(System.in);
        String stu_name = sc.nextLine();
        System.out.println("Enter the number of subject");
        int total_subject = sc.nextInt();
        double total_marks = 0;
        for (int i = 1; i <= total_subject; i++) {
            System.out.println("Enter Subject " + i + " Mark:");
            int marks = sc.nextInt();
            total_marks = total_marks + marks;
        }
        double percentage = (total_marks / (total_subject*100))*100;
        String  grade =Grade_Calc(percentage);
        System.out.println("Your Grade: "+grade);

    }
    static String Grade_Calc(double percent) {
        if (percent >= 90 && percent <= 100) {
            return "A+";
        } else if (percent >= 80 && percent <= 89) {
            return "A";

        } else if (percent >= 70 && percent <= 79) {
            return "B";
        } else if (percent >= 60 && percent <= 69) {
            return "C";
        } else if (percent >= 50 && percent <= 59) {
            return "D";
        }
        else if (percent >= 40 && percent <= 49) {
            return "E";
        } else {
            return "You are fail!";
        }
    }
    }
 */