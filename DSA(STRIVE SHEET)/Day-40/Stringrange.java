import java.util.*;
class Stringrange {
    public List<String> summaryRanges(int[] nums) {
       List<String> s=new ArrayList<>();
       int i=0;
       while(i<nums.length)
       {
        int start=nums[i];
        while(i+1<nums.length&&nums[i+1]==nums[i]+1){
            i++;
        }
        int end=nums[i];
        if(start==end)
        {
            s.add(String.valueOf(start));
        }
        else
        {
            s.add(start +"->"+end);
        }
        i++;

       }
       return s;}
}