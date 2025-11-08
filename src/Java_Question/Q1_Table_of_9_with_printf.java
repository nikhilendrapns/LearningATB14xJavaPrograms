package Java_Question;
import java.util.Scanner;

public class Q1_Table_of_9_with_printf {

    public static void main(String[] args) {
        int a = 9;

        System.out.println("Below displays Multiplication Table of 9 :");
        System.out.printf("%d * 1 = %d%n", a, a*1);
        System.out.printf("%d * 2 = %d%n", a, a*2);
        System.out.printf("%d * 3 = %d%n", a, a*3);
        System.out.printf("%d * 4 = %d%n", a, a*4);
        System.out.printf("%d * 5 = %d%n", a, a*5);
        System.out.printf("%d * 6 = %d%n", a, a*6);
        System.out.printf("%d * 7 = %d%n", a, a*7);
        System.out.printf("%d * 8 = %d%n", a, a*8);
        System.out.printf("%d * 9 = %d%n", a, a*9);
        System.out.printf("%d * 10 = %d%n", a, a*10);
    }
}

/*
 Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number ");
        int num= scanner.nextInt();
        // %d is placeholde for integer, \n is for new line
        for(int i=1;i<=10;i++)
        {
            System.out.printf("%d * %d = %d \n",num,i,(num*i));
        }

        //Close scanner class
        scanner.close();
    }
 */