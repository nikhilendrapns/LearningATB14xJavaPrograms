package ex_02_Java_Basics;

public class Lab018_Constants {

    public static void main(String[] args) {
        //1. Constants - they should be final in nature.
        // **Rule : Default value of the Local variable is not assigned by the JVM. (Error)**
        //Local variable must be initialised before using.
        //- Value of the **final variable can not** be changed.
        //- Value of the **variable can be changed** any number of times during program execution.
        int a=12;
        a=20;
        System.out.println(a);

        final int b = 99;
        //b = 100; // java: cannot assign a value to final variable b

        final float PI=3.14f;
        //PI=3.15f;   //Error: Cannot assign a value to final variable 'PI'
        System.out.println(PI);
        final int a1 = 10;
        System.out.println(a1);
    }
}
