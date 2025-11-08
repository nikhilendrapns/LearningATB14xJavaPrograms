package ex_15_StringBuffer_Builder_String_Functions;

public class Lab145_String_Buffer {

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Gargeya");

        stringBuffer.append("Borgaonkar");
        System.out.println(stringBuffer); // GargeyaBorgaonkar


        String s1 = "Gargeya";
        s1 = s1+ "Borgaonkar";
        System.out.println(s1);


    }
}
