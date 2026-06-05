class MajorElement {
    public int majorityElement(int[] nums) {
        int count=0;
        int cand=0;
        for(int num:nums)
        {
            if(count ==0)
            {
                cand=num;
            }
            if(num==cand)
            {
                count ++;
            }else
            {
                count --;
            }
        }
        return cand;
    }
    public static void main(String[] args) {
        MajorElement s = new MajorElement();
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(s.majorityElement(nums));
    }
}