package SinglyLinkedList;


public class List
{

    private Node head = null;

    public void insert(int i)
    {
        Node node = new Node(i);
        if (isEmpty())
        {
            head = node;
            return;
        }
        node.next = head;
        head = node;        // new node is the head
    }

    public void print()
    {
        // if head == null
        if (isEmpty())
        {
            return;
        }
        Node current = head;
        while (current != null)
        {
            System.out.print(current.data + " - ");
            current = current.next;
        }
    }

    private boolean isEmpty()
    {
        return head == null;
    }

    private Node findAddress(int search)
    {
        if (isEmpty())
        {
            return null;
        }
        Node current = head;
        while (current != null)
        {
            if (current.data == search)
            {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void swapValue(int oldValue, int newValue)
    {
        Node current;
        current = findAddress(oldValue);
        if (current != null)
        {
            current.data = newValue;
        }
    }

}
