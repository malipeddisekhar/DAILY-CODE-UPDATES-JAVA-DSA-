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


// //So Using the hasmap we can do it in o(n) time complexity and o(n) space complexity.
// import java.util.HashMap;
// class Main {
//     public boolean containsNearbyDuplicate(int[] nums, int k) {

//         HashMap<Integer, Integer> map = new HashMap<>();

//         for(int i = 0; i < nums.length; i++) {

//             if(map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
//                 return true;
//             }

//             map.put(nums[i], i);
//         }

//         return false;
//     }
// }

// class Main
// {
//     public static void main(String []args)
//     {
//         int num=35;
//         double num1=num;
//         System.out.println(num1);//Implicit Type casting the java provide autimatically.

//     }
// }


//Explicit Type casting is done by the user to convert one data type to another data type.
class Main
{
    public static void main(String []args)
    {
        double num=35.5;
        double num1=45676543543.565;//If the value is greater than the range of the data type then it will give the output as infinity.
        int num2=(int)num;
        int num3=(int)num1;
        System.out.println(num2);//Explicit Type casting the user provide to convert one data type to another data type.
    System.out.println(num3);
    }
}