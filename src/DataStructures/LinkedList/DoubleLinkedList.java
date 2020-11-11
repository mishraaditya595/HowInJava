package DataStructures.LinkedList;

public class DoubleLinkedList
{
    class Node
    {
        public int data;
        public Node prev;
        public Node next;

        public Node(int data)
        {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    Node head = null;

    public void addNode(int data)
    {
        Node node = new Node(data);
        if (head == null)
        {
            head = node;
            node.prev = null;
            node.next = null;
        }
        else
        {
            Node temp = head;
            while (temp.next != null)
            {
                temp = temp.next;
            }
            node.prev = temp;
            temp.next = node;
            node.next = null;
        }
    }

    public void addNode(int data, int index)
    {
        Node node = new Node(data);
        if (index > size())
            System.err.println("Overflow");
        else
        {
            int ptr = 0;
            Node temp = head;
            while (ptr < index - 1)
            {
                temp = temp.next;
                ptr++;
            }
            node.next = temp.next;
            node.prev = temp;
            temp.next = node;
            temp.next.prev = node;
        }
    }

    public void delete(int index)
    {
        int ptr = 0;
        if (head == null || index<0)
        {
            System.out.println("Underflow");
        }
        else
        {
            Node temp = head;
            while (ptr < index-1)
            {
                temp = temp.next;
                ptr++;
            }
            Node temp2 = temp.next;

            temp2.next.prev = temp2.prev;
            temp.next = temp.next.next;

        }
    }

    public void display()
    {
        Node temp = head;
        if (head == null)
        {
            System.out.println("---");
            return;
        }

        while (temp.next != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    public int size()
    {
        int size = 0;
        if (head == null)
        {
            return 0;
        }
        else
        {
            Node temp = head;
            while (temp.next != null)
            {
                size++;
                temp = temp.next;
            }
            size++;
        }
        return size;
    }

    public static void main(String[] args)
    {
        DoubleLinkedList list = new DoubleLinkedList();
        list.addNode(15);
        list.addNode(25);
        list.addNode(35);
        list.addNode(45);
        list.addNode(55);
        list.addNode(20,1);
        list.addNode(30,3 );
        System.out.println(list.size());
        list.display();
        list.delete(3);
        list.display();
        System.out.println(list.size());
        list.addNode(60,6);
        list.delete(0);
        list.display();
    }
}
