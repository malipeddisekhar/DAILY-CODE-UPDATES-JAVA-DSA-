// class Sorting
// {
//     public static void main(String[] args)
//     {
//         int arr[]={5,4,3,2,1};
//         System.out.println("Original array:");
//         for(int i=0;i<arr.length;i++)
//         {
//             System.out.print(arr[i]+" ");
//         }
//         for(int i=0;i<arr.length-1;i++)
//         {
//             for(int j=0;j<arr.length-i-1;j++)
//             {
//                 if(arr[j]>arr[j+1])
//                 {
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                 }
//             }
//         }
//         System.out.println("\n After Sorted array:");
//         for(int i=0;i<arr.length;i++)
//         {
//             System.out.print(arr[i]+" ");
//         }
//     }
// }



//find the Third max element in the array
import java.util.Arrays;

class Sorting {
    public int thirdMax(int[] nums) {

        Arrays.sort(nums);

        int max = nums[nums.length - 1];
        int count = 1;

        for (int i = nums.length - 2; i >= 0; i--) {

            if (nums[i] != nums[i + 1]) {

                count++;

                if (count == 3) {
                    return nums[i];
                }
            }
        }

        return max;
    }
    public static void main(String[] args) {
        Sorting s = new Sorting();
        int arr[] = { 2, 2, 3, 1 };
        System.out.println(s.thirdMax(arr));
    }
}