// class Hasing
// {
//     public static void main(String[] args)
//     {
//         int arr[]={6,3,7,3,7};
//         int n=arr.length;
//         for(int i=0;i<n-1;i++)
//         {
//             boolean swapped=false;
//             for(int j=0;j<n-i-1;j++)
//             {
//                 if(arr[j]>arr[j+1])
//                 {
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                     swapped=true;
//                 }
//             }
//             if(swapped==false)
//             {
//                 break;
//             }
//         }
//         for(int i=0;i<arr.length;i++)
//         {
//             System.out.print(arr[i]+" ");
//         }
//     }
// }

import java.util.HashMap;
class Hasing
{
    public static void main(String[] args)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(1,2);
        map.put(2,3);
        map.put(3,4);
        System.out.println(map);//{1=2, 2=3, 3=4}
        for(int i:map.keySet())
        {
            System.out.println(i+" "+map.get(i));
        }
    }
}