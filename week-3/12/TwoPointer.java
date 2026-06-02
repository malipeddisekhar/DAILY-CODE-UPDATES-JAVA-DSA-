// class TwoPointer 
// {
//     public static void main(String[] args) 
//     {
//         int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//         int target = 15;
//         int left = 0;
//         int right = arr.length - 1;

//         while (left < right) 
//         {
//             int sum = arr[left] + arr[right];
//             if (sum == target) 
//             {
//                 System.out.println("Pair found: " + arr[left] + " and " + arr[right]);
//                 left++;
//                 right--;
//             } 
//             else if (sum < target) 
//             {
//                 left++;
//             } 
//             else 
//             {
//                 right--;
//             }
//         }
//     }
// }
//Time complexity is O(n) and space complexity is O(1) so these is effecent than brute force approach which is O(n^2) and space complexity is O(1)



//=================================================================
// class TwoPointer
// {
//     public static void main(String[] args)
//     {
//         int[] arr={1,2,3,4,5,6,7,8,9,10};//In two poniter thearray must be sorted 
//         int target=19;
//         for(int i=0;i<arr.length;i++)
//         {
//             for(int j=i+1;j<arr.length;j++)
//             {
//                 if(arr[i]+arr[j]==target)
//                 {
//                     System.out.println("Pair found: "+arr[i]+" and "+arr[j]);
//                 }
//             }
//         }
//     }
// }//time complexity is O(n^2) and space complexity is O(1)

//=================================================================
//unsorted array in two pointer approach Better than brute force approach
// import java.util.Arrays;
// class TwoPointer
// {
//     public static void main(String []args)
//     {
//         int[] arr={10,1,2,3,4,5,6,7,8,9};//In two poniter thearray must be sorted 
//         int target=19;
//         Arrays.sort(arr);
//         int left=0;
//         int right=arr.length-1;
//         while(left<right)
//         {
//             int sum=arr[left]+arr[right];
//             if(sum==target)
//             {
//                 System.out.println("Pair found: "+arr[left]+" and "+arr[right]);
//                 left++;
//                 right--;
//             }
//             else if(sum<target)
//             {
//                 left++;
//             }
//             else
//             {
//                 right--;
//             }
//         }
//     }
// }
//==========================================================================
import java.util.HashMap;
class TwoPointer {
    public static void main(String[] args) {
        int nums[] = {10, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 19;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++)
        {
            int complement = target - nums[i];

            if(map.containsKey(complement))
            {
                System.out.println("Pair found: " + nums[map.get(complement)] + " and " + nums[i]);
            }
            map.put(nums[i], i);
        }
    }
}
//Time complexity is O(n) and space complexity is O(n) because we are using hash map to store the elements of array.