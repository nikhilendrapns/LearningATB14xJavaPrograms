package ex_02_Java_Basics;

public class Lab006_Keywords_identifiers {
    public static void main(String[] args) {
    /*
     * #### Keywords
     * - Keywords are reserved words in Java that have a predefined meaning and cannot be used for naming variables,
     * - methods, classes, or other identifiers.
     * - Identifiers, on the other hand, are names that you create to identify variables, methods, classes, and other entities in your code.
     * - Identifiers must follow certain rules,such as starting with a letter, underscore (_), or dollar sign ($), and cannot be the same as keywords.
     * - In the provided code, `package`, `public`, `class`, and `static` are keywords, while
     * - `Lab007_Keywords_Identifier` and `main` are identifiers.
     * - Simple English words** which are having predefined meaning in **Java Programming Language.**
     * - Keywords are also called **Reserved Words.**
     * - All the keywords are defined in **Lower Case.  **
     * - We **can’t use keywords** as names for variables, methods, classes, or as any other identifiers.
     */
    // Keywords are reserved words in Java
    // They cannot be used as identifiers (e.g., variable names, method names)
    // int if = 10; // This is not allowed

    // Identifiers are names used to identify variables, methods, classes, etc.
    int if2 = 10; // This is allowed
        System.out.println(if2); // Output: 10

    // Identifiers can contain letters, digits, underscores, and dollar signs
    int $ = 10; // This is allowed
        System.out.println($); // Output: 10

    // Identifiers cannot start with a digit
    // int 1a = 10; // This is not allowed

    // Identifiers are case-sensitive
    int a = 10;
    int A = 20;
        System.out.println(a); // Output: 10
        System.out.println(A); // Output: 20
      System.out.println("This is keywords and identifiers");

    // Identifiers cannot be a keyword
    // int if = 10; // This is not allowed
    // int if1 = 10; // This is allowed
}
    }

