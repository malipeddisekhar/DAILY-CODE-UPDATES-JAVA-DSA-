// class Node {
//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }

// public class LinkedList {
//     public static void main(String[] args) {
//         Node n1 = new Node(10);
//         Node n2 = new Node(20);
//         Node n3 = new Node(30);

//         n1.next = n2;
//         n2.next = n3;

//         Node head = n1;
//         Node temp = head;

//         while (temp != null) {
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }
//     }

// }





// class Node
// {
//     int data;
//     Node next;

//     Node(int data)
//     {
//         this.data = data;
//         this.next = null;
//     }
// }

// class SinglyLinkedList
// {
//     Node head;

//     // Insert at Beginning
//     public void insertAtBeginning(int data)
//     {
//         Node newNode = new Node(data);

//         newNode.next = head;
//         head = newNode;
//     }

//     // Insert at End
//     public void insertAtEnd(int data)
//     {
//         Node newNode = new Node(data);

//         if(head == null)
//         {
//             head = newNode;
//             return;
//         }

//         Node temp = head;

//         while(temp.next != null)
//         {
//             temp = temp.next;
//         }

//         temp.next = newNode;
//     }

//     // Insert at Position
//     public void insertAtPosition(int data, int pos)
//     {
//         Node newNode = new Node(data);

//         if(pos == 1)
//         {
//             newNode.next = head;
//             head = newNode;
//             return;
//         }

//         Node temp = head;

//         for(int i = 1; i < pos - 1; i++)
//         {
//             temp = temp.next;
//         }

//         newNode.next = temp.next;
//         temp.next = newNode;
//     }

//     // Delete Node
//     public void delete(int key)
//     {
//         if(head == null)
//             return;

//         if(head.data == key)
//         {
//             head = head.next;
//             return;
//         }

//         Node temp = head;

//         while(temp.next != null && temp.next.data != key)
//         {
//             temp = temp.next;
//         }

//         if(temp.next != null)
//         {
//             temp.next = temp.next.next;
//         }
//     }

//     // Search
//     public boolean search(int key)
//     {
//         Node temp = head;

//         while(temp != null)
//         {
//             if(temp.data == key)
//             {
//                 return true;
//             }

//             temp = temp.next;
//         }

//         return false;
//     }

//     // Find Middle
//     public void findMiddle()
//     {
//         Node slow = head;
//         Node fast = head;

//         while(fast != null && fast.next != null)
//         {
//             slow = slow.next;
//             fast = fast.next.next;
//         }

//         System.out.println("Middle = " + slow.data);
//     }

//     // Reverse
//     public void reverse()
//     {
//         Node prev = null;
//         Node curr = head;

//         while(curr != null)
//         {
//             Node next = curr.next;

//             curr.next = prev;

//             prev = curr;
//             curr = next;
//         }

//         head = prev;
//     }

//     // Display
//     public void display()
//     {
//         Node temp = head;

//         while(temp != null)
//         {
//             System.out.print(temp.data + " -> ");
//             temp = temp.next;
//         }

//         System.out.println("NULL");
//     }
// }

// public class Main
// {
//     public static void main(String[] args)
//     {
//         SinglyLinkedList list = new SinglyLinkedList();

//         list.insertAtEnd(10);
//         list.insertAtEnd(20);
//         list.insertAtEnd(30);

//         System.out.println("Original List");
//         list.display();

//         list.insertAtBeginning(5);
//         System.out.println("\nAfter Insert Beginning");
//         list.display();

//         list.insertAtPosition(25, 4);
//         System.out.println("\nAfter Insert Position");
//         list.display();

//         list.delete(20);
//         System.out.println("\nAfter Delete");
//         list.display();

//         System.out.println("\nSearch 30");
//         System.out.println(list.search(30));

//         System.out.println("\nMiddle Node");
//         list.findMiddle();

//         list.reverse();
//         System.out.println("\nAfter Reverse");
//         list.display();
//     }
// }

class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

public class SingleLL
{
    Node head;
    public void insertAtbeginning(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;//Next is the Link to another one
        head = newNode;//Head is the starting point of the linked list
    }

    public void insertAtEnd(int data)//After the last node the next will be null
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args)
    {
        SingleLL list = new SingleLL();
        list.insertAtbeginning(10);

        list.insertAtEnd(15);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        list.display();
    }
}