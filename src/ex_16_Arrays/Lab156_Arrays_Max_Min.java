package ex_16_Arrays;

public class Lab156_Arrays_Max_Min {

    public static void main(String[] args) {

        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        // logic

        //  Arrays.sort(array);
        //  System.out.println("MIn:"+ array[0]);
        //  System.out.println("Max:"+ array[array.length-1]);
        System.out.println("-----------Maximum----------");
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println("Max no:" + max);

        int max2 = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]>=max2 && array[i]<max){
                max2 = array[i];
            }
        }System.out.println("2nd max " + max2 );


        System.out.println("-----------Minimum----------");

        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Min no:" +min);
    }
}

