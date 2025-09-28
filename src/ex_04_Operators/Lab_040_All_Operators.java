package ex_04_Operators;

public class Lab_040_All_Operators
{
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        // Arithmetic Operators
        // +,-,%,/,*

        System.out.println(a + b);  //30
        System.out.println(a - b);  //-10
        System.out.println(a * b);  //200
        System.out.println(b / a);  //2
        System.out.println(a < b);  //true
        System.out.println(a > b);  //false
        System.out.println(a >= b); //false
        System.out.println(a <= b); //true
        System.out.println(a == b); //false
        System.out.println(a != b); //true


        // Compound Assignment Operators
        int age = 10;
        age += 10;  // += -> age = age +10;
        System.out.println(age);

        age -=10;  // += -> age = age -10;
        System.out.println(age);

        age *= 2;  // += -> age = age * 2
        System.out.println(age);

        age /=10;  // += -> age = age /10;
        System.out.println(age);


        // Optional to learn - Digital Electronics
        // Bitwise - Not important for Automation
        //
        // ~ - Bitwise Not,
        // >> - Right shift,
        // << Left Shift,
        // ^ - XOR
    }
}
