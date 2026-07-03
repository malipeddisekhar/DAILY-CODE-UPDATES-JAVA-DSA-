import java.util.Arrays;
class SquareArray
{
    public static void main(String args[])
    {
        int arr[] = {1,9,8,7,6,5,4,32};
        int n = arr.length;
        for(int i=0; i<n; i++)
        {
            arr[i] *=arr[i];
        }
         Arrays.sort(arr);
         for(int i=0; i<n; i++)
         {
             System.out.print(arr[i]+" ");
         }
    }
}
