/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
class Reversell {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null|| head.next==null||k==0)
        {
            return head;
        }
        int len=1;
        ListNode tail=head;
        while(tail.next!=null)
        {
            tail=tail.next;
            len++;
        }
        tail.next=head;
        k=k%len;
        int stepstonew=len-k;
        ListNode Newtail=head;
        for(int i=1;i<stepstonew;i++)
        {
            Newtail=Newtail.next;
        }
        ListNode newhead=Newtail.next;
        Newtail.next=null;
        return newhead;
       
    }
    public static void main(String[] args) {
        Reversell obj=new Reversell();
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        int k=2;
        ListNode newhead=obj.rotateRight(head, k);
        while(newhead!=null)
        {
            System.out.print(newhead.val+" ");
            newhead=newhead.next;
        }
    }
}