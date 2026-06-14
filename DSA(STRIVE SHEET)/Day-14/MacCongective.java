class MacCongective {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int max=0;
      for(int num:nums)
        {
            if(num==1)
            {
              count++;
              max=Math.max(max,count);
            }
            else
            {
                count=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        MacCongective obj = new MacCongective();
        int[] nums = {1,1,0,1,1,1};
        int maxConsecutiveOnes = obj.findMaxConsecutiveOnes(nums);
        System.out.println("Maximum consecutive ones: " + maxConsecutiveOnes);
    }
}
