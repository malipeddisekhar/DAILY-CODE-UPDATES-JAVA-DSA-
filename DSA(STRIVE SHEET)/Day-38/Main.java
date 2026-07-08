// //Some times the brute force approaches are not working in comlex Test cases.
// class Solution {
//     public boolean containsNearbyDuplicate(int[] nums, int k) {
//         for(int i=0;i<nums.length;i++)
//         {
//             for(int j=i+1;j<nums.length;j++)
//             {
//                 if(nums[i]==nums[j])
//                 {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }
//These take o(n^2) time complexity and o(1) space complexity. But we can do it in o(n) time complexity and o(n) space complexity using hashset.


//So Using the hasmap we can do it in o(n) time complexity and o(n) space complexity.
import java.util.HashMap;
class Main {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {

            if(map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
                return true;
            }

            map.put(nums[i], i);
        }

        return false;
    }
}