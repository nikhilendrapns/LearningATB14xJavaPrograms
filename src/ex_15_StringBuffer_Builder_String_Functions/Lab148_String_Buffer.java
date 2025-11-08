package ex_15_StringBuffer_Builder_String_Functions;

public class Lab148_String_Buffer {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");
        sb.append(" Programming");
        System.out.println(sb);

        sb.replace(0, 4, "C++");
        System.out.println(sb);

    }
}
