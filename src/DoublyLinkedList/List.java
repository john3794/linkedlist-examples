package DoublyLinkedList;

public class List
{

    private Node head = null;
    private Node tail = null;
    private int length = 0;

    public int getLength()
    {
        return length;
    }

    public boolean isEmpty()
    {
        return length == 0;
    }

    public void insertHead(int value)
    {
        Node node = new Node(value);

        if (length == 0)
        {
            head = node;
            tail = node;
            length++;
            return;
        }

        node.next = head;   // move head to next
        head.prev = node;   // point to new node
        head = node;        // new node is first-in-line, i.e. head
        length++;
    }

    public void insertTail(int value)
    {
        Node node = new Node(value);

        if (length == 0)
        {
            head = node;
            tail = node;
            length++;
            return;
        }

        node.prev = tail;   // move tail to previous
        tail.next = node;   // point to new node
        tail = node;        // new node is last-in-line, i.e. tail
        length++;
    }

    public void printFromHead()
    {
        if (isEmpty()) return;

        Node current = head;

        while (current != null)
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public void printFromTail()
    {
        if (isEmpty()) return;

        Node current = tail;

        while (current != null)
        {
            System.out.print(current.data + " ");
            current = current.prev;
        }
    }

    public int printTail()
    {
        return tail.data;
    }

    public int printHead()
    {
        return head.data;
    }

    public Node findAddress(int search)
    {
        if (isEmpty())
        {
            System.out.println("Listen er tom");
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

    public void changeData(int oldValue, int newValue)
    {
        Node current;

        current = findAddress(oldValue);

        if (current != null)
        {
            current.data = newValue;
        }
    }

    public int removeHead()
    {
        if (length == 0)
        {
            return length;
        }

        if (length == 1)
        {
            head = null;
            tail = null;
            length--;
            return length;
        }

        head.next.prev = null; // remove pointer to head
        head = head.next;      // set next node as head
        length--;
        return length;
    }

    public int removeTail()
    {
        if (length == 0)
        {
            return length;
        }

        if (length == 1)
        {
            head = null;
            tail = null;
            length--;
            return length;
        }

        tail.prev.next = null;  // remove pointer to tail
        tail = tail.prev;       // set previous node as tail
        length--;
        return length;
    }

    public void remove(int data)
    {
        Node nodeFound = findAddress(data);
        if (nodeFound == null) return;
        Node current = head;
        while (current != null)
        {
            if (nodeFound.equals(head)) removeHead();
            else if (nodeFound.equals(tail)) removeTail();
            else if (current.equals(nodeFound))
            {
                nodeFound.prev.next = nodeFound.next;
                nodeFound.next.prev = nodeFound.prev;
                length--;
            }
            current = current.next;
        }
    }

    public void insertAfter(int thisNodeData, int newNodeData)
    {

        Node nodeFound = findAddress(thisNodeData);

        if (nodeFound == null)
        {
            return;
        }

        if (length == 0)
        {
            insertTail(newNodeData);
            return;
        }

        if (nodeFound.equals(tail))
        {
            insertTail(newNodeData);
            return;
        }

        Node newNode = new Node(newNodeData);
        nodeFound.next.prev = newNode;
        newNode.next = nodeFound.next;
        nodeFound.next = newNode;
        newNode.prev = nodeFound;
    }

}
