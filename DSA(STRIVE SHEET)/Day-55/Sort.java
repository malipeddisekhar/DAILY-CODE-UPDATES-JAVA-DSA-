// class Sort
// {
//     public static void main(String[] args)
//     {
//         int arr[]={5,4,3,2,1};
//         int n=arr.length;
//         for(int i=0;i<n-1;i++)
//         {
//             for(int j=0;j<n-i-1;j++)
//             {
//                 if(arr[j]>arr[j+1])
//                 {
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                 }
//             }
//         }
//         for(int i=0;i<n;i++)
//         {
//             System.out.print(arr[i]+" ");
//         }
//     }
// }




class Main
{
    public static void main(String[] args)
    {
        int arr[]={6,3,7,3,7};
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            boolean swapped=false;
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if(swapped==false)
            {
                break;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}