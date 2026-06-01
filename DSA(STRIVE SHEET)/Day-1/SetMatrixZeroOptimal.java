
// Optimal Approach
// We can use the first row and first column of the matrix to store the information about which
// rows and columns should be zeroed. This way, we can achieve the desired result without using extra space for markers. Here's how we can do it:
// Instead of using separate arrays, we use the first row and first column of the matrix itself to store whether a row or column needs to be zeroed. We also store two flags:
// firstRowZero:Was the first row supposed to be all zero?
// firstColZero:Was the first column supposed to be all zero?
// Then:
// First pass: Mark zeros in the first row and column for any zero found in the rest of the matrix.
// Second pass: Use those markers to set rows and columns to zero.
// Finally, handle the first row and column separately based on the flags. This is super space-efficient because we’re reusing the input matrix itself to store markers.
// Check if the first row has any zero and store in a boolean flag.
// Check if the first column has any zero and store in a boolean flag.
// Traverse the rest of the matrix:
// If a cell is zero, mark its row in the first column and its column in the first row as zero.
// Traverse again (excluding first row and column), setting cells to zero if their row marker or column marker is zero.
// Finally, update the first row and first column based on the stored flags.
class Solution {
    // Function to set entire row and column to 0 if an element in the matrix 
    public void setZeroes(int[][] matrix) {
        // Get dimensions of matrix
        int m = matrix.length;
        int n = matrix[0].length;

        // Flag to track if first row should be zeroed
        boolean firstRowZero = false;
        // Flag to track if first column should be zeroed
        boolean firstColZero = false;

        // Check if first row has any zero
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                firstRowZero = true;
                break;
            }
        }

        // Check if first column has any zero
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }

        // Use first row/column as markers
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Set cells to zero based on markers
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Zero the first row if needed
        if (firstRowZero) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }

        // Zero the first column if needed
        if (firstColZero) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}

// Main class to run the program
public class SetMatrixZeroOptimal{
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        obj.setZeroes(matrix);
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
