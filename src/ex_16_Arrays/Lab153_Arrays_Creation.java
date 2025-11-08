package ex_16_Arrays;

public class Lab153_Arrays_Creation {

    public static void main(String[] args) {
        //1st
        int[] marks = {11,15,19,13,56,11,4,65};

        // 2nd way to create the array
        int[] mark2 = new int[5];
        int mark3[] = new int[5]; // fixed size

        String[] names = new String[4];
        names[0] = "Jarvis";
        names[1] = "Gargeya";
        names[2] = "java";
        names[3] = "Avenger";


        System.out.println(names[3]);
        System.out.println(marks[0]);

    }
}
