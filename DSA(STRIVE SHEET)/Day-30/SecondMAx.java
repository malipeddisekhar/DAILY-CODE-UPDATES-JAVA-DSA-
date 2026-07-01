import java.util.Scanner;
class SecondMAx {
    public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    int max=arr[0];
    int Second=-1;
    for(int i=0;i<arr.length;i++)
    {
      if(arr[i]>max)
      {
        Second=max;
        max=arr[i];
      }
      else if(arr[i]>Second&&arr[i]!=max)
      {
        Second=arr[i];
      }

    }
    System.out.println(Second);

}
}
