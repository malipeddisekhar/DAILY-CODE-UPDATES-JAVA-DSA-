// Count inversions in an array


// 17

// Problem Statement: Given an array of N integers, count the inversion of the array (using merge-sort).

// Inversion of an array: for all i & j < size of array, if i < j then you have to find pair (A[i],A[j]) such that A[j] < A[i].

// Examples
// Example 1:
// Input Format: N = 5, array[] = {1,2,3,4,5}
// Result: 0
// Explanation: we have a sorted array and the sorted array has 0 inversions as for i < j you will never find a pair such that A[j] < A[i]. More clear example: 2 has index 1 and 5 has index 4 now 1 < 5 but 2 < 5 so this is not an inversion.

// Example 2:
// Input Format: N = 5, array[] = {5,4,3,2,1}
// Result: 10
// Explanation: we have a reverse sorted array and we will get the maximum inversions as for i < j we will always find a pair such that A[j] < A[i]. Example: 5 has index 0 and 3 has index 2 now (5,3) pair is inversion as 0 < 2 and 5 > 3 which will satisfy out conditions and for reverse sorted array we will get maximum inversions and that is (n)*(n-1) / 2.For above given array there is 4 + 3 + 2 + 1 = 10 inversions.

// Example 3:
// Input Format: N = 5, array[] = {5,3,2,1,4}
// Result: 7
// Explanation: There are 7 pairs (5,1), (5,3), (5,2), (5,4),(3,2), (3,1), (2,1) and we have left 2 pairs (2,4) and (1,4) as both are not satisfy our condition.
            
// Brute Force Approach
// Algorithm
// An inversion in an array is defined as a pair of indices (i, j) such that i < j and a[i] > a[j]. This measures how far the array is from being sorted. To count inversions, the brute force way is to compare every element with all elements to its right and increment the counter whenever we find an inversion.

// Initialize a counter cnt = 0.
// Use two nested loops:
// Outer loop runs for each element a[i].
// Inner loop checks all elements a[j] where j > i.
// If a[i] > a[j], increment cnt.
// After traversing all pairs, return cnt as the number of inversions.
// Code
// C++JavaPythonJavaScript

public class Count {
    // Function to count inversions
    static int numberOfInversions(int[] arr) {
        int cnt = 0; // Initialize count
        int n = arr.length;
        // Check all pairs
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) cnt++; // Increment if inversion found
            }
        }
        return cnt; // Return total inversions
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int inversions = numberOfInversions(arr);
        System.out.println("The number of inversions is: " + inversions);
    }
}