package ex_07_Increment_Decrement_Op;

public class Lab077_Example2 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + ++a);
        System.out.println(a);

        // ++a -> A -> ExpA -> 11 , a -> 11
        // ++a -> B -> ExpB -> 12 , a -> 12
        // ExpA+ExpB -> 11+12 -> 23, a -> 12
        /*
        First ++a (pre-increment):
        a increases from 10 → 11
        Value used = 11
        Second ++a (pre-increment again, on updated a):
        a increases from 11 → 12
        Value used = 12
        Now expression = 11 + 12 = 23
        */
    }
}

