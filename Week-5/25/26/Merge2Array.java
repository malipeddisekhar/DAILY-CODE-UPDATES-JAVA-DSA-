import java.util.Arrays;
class Merge2Array
{
    public static void main(String[] args)
    {
        int []arr1={1,3,5,7};
        int []arr2={2,4,6,8};
        int []merge=new int[arr1.length+arr2.length];
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<arr2[j])
            {
                merge[k++]=arr1[i++];
            }
            else
            {
                merge[k++]=arr2[j++];
            }
        }
        while(i<arr1.length)
        {
            merge[k++]=arr1[i++];
        }
        while(j<arr2.length)
        {
            merge[k++]=arr2[j++];
        }
        System.out.println("Merged array:");
        for(int x:merge)
        {
            System.out.print(x+" ");
        }
    }
}