package SinglyLinkedList;

public class Main
{
    public static void main(String[] args)
    {

        /** Create singly linked list of integers */
        List list = new List();
        list.insert(2);
        list.insert(5);
        list.insert(100);
        list.insert(42);
        list.insert(63);

        System.out.println("Print list: ");
        list.print();
        System.out.println();

        System.out.println("Print list after swap: ");
        list.swapValue(4, 90);
        list.print();
        System.out.println();
    }
}
