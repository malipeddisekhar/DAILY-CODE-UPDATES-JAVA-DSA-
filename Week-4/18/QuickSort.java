//Quick sort is a divide and conquer algorithm. It picks an element as pivot and partitions the given array around the picked pivot. There are many different versions of quickSort that pick pivot in different ways.
//1. Always pick the first element as pivot.
import java.util.*;
class QuickSort
{
    public static void quickSort(int [] arr, int low, int high)
    {
        if(low < high)
        {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    public static int partition(int [] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = low - 1;
        for(int j = low; j < high; j++)
        {
            if(arr[j] < pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
     public static void main(String [] args)
    {
        int arr[] = {10, 7, 8, 9, 1, 5};
        int n = arr.length;
        quickSort(arr, 0, n-1);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}