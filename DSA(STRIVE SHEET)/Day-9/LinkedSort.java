// import java.util.*;
// import java.util.LinkedList;
// class LinkedSort {
//     public static void main(String[] args)
//     {
//         // Implementation for linked list sorting
//         LinkedList<Integer> list = new LinkedList<>();
//         list.add(5);
//         list.add(3);
//         list.add(8);
//         list.add(1);
//         list.add(4);
//         System.out.println("Original List: " + list);
//         Collections.sort(list);
//         System.out.println("Sorted List: " + list);
//         for(Integer num : list)
//         {
//             System.out.print(num + " ");
//         }
//     }
// }





class Node
{
    int data ;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
class LinkedSort
{
public static void main(String[] args)
{
    Node n1=new Node(10);
    Node n2=new Node(20);
    Node n3=new Node(30);//creating nodes
    n1.next=n2;
    n2.next=n3;//linking nodes
    Node head=n1;//head of the linked list
    // Traversing the linked list
    Node Temp=head;//
    while(Temp!=null)//loop until the end of the linked list
    {
       System.out.println(Temp.data);//printing the data of the current node
       Temp=Temp.next;//moving to the next node
    }
}
}