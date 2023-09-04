// T:O(n+m) - colomns+rows or O(n2)
// S:O(n) - store only found values

package core;

public class ToeplitzMatrix {

    public static boolean isToeplitzMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0)
            return false;

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Check the lower triangle of the matrix
        for (int i = 1; i < rows; i++) {
            // Check the lower triangle of the matrix
            for (int j = 1; j < cols; j++) {
                // Check if the current element is equal to the element at the top left diagonal of it (i-1, j-1)
                if (matrix[i][j] != matrix[i - 1][j - 1]) {
                    // If not, return false
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) { // MAIN
        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 1, 2, 3 }, { 6, 5, 1, 2 } };
        System.out.print(isToeplitzMatrix(matrix));
    }
}
