package ex_02_Java_Basics;

public class Lab017_printf {

    public static void main(String[] args) {
        int a=20;
        int b=10;
        // System.out.println(a);
        // System.out.println(b);

        // System.out.print(a);
        // System.out.print(b);

        System.out.printf("Value of a=%d",a);
        System.out.println();
        System.out.printf("Value of b=%d",b);
        System.out.printf("a is %d and b is %d",a,b);
        System.out.println();
        System.out.printf("A= %d, B=%d, A+B= %d",a,b,a+b);

        // %d -> int, byte, long, short, - data type
        // %s -> String
        // %f -> float, double,
        // %b ->boolean

        System.out.println();
        int table = 9;
        System.out.printf("%dx1=%d", table, table*1);
    }
}
