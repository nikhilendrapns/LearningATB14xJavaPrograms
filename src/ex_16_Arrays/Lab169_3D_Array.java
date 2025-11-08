package ex_16_Arrays;

public class Lab169_3D_Array {
    public static void main(String[] args) {

        // Declare and initialize a 3D array
        int[][][] arr_3d = {
                {
                        {1, 2, 3},
                        {4, 5, 6}
                },
                {
                        {7, 8, 9},
                        {10, 11, 12}
                }
        };

        // Access a specific element
        System.out.println("Element at arr_3d[1][0][2]: " + arr_3d[1][0][2]); // Output: 9

        // Print all elements
        System.out.println("\nAll elements of 3D array:");
        for (int i = 0; i < arr_3d.length; i++) {
            for (int j = 0; j < arr_3d[i].length; j++) {
                for (int k = 0; k < arr_3d[i][j].length; k++) {
                    System.out.print(arr_3d[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
