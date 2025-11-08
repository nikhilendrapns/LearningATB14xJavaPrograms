package ex_07_Increment_Decrement_Op;

public class Lab071_ID_Op_PRE {
    public static void main(String[] args) {
        // Pre increment  = increase and then print
        int a = 10;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);

        // ++a ->  a = a+1 , increment by 1

        //  Exp and Result Table
        // Line No | a | Result b
        // 8  |  10 |  NA
        // 9  |  11 | 11
        // 10   | 11 - print | 11
        // 11   | 11 | 11 - pint

         /* a++ (Post-increment): Value used = 10 (old value of a)
                                After this step, a = 11.
          ++a (Pre-increment): First increment, then use.
                               a becomes 12, value used = 12
         Now expression = 10 + 12 = 22
                               */
    }
}
