package ex_05_TypeCasting;

public class Lab_048_Typecasting
{

    // process of converting a value from one data type to another
        /* Widening Casting
        - Widening casting, also known as implicit casting, occurs when converting a smaller data type to a larger one.
        - **This type of casting is performed automatically by the Java compiler** and is considered safe because there's no risk of data loss.
*/

        public static void main(String[] args) {

            byte b = 10;
            // int a = b; // // Valid syntax - Implicit - Casting -> Widening ->
            int a = (int) b; // For Widening, Explicit Casting, not required, it's done by JVM automatically

            //implicit casting

            //  int a1 = 300;
            //  byte b1 = a1; //java: incompatible types: possible lossy conversion from int to byte
            // invalid as byte can take small value 127 range
            //System.out.println(b1);
        }
    }

