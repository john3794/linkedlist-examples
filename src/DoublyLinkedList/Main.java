package DoublyLinkedList;

public class Main
{

    public static void main(String[] args)
    {

        /** Create doubly linked list of integers */
        List list = new List();
        list.insertHead(1);
        list.insertHead(2);
        list.insertHead(3);
        list.insertHead(4);
        list.insertTail(999);
        list.insertTail(999);
        list.insertTail(555);
        list.changeData(1, 452);
        System.out.println("Head: " + list.printHead());
        System.out.println("Tail: " + list.printTail());

        System.out.println("Print from head: ");
        list.printFromHead();
        System.out.println();

        System.out.println("Print from tail: ");
        list.printFromTail();
        System.out.println();

        System.out.println("Remove 999 and 2: ");
        list.remove(999);
        list.remove(2);
        list.printFromHead();
        System.out.println();

        System.out.println("Insert 123 after 3: ");
        list.insertAfter(3, 123);
        list.printFromHead();
        System.out.println();

    }
}
