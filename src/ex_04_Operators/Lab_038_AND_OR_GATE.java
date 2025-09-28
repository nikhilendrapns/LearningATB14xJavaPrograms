package ex_04_Operators;

public class Lab_038_AND_OR_GATE
{
    public static void main(String[] args) {

        // || OR gate
        // OR gate >> if 1 is true then all is true
        System.out.println(true || true); // True
        System.out.println(true || false); // True
        System.out.println(false || true);  // True
        System.out.println(false || false); // False

        //  And  && // only true && true returns true
        // AND gate >> if 1 is false then all false
        // T || T -> T ->
        // T || F -> F
        // F || T -> F
        // F || F -> F

        System.out.println(true && true); // True
        System.out.println(true && false); // False
        System.out.println(false && true); // False
        System.out.println(false && false); // False

        // Example :
        int  b_salary = 12;
        Boolean b = (!(b_salary > 10 || b_salary<5));
        System.out.println(b);
    }
}
