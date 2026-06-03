import java.util.*;

class MaxSum {
    public long maximumSubarraySum(int[] nums, int k) {

        long sum = 0, ans = 0;
        int start = 0;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int end = 0; end < nums.length; end++) {

            sum += nums[end];
            map.put(nums[end], map.getOrDefault(nums[end], 0) + 1);

            if(end - start + 1 > k) {

                sum -= nums[start];

                map.put(nums[start], map.get(nums[start]) - 1);

                if(map.get(nums[start]) == 0)
                    map.remove(nums[start]);

                start++;
            }

            if(end - start + 1 == k && map.size() == k)
                ans = Math.max(ans, sum);
        }
        return ans;
    }

        public static void main(String[] args) {
            MaxSum sol = new MaxSum();
            int[] nums = {1, 2, 3, 4, 5};
            int k = 3;
            System.out.println("Maximum subarray sum of size " + k + " with distinct elements is: " + sol.maximumSubarraySum(nums, k));
        }
    }

