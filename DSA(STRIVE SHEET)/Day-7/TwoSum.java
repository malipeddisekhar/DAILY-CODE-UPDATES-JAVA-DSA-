// class TwoSum
// {
//     public static void main(String []args)
//     {
//        int arr[] = {2,7,11,15};
//          int target = 9;
//          for(int i=0;i<arr.length;i++)
//          {
//              for(int j=i+1;j<arr.length;j++)
//              {
//                  if(arr[i]+arr[j]==target)
//                  {
//                      System.out.println(i+" "+j);
//                  }
//              }
//          }
//     }
// } foe these the timre complexity is O(n^2) because we have two nested loops iterating through the array.
//  The space complexity is O(1) because we are not using any additional data structures to store the results.
//============================================================
//These os the code for optimized version of TwoSum using HashMap
import java.util.HashMap;
class TwoSum
{
    public static void main(String []args)
    {
       int arr[] = {2,7,11,15};
         int target = 9;
         HashMap<Integer,Integer> map = new HashMap<>();
         for(int i=0;i<arr.length;i++)
         {
             int complement = target - arr[i];
             if(map.containsKey(complement))
             {
                 System.out.println(map.get(complement)+" "+i);
             }
             map.put(arr[i],i);
         }
    }
}