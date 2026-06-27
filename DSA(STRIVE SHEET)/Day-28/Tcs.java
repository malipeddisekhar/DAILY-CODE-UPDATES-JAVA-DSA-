// // Coin Pair Indices (Two Sum)
// import java.util.*;
// class Tcs
// {
//     public static void main(String[] args)
//     {
//         Scanner sc=new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int target = sc.nextInt();
//         Map<Integer, Integer> map = new HashMap<>();
//         for (int i = 0; i < n; i++) {
//             int complement = target - arr[i];
//             if (map.containsKey(complement)) {
//                 System.out.println(map.get(complement) + " " + i);
//                 return;
//             }
//             map.put(arr[i], i);
//         }
//     }
// }
























// //Merge 2 array in sorted order
// class Tcs
// {
//     public static void main(String[] args)
//     {
//         int[] arr1 = {1, 3, 5, 7};
//         int[] arr2 = {2, 4, 6, 8};
//         int n1 = arr1.length;
//         int n2 = arr2.length;
//         int[] mergedArray = new int[n1 + n2];
//         int i = 0, j = 0, k = 0;

//         while (i < n1 && j < n2) {
//             if (arr1[i] < arr2[j]) {
//                 mergedArray[k++] = arr1[i++];
//             } else {
//                 mergedArray[k++] = arr2[j++];
//             }
//         }

//         while (i < n1) {
//             mergedArray[k++] = arr1[i++];
//         }

//         while (j < n2) {
//             mergedArray[k++] = arr2[j++];
//         }

//         System.out.println("Merged array in sorted order:");
//         for (int num : mergedArray) {
//             System.out.print(num + " ");
//         }
//     }
// }

import java.util.*;
class Tcs {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums1)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int num:nums2)
        {
            if(map.containsKey(num)&& map.get(num)>0)
            {
                list.add(num);
                map.put(num,map.get(num)-1);
            }
        }
        int[] ans=new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            ans[i]=list.get(i);
        }
        return ans;

    }
    public static void main(String[] args) {
        Tcs tcs = new Tcs();
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] result = tcs.intersect(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }
}