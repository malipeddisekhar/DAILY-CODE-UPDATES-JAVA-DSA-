// 74. Search a 2D Matrix
// Solved
// Medium
// Topics
// premium lock icon
// Companies
// You are given an m x n integer matrix matrix with the following two properties:

// Each row is sorted in non-decreasing order.
// The first integer of each row is greater than the last integer of the previous row.
// Given an integer target, return true if target is in matrix or false otherwise.

// You must write a solution in O(log(m * n)) time complexity.

// Example 1:
// Input: matrix = [[1,3,5,7],[10,11,16,
// 20],[23,30,34,60]], target = 3
// Output: true

// Example 2:
// Input: matrix = [[1,3,5,7],[10,11,16,
// 20],[23,30,34,60]], target = 13
// Output: false


// class DMatrix {
//     public static void main(String[] args) {
//         int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
//         int target = 5;
//         int n = arr.length;
//         int m = arr[0].length;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 if (arr[i][j] == target) {
//                     System.out.println("Element found at index: " + i + "," + j);

//                 }
//             }
//         }
//     }

// }
//==================================
class DMatrix {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int target = 5;
        int n = arr.length;
        int m = arr[0].length;
        int low = 0;
        int high = n * m - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midElement = arr[mid / m][mid % m];
            if (midElement == target) {
                System.out.println("Element found at index: " + mid / m + "," + mid % m);
                return;
            } else if (midElement < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Element not found in the matrix.");
    }

}