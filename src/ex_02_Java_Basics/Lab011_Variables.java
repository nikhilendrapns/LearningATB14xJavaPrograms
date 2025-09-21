package ex_02_Java_Basics;

public class Lab011_Variables {
    public static void main(String[] args) {
        // ```
        // data_type variable_name =  variable_value
        //```

        byte age = 65;
        byte age_nikhil = 45;
        // short age_nikhil = 65;

        // byte -> data type - type of container
        // age_sunil ->  variable_name |  identifier

        // = -> Assignment Operator ?  (after some time)
        // 65 -> Variable Value |  Literal

        byte age2 = 30;
        age = 66;
        age_nikhil = 122;
        age_nikhil = 111;
        System.out.println(age_nikhil);
        System.out.println(age);
        System.out.println(age2);

        //data_type variable_name or identifier = variable_value or literal

        int myNum = 5;              // Integer (whole number)
        float myFloatNum = 5.99f;   // Floating point number
        char myLetter = 'D';        // Character
        boolean myBool = true;      // Boolean
        String myText = "Hello";    // String

        System.out.println("Integer: " + myNum);
        System.out.println("Float: " + myFloatNum);
        System.out.println("Character: " + myLetter);
        System.out.println("Boolean: " + myBool);
        System.out.println("String: " + myText);

        // we will be able to do arthemethic operations on the data in variables, we can print them directly by giving variable name in print statement
        int a=10;
        a= 65 + 1;
        System.out.println(a);

        // byte age = 128; // Out of range or out of size range of byte It supports from -127 to 127
        int num = 128;
        num = num+1;
        num = 76;
        System.out.println(num);

        //int _ = 65;
        int $ = 65;
        int year = 2025;
        int this_is_a_vari_long_name_in_the_class_hello_$_akakak = 89;

        System.out.println($);
        //System.out.println(_);
        /*
        Prior to Java 9, underscore could be used as an identifier (variable name)
        Since Java 9, underscore alone cannot be used as a variable name
        Underscores can be used as numeric literal separators (e.g., 1_000_000)
         */
    }
}
