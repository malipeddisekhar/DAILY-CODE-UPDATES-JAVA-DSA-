// class Threesum
// {
//    public static void main(String[] args)
//    {
//       int[] a = { -1, 0, 1, 2, -1, -4 };
//       int target=3;
//       for (int i = 0; i < a.length - 2; i++)
//       {
//          for (int j = i + 1; j < a.length - 1; j++)
//          {
//             for (int k = j + 1; k < a.length; k++)
//             {
//                if (a[i] + a[j] + a[k] == target)
//                {
//                   System.out.println(a[i] + " " + a[j] + " " + a[k]);
//                }
//             }
//          }
//       }
//    }
// }
// //Brute force approach time complexity is O(n^3) and space complexity is O(1)


//=================================================================
//Optimal code 
// Optimal Approach: Sort + Two Pointers
// Step 1: Sort the Array
// [-1,0,1,2,-1,-4]

// After sorting:

// [-4,-1,-1,0,1,2]
// Step 2: Fix One Element

// Use a loop.

// for(int i=0;i<nums.length-2;i++)

// Treat nums[i] as the first element.

// Then find the other two elements using Two Pointers.

// Visualization
// [-4,-1,-1,0,1,2]
//   i   L        R
// i = 0
// nums[i] = -4

// Need:

// L + R = 4

// because

// -4 + ? + ? = 0
// First Iteration
// left = 1  (-1)
// right = 5 (2)

// Sum:

// -4 + (-1) + 2 = -3

// Less than 0.

// Move left:

// left++
// Next
// -4 + (-1) + 2 = -3

// Again less than 0.

// Move left.

// Next
// -4 + 0 + 2 = -2

// Move left.

// Next
// -4 + 1 + 2 = -1

// Move left.

// No answer for i=0.

// i = 1
// nums[i] = -1
// left = 2
// right = 5

// Current triplet:

// -1 + (-1) + 2 = 0

// Found answer ✅

// Store:

// [-1,-1,2]

// Move both pointers:

// left++
// right--

// Now:

// left = 3 (0)
// right = 4 (1)

// Sum:

// -1 + 0 + 1 = 0

// Found another answer ✅

// Store:

// [-1,0,1]
// Why Sorting?

// Because after sorting:

// sum < 0

// means we need a larger value.

// left++
// sum > 0

// means we need a smaller value.

// right--

// This is exactly the Two Pointer logic.

import java.util.*;

class Threesum {   
public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++) {

            if(i > 0 && nums[i] == nums[i - 1])
                continue;

            int left = i + 1;
            int right = nums.length - 1;

            while(left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0) {

                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));

                    while(left < right && nums[left] == nums[left + 1])
                        left++;

                    while(left < right && nums[right] == nums[right - 1])
                        right--;

                    left++;
                    right--;
                }
                else if(sum < 0) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return result;
    }

        public static void main(String[] args) {
            Threesum obj = new Threesum();
            int[] nums = {-1, 0, 1, 2, -1, -4};
            List<List<Integer>> triplets = obj.threeSum(nums);
            System.out.println(triplets);
        }
    }


//=================================================================
//Container With Most Water
// class ContainerWithMostWater {
    
// }