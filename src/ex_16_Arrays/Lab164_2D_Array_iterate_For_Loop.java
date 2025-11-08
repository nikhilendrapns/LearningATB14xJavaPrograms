package ex_16_Arrays;

public class Lab164_2D_Array_iterate_For_Loop {

    public static void main(String[] args) {
        int[][] matrix =
                {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                };
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // 3x3
        // R -> 3
        // C -> 3

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix[i][j]);
                System.out.print("*");

            }
            System.out.print("\n");
            System.out.println();
        }
    }
}
