class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
class Palindrome {

    public boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        // Find middle
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        ListNode secondHalf = reverse(slow.next);

        ListNode firstHalf = head;
        ListNode temp = secondHalf;

        // Compare
        while (temp != null) {
            if (firstHalf.val != temp.val) {
                return false;
            }

            firstHalf = firstHalf.next;
            temp = temp.next;
        }

        return true;
    }

    private ListNode reverse(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {

            ListNode next = curr.next;

            curr.next = prev;

            prev = curr;
            curr = next;
        }

        return prev;
    }
    public static void main(String[] args) {
        Palindrome obj = new Palindrome();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        boolean isPalindrome = obj.isPalindrome(head);
        System.out.println("Is the linked list a palindrome? " + isPalindrome);
    }
}