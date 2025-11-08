package Java_Question;

public class Q3_Max_between_3_numbers_using_ternary_operator {

    public static void main(String[] args) {

        int n1=35, n2=20, n3=85;

        String Max_number = (n1 > n2 && n1 > n3) ? "n1 is greatest" : (n2>n3 && n2>n3) ? "n2 is greatest" : "n3 is greatest";

        System.out.println("Max_number:" + Max_number);


    }
}
/*
public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first no :-");
        int num1=sc.nextInt();
        System.out.print("Enter second no :-");
        int num2=sc.nextInt();
        System.out.print("Enter third no :-");
        int num3=sc.nextInt();
        int max=(num1>num2&&num1>num3?num1:(num2>num3?num2:num3));
        System.out.printf("The maximum no is : %d",max);


    }
}
 */
