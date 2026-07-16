// //Bubble sorting
// class MainSorting
// {
//     public static void main(String[] args)
//     {
//         int n[] = {5, 20, 8, 4, 12, 6};
//         System.out.println("Original array:");
//         for(int i=0; i<n.length; i++)
//         {
//             System.out.print(n[i]+" ");
//         }
//          for(int i=0; i<n.length; i++)
//          {
//                 for(int j=0; j<n.length-i-1; j++)
//                 {
//                     if(n[j]>n[j+1])
//                     {
//                         int temp = n[j];
//                         n[j] = n[j+1];
//                         n[j+1] = temp;
//                     }
//                 }
//          }
        
//     }
//     public static void printArray(int arr[])
//     {
//         System.out.println("\nSorted array:");
//         for(int i=0; i<arr.length; i++)
//         {
//             System.out.print(arr[i]+" ");
//         }
//     }
// }

import java.util.Scanner;

class MainSorting
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            int max=arr[0];
            int second=-1;
            for(int i=1;i<n;i++)
            {
                if(arr[i]>max)
                {
                    second =max;
                    max=arr[i];
                }
             else if(arr[i]>second&&arr[i]<max)
            {
                second=arr[i];
            }
            }
            System.out.println(second);
            
        }
    }
}