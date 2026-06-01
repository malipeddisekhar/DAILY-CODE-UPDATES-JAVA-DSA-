// To print the Nth row of the pascal triangle we can take advantage of the relationship between Nth element and binomial coefficients.

// In a pascal's triangle, the Nth row contains the binomial coefficients C(N-1, 0), C(N-1, 1) and so on till C(N-1, N-1). Thus we can simply calculate all these values to return the Nth row of pascal triangle.

// Instead of computing full factorials, we can start with the first value as 1, and use the relation C(n, k) = C(n, k−1) × (n−k+1) / k to compute the next value from the previous one in constant time.

import java.util.*;

// Class containing Pascal's Triangle row generation logic
class Solution {
    // Function to generate the Nth row of Pascal's Triangle
    public List<Long> getNthRow(int N) {
        // Result list to store the row
        List<Long> row = new ArrayList<>();
        
        // First value of the row is always 1
        long val = 1;
        row.add(val);
        
        // Compute remaining values using the relation:
        // C(n, k) = C(n, k-1) * (n-k) / k
        for (int k = 1; k < N; k++) {
            val = val * (N - k) / k;
            row.add(val);
        }
        
        return row;
    }
}

public class Pascals_Triangle {
    public static void main(String[] args) {
        int N = 5; // Example: 5th row
        Solution sol = new Solution();
        List<Long> result = sol.getNthRow(N);

        // Print the row
        for (long num : result) {
            System.out.print(num + " ");
        }
    }
}
