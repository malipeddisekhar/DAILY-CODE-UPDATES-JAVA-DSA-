


// You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

// You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

 

// Example 1:


// Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
// Output: [[7,4,1],[8,5,2],[9,6,3]]
// Example 2:

// sol:
// Algorithm
// To rotate a matrix 90 degrees clockwise in-place (without using extra space), we use two key matrix operations:
// Step 1: Transpose the matrix: swap elements across the diagonal. This converts rows into columns.
// Step 2: Reverse each row: this turns the new columns into the final rotated rows.

// This works because:
// Transposing moves elements from (i, j) to (j, i), effectively rotating across the diagonal.
// Reversing the rows repositions the elements in each row, finalizing the clockwise rotation.
// Get the size of the square matrix (number of rows or columns).
// Start the first phase: Transpose the matrix
// For each row starting from the top to bottom:
// For each column starting from the diagonal element (excluding already visited elements):
// Swap the current element with the element that is diagonally opposite across the main diagonal.
// This effectively flips the matrix over its top-left to bottom-right diagonal, converting rows into columns.
// Move to the second phase: Reverse each row
// For every row in the matrix:
// Reverse the order of the elements in that row (first element becomes last, second becomes second last, and so on).
// This realigns the columns to their correct position for the clockwise rotation.
// Once both phases are done, the matrix will have been rotated 90 degrees clockwise in-place.
class Solution {
    // Function to rotate matrix 90 degrees clockwise in-place
    public void rotateClockwise(int[][] matrix) {
        int n = matrix.length;

        // Step 1: Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Swap element at (i, j) with (j, i)
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;

            // Swap elements from both ends moving toward center
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}

// Driver class
class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        Solution obj = new Solution();
        obj.rotateClockwise(matrix);

        // Print rotated matrix
        for (int[] row : matrix) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}
