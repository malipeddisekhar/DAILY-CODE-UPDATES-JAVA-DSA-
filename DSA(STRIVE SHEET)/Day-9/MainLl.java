class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}//creating a node class with data and next pointer

class LinkedList
{
    Node head;

    // Insert at Beginning
    public void insertAtBeginning(int data)
    {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    // Insert at End
    public void insertAtEnd(int data)
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

    // Insert at Position
    public void insertAtPosition(int data, int pos)
    {
        Node newNode = new Node(data);

        if(pos == 1)
        {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;

        for(int i = 1; i < pos - 1 && temp != null; i++)
        {
            temp = temp.next;
        }

        if(temp == null)
        {
            System.out.println("Invalid Position");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete Node
    public void deleteNode(int key)
    {
        if(head == null)
        {
            return;
        }

        if(head.data == key)
        {
            head = head.next;
            return;
        }

        Node temp = head;

        while(temp.next != null && temp.next.data != key)
        {
            temp = temp.next;
        }

        if(temp.next == null)
        {
            System.out.println("Element Not Found");
            return;
        }

        temp.next = temp.next.next;
    }

    // Search Element
    public boolean search(int key)
    {
        Node temp = head;

        while(temp != null)
        {
            if(temp.data == key)
            {
                return true;
            }

            temp = temp.next;
        }

        return false;
    }

    // Reverse Linked List
    public void reverse()
    {
        Node prev = null;
        Node curr = head;

        while(curr != null)
        {
            Node next = curr.next;

            curr.next = prev;

            prev = curr;
            curr = next;
        }

        head = prev;
    }

    // Find Middle Node
    public void findMiddle()
    {
        if(head == null)
        {
            System.out.println("List is Empty");
            return;
        }

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Middle Element = " + slow.data);
    }

    // Display
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
}

public class MainLl
{
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        System.out.println("Original List:");
        list.display();

        list.insertAtBeginning(5);
        System.out.println("\nAfter Insert At Beginning:");
        list.display();

        list.insertAtPosition(25, 4);
        System.out.println("\nAfter Insert At Position:");
        list.display();

        list.deleteNode(30);
        System.out.println("\nAfter Delete 30:");
        list.display();

        System.out.println("\nSearch 20:");
        System.out.println(list.search(20));

        System.out.println("\nMiddle Element:");
        list.findMiddle();

        list.reverse();
        System.out.println("\nAfter Reverse:");
        list.display();
    }
}