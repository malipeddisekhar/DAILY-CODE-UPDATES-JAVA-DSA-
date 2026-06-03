//Sliding window technique
// class Sliding
// {
//     public static void main(String[] args)
//     {
//         int[] arr={1,2,3,4,5,6,7,8,9};
//         int start=0;
//         int k=3;
//         int max=0;
//         for(int i=0;i<k;i++)
//         {
//             max+=arr[i];
//         }
//         int currentSum=max;
//         for(int i=k;i<arr.length;i++)
//         {
//             currentSum=currentSum-arr[i-k]+arr[i];
//             if(currentSum>max)
//             {
//                 max=currentSum;
//                 start=i-k+1;
//             }
//         }
//         System.out.println("Maximum sum is "+max+" and starting index is "+start);
//     }
// }

//==> Sliding Window Technique
// The sliding window technique is a powerful algorithmic approach used to solve problems that involve finding a
class Sliding {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int k = 3;
        int maxSum = 0;
        int windowSum = 0;
        int start = 0;

        for (int end = 0; end < nums.length; end++) {
            windowSum += nums[end];

            if (end - start + 1 == k) {
                maxSum = Math.max(maxSum, windowSum);

                windowSum -= nums[start];
                start++;
            }
        }
        System.out.println("Maximum sum is " + maxSum);
    }
}