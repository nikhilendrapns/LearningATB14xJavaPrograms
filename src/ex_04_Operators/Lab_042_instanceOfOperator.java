package ex_04_Operators;

public class Lab_042_instanceOfOperator
{
    public static void main(String[] args) {

        String s1 = new String("Nikhil");
        int a = 10;
        System.out.println(s1 instanceof String);
        // System.out.println(a instanceof String); // Compilation Error: unexpected type

        String name = new String("java");
        boolean result = name instanceof String;
        System.out.println(result);// result will be true

    }
}
