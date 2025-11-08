package ex_16_Arrays;

public class Lab152_Arrays {
    public static void main(String[] args) {

        int a = 10;
        int marks[] = {91, 90, 51, 100, 91, 92, 89};
        boolean[] is_married_people = {true, true, false};

        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[4]);

       // System.out.println(marks[-1]); // java.lang.ArrayIndexOutOfBoundsException


        String name = "gargeya";
        String[] name_each_element_char = name.split("");
        //    // ["g","a","r","g","e","y","a"]
        for (String s : name_each_element_char) {
            System.out.println(s);
        }
        for (int i = 0; i <=name_each_element_char .length-1 ; i++) {
            System.out.println(name_each_element_char [i]);

        }
    }
}
