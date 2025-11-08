package ex_15_StringBuffer_Builder_String_Functions;

public class Lab144_StringBuilder_Vs_Buffer {

    public static void main(String[] args) {
        // String - 90%
        String s0 = "Gargeya";
        String s1 = new String("Gargeya");

        // less than <10% used.
        StringBuffer stringBuffer = new StringBuffer("Gargeya");
        StringBuilder stringBuilder = new StringBuilder("Gargeya");


        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.reverse());


    }
}

