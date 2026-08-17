// class Main
// {
//  public static void main(String[] args)
//  {
//     int []arr={1,2,3,5,6,2,3};
//     int []prefix=new int[arr.length];
//     prefix[0]=arr[0];
//     for(int i=1;i<arr.length;i++)
//     {
//         prefix[i]=prefix[i-1]+arr[i];
//     } 
//     for(int x:prefix)
//     {
//         System.out.println(x);
//     }
//  }
// }

// import java.util.*;
// class Main
// {
//     public static void main(String[] args)
//     {
//         int arr[]={5,3,5,4,6,3,6};
//         Arrays.sort(arr);
//         for(int x:arr)
//         {
//             System.out.println(x);
//         }
//     }
// }




class Info
{
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3};

for(int i = 0; i < arr.length; i++) {

    for(int j = i; j < arr.length; j++) {

        for(int k = i; k <= j; k++) {
            System.out.print(arr[k] + " ");
        }

        System.out.println();
    }
}
    }
}