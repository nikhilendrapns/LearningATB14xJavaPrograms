package ex_02_Java_Basics;

public class Lab015_NumericDataTypes {

    public static void main(String[] args) {
        //byte a=128; not valid as range of byte is from -128 to 127
        byte b = 127;
        short s = 128;
        int i = 129;
        char c = 'A';

        long phone = 98734567890L;
        long phone1 = 134564328;

        float f = 3.14f;
        float f2 = 3.14F;

        double d = 3.12123423;
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(d);
        System.out.println(phone);
        System.out.println(phone1);
        System.out.println(f);
        System.out.println(f2);
    }
}
