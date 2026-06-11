// // Middle node In the Linked list
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
// class MiddleLinked
// {
//     public static void main(String[] args) {
//     Node n1=new Node(1);
//     Node n2=new Node(2);
//     Node n3=new Node(3);
//     Node n4=new Node(4);
//     Node n5=new Node(5);
//     Node head=n1;
//     n1.next=n2;
//     n2.next=n3;
//     n3.next=n4;
//     n4.next=n5;
//     Node temp=head;
//     int count=0;
//     while(temp!=null)
//     {
//         count++;
//         temp=temp.next;
//     }
//     int mid=count/2;
//     temp=head;
//     while(temp!=null)
//     {
//         if(mid==0)
//         {
//             System.out.println(temp.data);
//             break;
//         }
//         mid--;
//         temp=temp.next;
//     }


    
// }
// }

//Optimized code 
// Middle node In the Linked list
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
class MiddleLinked
{
    public static void main(String[] args) {
    Node n1=new Node(1);
    Node n2=new Node(2);
    Node n3=new Node(3);
    Node n4=new Node(4);
    Node n5=new Node(5);
    Node head=n1;
    n1.next=n2;
    n2.next=n3;
    n3.next=n4;
    n4.next=n5;
   Node slow=head;
   Node fast=head;
    while(fast!=null && fast.next!=null)
    {
        slow=slow.next;
        fast=fast.next.next;

    }
    System.out.println(slow.data);
}
}