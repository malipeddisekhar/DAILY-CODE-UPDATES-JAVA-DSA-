// import java.util.HashSet;
// class Hash
// {
//     public static void main(String[] args) {
//         HashSet<String> set = new HashSet<>();

//         set.add("Apple");
//         set.add("Banana");
//         set.add("Orange");
//         set.add("Apple"); // Duplicate element, will not be added

//         System.out.println(set); // Output: [Apple, Banana, Orange]

//         System.out.println(set.contains("Banana")); // Output: true
//         System.out.println(set.contains("Grapes")); // Output: false

//         set.remove("Orange");
//         System.out.println(set); // Output: [Apple, Banana]

//         System.out.println("Size of the set: " + set.size()); // Output: Size of the set: 2
//     }
// }
// //The hash set not allow to store the duplicates it stores only unique elements and it does not maintain any order of the elements.
// //

//===================================================================
//using hashSet 
//we finud the duplicates in the array
// if the artay elemets are containd 2 times then e can print the duplicates elements in the array
// import java.util.HashSet;
// class Hash
// {
//     public static void main(String[] args) {
//         int[] arr = {};
//         HashSet<Integer> set = new HashSet<>();

//         System.out.println("Duplicate elements in the array:");
//         for (int num : arr) {
//             if (!set.add(num)) { // If add returns false, it means the element is a duplicate
//                 System.out.print(num+" "); // Print in the list formate 
//             }
//         }
//     }
// }

//===================================================================

import java.util.HashSet;
import java.util.List;

class Hash
{
    public static void main(String[] args)
    {
        int[] num={1,2,3,5,2,4,2,4,6};
        HashSet<Integer> set=new HashSet<>();
        List<Integer> list=new java.util.ArrayList<>();
        for(int nums:num)
        {
            if(set.contains(nums))
            {
                list.add(nums);
            }
            else
            {
                set.add(nums);
            }
        }
        System.out.println("Duplicate elements in the array: "+list);
    }
}
//===================================================================
