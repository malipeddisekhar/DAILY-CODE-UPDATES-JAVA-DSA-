// Iterate through the array using a variable i. During each iteration, add the current element arr[i] to a running sum variable.
// Keep track of the maximum sum encountered during the iteration by comparing the current sum with the previous maximum sum, and update it if the current sum is greater.
// If at any point the sum becomes negative, reset it to 0, as a negative sum won't contribute positively to the overall maximum sum.
// Continue the iteration until all elements in the array are processed.
// Finally, return the maximum sum encountered during the iteration.

class KadaneAlgorithm {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}

public class KadaneAlgorithmMain {
    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        KadaneAlgorithm obj = new KadaneAlgorithm();

        System.out.println("Maximum subarray sum is: "
                + obj.maxSubArray(nums));
    }
}