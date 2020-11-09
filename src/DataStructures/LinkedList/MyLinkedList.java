package DataStructures.LinkedList;

public class MyLinkedList
{
    class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    private int size()
    {
        int elements = 0;
        Node count = head;
        while (count != null)
        {
            count = count.next;
            elements++;
        }
        return elements;
    }

    public void addNode(int data)
    {
        Node node = new Node(data);
        if (head == null)
        {
            head = node;
            tail = node;
        }
        else
        {
            tail.next = node;
            tail = node;
        }
    }

    public void addNode(int data, int index)
    {
        Node node = new Node(data);
        int position = 0;
        if (index < 0)
        {
            System.err.println("Incorrect position");
            return;
        }
        Node temp = head;
        while (position != index-1)
        {
            temp = temp.next;
            position++;
        }
        node.next = temp.next;
        temp.next = node;
    }

    public void deleteNode(int index)
    {
        int position = 0;
        if (index > size() || index < 0)
        {
            System.err.println("Incorrect position");
            return;
        }
        Node temp = head;
        while (position != index-1)
        {
            temp = temp.next;
            position++;
        }
        temp.next =temp.next.next;
    }

    public void display()
    {
        Node current = head;

        if (head == null)
        {
            System.out.println("List is empty");
            return;
        }

        System.out.println("Data in Linked List: ");
        while (current != null)
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        MyLinkedList list = new MyLinkedList();
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(25,2);

        list.display();
        System.out.println("Size of Linked List: "+list.size());
    }
}
