// class FourSum {
//     public static void main(String []args)
//     {
//        int arr[] = {1,0,-1,0,-2,2};
//          int target = 0;
//          for(int i=0;i<arr.length;i++)
//          {
//              for(int j=i+1;j<arr.length;j++)
//              {
//                  for(int k=j+1;k<arr.length;k++)
//                  {
//                      for(int l=k+1;l<arr.length;l++)
//                      {
//                          if(arr[i]+arr[j]+arr[k]+arr[l]==target)
//                          {
//                              System.out.println(arr[i]+" "+arr[j]+" "+arr[k]+" "+arr[l]);
//                          }
//                      }
//                  }
//              }
//          }
//     }
// }
//For these code the time completity is O(n^4) because we have four nested loops iterating through the array.
// The space complexity is O(1) because we are not using any additional data structures to store the results.
//============================================================
//These os the code for optimized version of FourSum using HashMap
// import java.util.HashMap;
// class FourSum
// {
//     public static void main(String []args)
//     {
//        int arr[] = {1,0,-1,0,-2,2};
//          int target = 0;
//          HashMap<Integer,Integer> map = new HashMap<>();
//          for(int i=0;i<arr.length;i++)
//          {
//              for(int j=i+1;j<arr.length;j++)
//              {
//                  int complement = target - (arr[i]+arr[j]);
//                  if(map.containsKey(complement))
//                  {
//                      System.out.println(map.get(complement)+" "+i+" "+j);
//                  }
//              }
//              map.put(arr[i],i);
//          }
//     }
// }

//============================================================
//Optimized version of FourSum using two pointers
//Uding list to store the result
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class FourSum
{
    public static void main(String []args)
    {
       int arr[] = {1,0,-1,0,-2,2};
         int target = 0;
         List<List<Integer>> result = new ArrayList<>();
         Arrays.sort(arr);
         for(int i=0;i<arr.length-3;i++)
         {
             if(i>0 && arr[i]==arr[i-1]) continue; // Skip duplicates
             for(int j=i+1;j<arr.length-2;j++)
             {
                 if(j>i+1 && arr[j]==arr[j-1]) continue; // Skip duplicates
                 int left = j+1;
                 int right = arr.length-1;
                 while(left<right)
                 {
                     int sum = arr[i]+arr[j]+arr[left]+arr[right];
                     if(sum==target)
                     {
                         result.add(Arrays.asList(arr[i],arr[j],arr[left],arr[right]));
                         left++;
                         right--;
                         while(left<right && arr[left]==arr[left-1]) left++; // Skip duplicates
                         while(left<right && arr[right]==arr[right+1]) right--; // Skip duplicates
                     }
                     else if(sum<target)
                     {
                         left++;
                     }
                     else
                     {
                         right--;
                     }
                 }
             }
         }
         System.out.println(result);
    }
}