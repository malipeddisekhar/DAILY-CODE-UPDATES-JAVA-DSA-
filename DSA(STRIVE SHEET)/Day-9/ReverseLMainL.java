//Brute Force Approach:
// Time Complexity: O(n) for traversing the list and O(n) for stack operations

import java.util.*;

// Definition for singly-linked list node
class Node {
    int val;
    Node next;
    Node(int x) {
        val = x;
        next = null;
    }
}

class Solution {
    // Function to reverse a linked list using stack
    public Node reverseList(Node head) {
        // Stack to store values of nodes
        Stack<Integer> stack = new Stack<>();

        // Temporary pointer to traverse the list
        Node temp = head;

        // Traverse and push all node values to stack
        while (temp != null) {
            stack.push(temp.val);
            temp = temp.next;
        }

        // Reset temp back to head
        temp = head;

        // Reassign values from stack in reverse order
        while (temp != null) {
            temp.val = stack.pop();
            temp = temp.next;
        }

        // Return the modified head
        return head;
    }
}

// Driver code
class ReverseLL {
    public static void main(String[] args) {
        // Creating linked list 1 -> 2 -> 3 -> null
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        Solution sol = new Solution();
        head = sol.reverseList(head);

        // Printing reversed list
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}



// //==Optimal Approach: Two Pointer Technique
// // Definition for singly-linked list node
// class ListNode {
//     int val;
//     ListNode next;

//     // Constructor to initialize node value
//     ListNode(int val) {
//         this.val = val;
//         this.next = null;
//     }
// }

// class ReverseLMainL {
//     // Function to reverse a linked list iteratively
//     public ListNode reverseList(ListNode head) {
//         // Initialize previous pointer to null
//         ListNode prev = null;

//         // Start from the head of the list
//         ListNode temp = head;

//         // Traverse the list
//         while (temp != null) {
//             // Save the next node
//             ListNode front = temp.next;

//             // Reverse the current node's pointer
//             temp.next = prev;

//             // Move prev to current node
//             prev = temp;

//             // Move to the next node
//             temp = front;
//         }

//         // Return new head (last node becomes first)
//         return prev;
//     }
// }

// // Driver class
// class ReverseLLMain {
//     public static void main(String[] args) {
//         // Creating a linked list: 1 -> 2 -> 3 -> 4 -> 5
//         ListNode head = new ListNode(1);
//         head.next = new ListNode(2);
//         head.next.next = new ListNode(3);
//         head.next.next.next = new ListNode(4);
//         head.next.next.next.next = new ListNode(5);

//         ReverseLMainL sol = new ReverseLMainL();
//         // Reversing the list
//         ListNode newHead = sol.reverseList(head);

//         // Printing the reversed list
//         while (newHead != null) {
//             System.out.print(newHead.val + " ");
//             newHead = newHead.next;
//         }
//         System.out.println();
//     }
// }

//Leetcode solution for Reverse Linked List
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
// class Solution {
//     public ListNode reverseList(ListNode head) {
//         ListNode prev=null;
//         ListNode temp=head;
//         while(temp!=null)
//         {
//             ListNode front=temp.next;
//             temp.next=prev;
//             prev=temp;
//             temp=front;
//         }
//         return prev;
//     }
// }