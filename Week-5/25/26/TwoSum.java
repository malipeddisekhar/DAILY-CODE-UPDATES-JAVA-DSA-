
import java.util.HashMap;

//two sum by using the Hashmap
class TwoSum
{
    public static void main(String[] args)
    {
        int []nums={2,7,11,15};
        int target=9;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int val=target-nums[i];
            if(map.containsKey(val))
            {
                System.out.println("[ " + map.get(val) + "," + i + " ]");
                return;
            }
            else
            {
                map.put(nums[i],i);
            }
        }
    }
}