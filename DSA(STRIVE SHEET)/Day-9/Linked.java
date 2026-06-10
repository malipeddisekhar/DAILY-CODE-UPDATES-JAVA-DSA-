// class Node {
//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }


// class Linked {
//     public static void main(String[] args)
// {
//     Node n1=new Node(10);
//     Node n2=new Node(20);
//     Node n3=new Node(30);
//     Node head=n1;
//     n1.next=n2;
//     n2.next=n3;//Reference to the next node

//     //Treaverseing the linked list print the values
//     Node temp=head;
//     while(temp!=null)
//     {
//         System.out.println(temp.data);
//         temp=temp.next;
//     }
// }
// }











class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class Linked
{
    public static void main(String []args)
    {
        int arr[]={10,20,30};
        Node obj=new Node(arr[2]);
        System.out.println(obj.data);
        Node head=obj;
    }
}