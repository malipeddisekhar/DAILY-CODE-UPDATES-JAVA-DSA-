class Trapping {
    public int trap(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        int maxLeft=0;
        int maxright=0;
        int totalwater=0;
        while(left<right)
        {
     if (height[left] <= height[right]) {

            if(height[left]>=maxLeft)
            {
                maxLeft=height[left];
            }else{
                totalwater+=maxLeft-height[left];
            }left++;
        }
        else
        {
            if(height[right]>=maxright)
            {
                maxright=height[right];
            }else{
                totalwater+=maxright-height[right];
            }
            right--;
        }
    }
    return totalwater;
}
}
//These is leetcode solution for 42. Trapping Rain Water
//See in my leetcode profile for more solutions