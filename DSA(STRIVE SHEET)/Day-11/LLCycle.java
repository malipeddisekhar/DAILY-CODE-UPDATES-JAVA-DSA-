import java.util.*;
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
public class LLCycle{
    public boolean hasCycle(ListNode head) {
        ListNode temp=head;
        HashMap<ListNode,Integer> np=new HashMap<>();
        while(temp!=null)
        {
            if(np.containsKey(temp))
            {
                return true;
            }
            np.put(temp,1);
            temp=temp.next;
        }
        return false;
    }
    public static void main(String[] args) {
        LLCycle obj = new LLCycle();
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next; // Creating a cycle

        boolean hasCycle = obj.hasCycle(head);
        System.out.println("Does the linked list have a cycle? " + hasCycle);
    }
}