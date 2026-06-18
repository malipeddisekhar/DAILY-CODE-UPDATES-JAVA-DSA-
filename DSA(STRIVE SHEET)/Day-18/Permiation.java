import java.util.*;
class Permiation {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        boolean[] used= new boolean[nums.length];
        backtrack(nums,used,new ArrayList<>(),ans);
        return ans;
    }
    private void backtrack(int[] nums,boolean[] used,List<Integer> temp,List<List<Integer>> ans)
    {
        if(temp.size()==nums.length)
        {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(used[i])
                continue;
            used[i]=true;
            temp.add(nums[i]);
            backtrack(nums,used,temp,ans);
            temp.remove(temp.size()-1);
            used[i]=false;
        }
    }
    public static void main(String[] args) {
        Permiation permiation = new Permiation();
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = permiation.permute(nums);
        System.out.println(result);
    }
}