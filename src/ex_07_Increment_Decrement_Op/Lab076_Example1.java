package ex_07_Increment_Decrement_Op;

public class Lab076_Example1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a);
        System.out.println(a);

       /* a++ (Post-increment): Value used = 10 (old value of a)
                                After this step, a = 11.
          ++a (Pre-increment): First increment, then use.
                               a becomes 12, value used = 12
         Now expression = 10 + 12 = 22
                               */
    }
}



