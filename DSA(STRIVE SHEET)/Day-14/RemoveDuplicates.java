class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
          int i = 0; // slow pointer
        for (int j = 1; j < nums.length; j++) { // fast pointer
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
        }
        public static void main(String[] args) {
            RemoveDuplicates obj = new RemoveDuplicates();
            int[] nums = {0,0,1,1,1,2,2,3,3,4};
            int newLength = obj.removeDuplicates(nums);
            System.out.println("New length: " + newLength);
            System.out.print("Modified array: ");
            for (int i = 0; i < newLength; i++) {
                System.out.print(nums[i] + " ");
            }
            System.out.println();
    }
}
//leetcode solution for 26. Remove Duplicates from Sorted Array
//See in my leetcode profile for more solutions for strive sheet challenge