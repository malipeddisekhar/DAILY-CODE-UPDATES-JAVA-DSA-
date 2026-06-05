class MaxSub
{
public static void main(String[] args)
{
int arr[]={ -2, 1, -3, 4, -1, 2, 1, -5, 4 };
int max=Integer.MIN_VALUE;
int pre=1,suf=1;
for(int i=0;i<arr.length;i++)
{
    if(pre==0)
    {
        pre=1;
    }
    if(suf==0)
    {
        suf=1;
    }
      pre=pre*arr[i];
    suf=suf*arr[arr.length-1-i];
    max=Math.max(max,Math.max(pre,suf));
}
System.out.println("Maximum subarray sum is: " + max);
}
}