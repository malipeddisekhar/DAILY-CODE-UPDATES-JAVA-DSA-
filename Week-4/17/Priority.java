//Priority queue implementation using arr
import java.util.*;
class Priority
{
    static int PriorityQueue(int arr[], int n)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num: arr)
        {
            pq.add(num);
            if(pq.size() > n)
            {
                pq.poll();//REmove the top element if the size of the priority queue exceeds n
            }
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        int arr[] = {8, 1, 5, 12, 2, 11};
        int n = 4;
        int ans = PriorityQueue(arr, n);
        System.out.println("The " + n + "th largest element is " + ans);
    }
}