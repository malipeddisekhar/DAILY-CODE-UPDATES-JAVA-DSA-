class Selection
{
    public static void main(String[] args)
    {
        int[] arr = { 64, 25, 12, 22, 11 };
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min])//Find the minimum element in unsorted array //25<64 //12<25 //22<12 //11<22
                    min = j;//Update the minimum element index //min=1 //min=2 //min=3 //min=4

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Sorted array");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
// class Selection
// {
//     public static void main(String []args)
//     {
//         int arr[]={0,1,2,3,4,5};
//         int n=arr.length;
//         for(int i=0;i<n;i++)
//         {
//             // for(int j=i+1;j<=n;j++)
//             // {
//             //     if(arr[i]==arr[j])
//             //     {
//             //         System.out.println(arr[i]);
//             //     }
//             // }
//         }
//         System.out.println("Duplicate elements in the array: "+arr[n-1]);  
//     }
// }