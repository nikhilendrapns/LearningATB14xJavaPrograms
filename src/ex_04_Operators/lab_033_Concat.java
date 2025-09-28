package ex_04_Operators;

public class lab_033_Concat
{
    public static void main(String[] args) {

        //  + ->
        int a = 10;
        int b = 20;
        System.out.println("a+b"); // this is a string so gives a+b as o/p

        // + -> String -> Concatenation
        String first_name = "Nikhilendra";
        String last_name = " P N S";
        System.out.println(first_name+last_name); // Concatenation, not addition, because both are strings.
        //System.out.println("first_name+ " " +last_name");

        // System.out.println(first_name-last_name); // Not valid
        // System.out.println(first_name*last_name); // Not valid
        // System.out.println(first_name/last_name); // Not valid

        // + -> behave differently with the data type.
        // + -> operator overloading
        // + operator behaves differently based on the data types of the operands. Is this operator overloading?
        // No, Java does not support operator overloading in the traditional sense like C++.
    }
}
