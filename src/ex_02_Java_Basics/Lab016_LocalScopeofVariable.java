package ex_02_Java_Basics;

public class Lab016_LocalScopeofVariable {

    public static void main(String[] args) {
        byte age = 21;
        System.out.println(age);
    }

    public static void main(int args) {

        byte age =17;
        System.out.println(age);
    }
}
