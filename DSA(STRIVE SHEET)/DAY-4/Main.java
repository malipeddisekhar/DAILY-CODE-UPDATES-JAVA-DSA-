// Find the repeating and missing numbers


// 18

// Problem Statement: Given an integer array nums of size n containing values from [1, n] and each value appears exactly once in the array, except for A, which appears twice and B which is missing.
// Return the values A and B, as an array of size 2, where A appears in the 0-th index and B in the 1st index.

// Note: You are not allowed to modify the original array.

// Examples
// Example 1:
// Input:
//  nums = [3, 5, 4, 1, 1]  
// Output:
//  [1, 2]  
// Explanation:
//  1 appears twice in the array, and 2 is missing from the array. So the output is [1, 2].

// Example 2:
// Input:
//  nums = [1, 2, 3, 6, 7, 5, 7]  
// Output:
//  [7, 4]  
// Explanation:
//  7 appears twice in the array, and 4 is missing from the array. So the output is [7, 4].
// Brute Force
// Algorithm
// Iterate through the array from index 1 to N, where N is the size of the array.
// For each integer, i, use linear search to count its occurrence in the given array.
// If an element has an occurrence of 2, store it as a candidate element.
// If an element has an occurrence of 0, store it as another candidate element.
// Finally, return the two elements that have occurrences of 2 and 0, respectively.



 import java.util.*;

// utility with frequency-array duplicate finder
class Solution {
    // find the duplicate using a frequency array
    static int findDuplicate(int[] arr) {
        // get size
        int n = arr.length;
        // allocate frequency array initialized to 0
        int[] freq = new int[n + 1];
        // scan elements
        for (int i = 0; i < n; i++) {
            // return current value if already seen
            if (freq[arr[i]] == 0) {
                // mark as seen
                freq[arr[i]] += 1;
            } else {
                // duplicate found
                return arr[i];
            }
        }
        // fallback if none (per original)
        return 0;
    }
}

// separate main class
public class Main {
    // program entry
    public static void main(String[] args) {
        // declare and initialize array
        int[] arr = new int[]{1, 3, 4, 2, 3};
        // print result
        System.out.println("The duplicate element is " + Solution.findDuplicate(arr));
    }
}
