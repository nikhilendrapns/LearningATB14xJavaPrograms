package ex_02_Java_Basics;

public class Lab010_MultipleMains {

    // This code demonstrates that a Java class can have multiple main methods with different signatures.
// However, only the standard main method with the signature `public static void main(String[] args)`
// will be recognized as the entry point when the program is executed.
// Other main methods with different parameter types will not be called automatically.
// They can be called manually from within the standard main method if needed.
// However, this example serves to illustrate method overloading in Java.

//There can be multiple main methods in a class with different parameters.=> Main method overloading
//But JVM will only call the main method which has string array as an argument.
//The main method signature must be exactly as below:
//public static void main(String[] args) {
//System.out.println("This is main method");

    public static void main(String[] args) {
        System.out.println("Hello from Lab013_Multiple_Main");
    }

    public static void main(int args) {
        System.out.println("Hello Jarvis");
    }

    public static void main(String args) {
        System.out.println("I am Groot");
    }

    public static void main(float args) {
        System.out.println("Hello");
    }
}
