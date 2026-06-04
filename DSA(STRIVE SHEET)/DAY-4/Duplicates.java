//find the duplicates in java   
import java.util.Arrays;
class Duplicates
{
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10,1,2,3};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}