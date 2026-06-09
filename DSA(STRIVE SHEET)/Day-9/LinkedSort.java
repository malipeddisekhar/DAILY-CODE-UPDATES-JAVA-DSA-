import java.util.*;
import java.util.LinkedList;
class LinkedSort {
    public static void main(String[] args)
    {
        // Implementation for linked list sorting
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(3);
        list.add(8);
        list.add(1);
        list.add(4);
        System.out.println("Original List: " + list);
        Collections.sort(list);
        System.out.println("Sorted List: " + list);
        for(Integer num : list)
        {
            System.out.print(num + " ");
        }
    }
}
