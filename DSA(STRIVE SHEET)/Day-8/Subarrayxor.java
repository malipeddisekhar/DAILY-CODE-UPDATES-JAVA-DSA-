// class Subarrayxor
// {
//     public static void main(String[] args)
// {
//       int arr[] = {4, 2, 2, 6, 4};
//       int k = 6;
//       for(int i = 0; i < arr.length; i++)
//       {
//           int xor = 0;
//           for(int j = i; j < arr.length; j++)
//           {
//               xor = xor ^ arr[j];
//               if(xor == k)
//               {
//                   System.out.println("Subarray with given XOR is found between indexes " + i + " and " + j);
//               }
//           }
//       }
// }
// }
// // The time complexity of the above code is O(n^2) and the space complexity is O(1).
// by optimizing the code using a HashMap, we can reduce the time complexity to O(n) and space complexity to O(n).
import java.util.*;
class Subarrayxor {
    public long subarrayXor(int A[], int k) {
        // code here
        Map<Integer, Integer> freq = new HashMap<>();
        // Initialize with prefix XOR 0
        freq.put(0, 1);

        // Current prefix XOR
        int prefixXor = 0;
        // Answer count
        int count = 0;

        // Traverse array
        for (int num : A) {
            // Update prefix XOR
            prefixXor ^= num;

            // Compute required XOR
            int target = prefixXor ^ k;

            // If target exists in map, add its frequency
            if (freq.containsKey(target)) {
                count += freq.get(target);
            }

            // Store current prefix XOR in map
            freq.put(prefixXor, freq.getOrDefault(prefixXor, 0) + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        Subarrayxor subarrayxor = new Subarrayxor();
        int[] A = {4, 2, 2, 6, 4};
        int k = 6;
        long result = subarrayxor.subarrayXor(A, k);
        System.out.println("Number of subarrays with given XOR is: " + result);
    }
}