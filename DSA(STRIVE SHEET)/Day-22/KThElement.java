import java.util.*;
class KThElement {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> pq =
                new PriorityQueue<>(Collections.reverseOrder());

        for(int num : nums)
        {
            pq.offer(num);
        }

        for(int i=1;i<k;i++)
        {
            pq.poll();
        }

        return pq.peek();
    }
    public static void main(String[] args) {
        KThElement kThElement = new KThElement();
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        int result = kThElement.findKthLargest(nums, k);
        System.out.println(result);
    }
}