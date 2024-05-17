public class AddMatrices {
    public static void main(String[] args) {
        int rows = 2, columns = 3;

        // Define the first matrix
        int[][] firstMatrix = {
            {2, 3, 4},
            {5, 2, 3}
        };

        // Define the second matrix
        int[][] secondMatrix = {
            {4, 5, 3},
            {5, 6, 3}
        };

        // Initialize a new array to store the sum
        int[][] sum = new int[rows][columns];

        // Add the matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }

        // Display the result
        System.out.println("Sum of two matrices is:");
        for (int[] row : sum) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
}
