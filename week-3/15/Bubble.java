//Bubble sort implementation in Java
class Bubble
{
    public static void main(String []args)
    {
        int arr[]={5,1,4,2,8};
        int n=arr.length;   
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)//N-i-1 because after each iteration the last element is in place.
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted array is: ");
        for(int i=0;i<n;i++)        {
            System.out.print(arr[i]+" ");
        }
    }
}
//tHE BUBBLE SORT ITS NOT AN EFFECENT ALGORITHM BUT ITS A GOOD STARTING POINT TO LEARN SORTING ALGORITHMS. IT WORKS BY REPEATEDLY SWAPPING ADJACENT ELEMENTS IF THEY ARE IN THE WRONG ORDER. THE TIME COMPLEXITY OF BUBBLE SORT IS O(N^2) IN THE WORST AND AVERAGE CASES, AND O(N) IN THE BEST CASE WHEN THE ARRAY IS ALREADY SORTED.
