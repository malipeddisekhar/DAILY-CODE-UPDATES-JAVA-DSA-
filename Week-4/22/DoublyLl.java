class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
public class DoublyLl
{
    Node head;
    public void addAtBegging(int data)
    {
        Node newNode = new Node(data);
          if(head == null)
          {
              head = newNode;
          }
          else
          {
              newNode.next = head;
              head.prev = newNode;
              head = newNode;
          }
    }
    public void addAtEnd(int data)
    {
        Node newNode = new Node(data);
        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }
    public void display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + "-><-");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args)
    {
        DoublyLl dll = new DoublyLl();
        dll.addAtBegging(10);
        dll.addAtBegging(20);
        dll.addAtEnd(30);
        dll.addAtEnd(40);
        dll.display(); // Output: 20-><-10-><-30-><-40-><-null
    }
}