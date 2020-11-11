package DataStructures.LinkedList;

public class CircularLinkedList
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

    public void add(int data)
    {
        Node node = new Node(data);

        if (head == null)
        {
            head = node;
            head.next = head;
        }
        else
        {
            Node temp = head;
            while (temp.next != head)
            {
                temp = temp.next;
            }
            node.next = head;
            temp.next = node;
        }
    }

    public void add(int index, int data)
    {
        Node node = new Node(data);
        Node temp = head;
        int count = 0;
        if (index == 0)
        {
            while (temp.next != head)
            {
                temp= temp.next;
            }
            temp.next = node;
            node.next = head;
            head = node;
            return;
        }
        while(count < index-1)
        {
            count++;
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
    }

    public void delete(int index)
    {
        if (head == null)
            System.err.println("Underflow");
        else
        {
            Node ptr = head,temp;
            int count = 0;
            if (index == 0)
            {
                while(ptr.next != head)
                {
                    ptr = ptr.next;
                }
                head = head.next;
                ptr.next = head;
            }
            else
            {
                while (count != index)
                {
                    count++;
                    if (count == index)
                    {
                        temp = ptr;
                        temp.next = ptr.next.next;
                        break;
                    }
                    ptr = ptr.next;
                }
            }
        }
    }

    public void display()
    {
        Node temp = head;
        if (temp == null)
            System.out.println("No elements");
        else
        {
            do
            {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }while (temp.next != head);
            System.out.print(temp.data);
            System.out.println();
        }
    }

    public int size()
    {
        Node temp = head;
        int size = 0;
        while (temp.next != head)
        {
            size++;
            temp = temp.next;
            if (temp.next == head)
                size++;
        }
        return size;
    }

    public static void main(String[] args)
    {
        CircularLinkedList list = new CircularLinkedList();
        list.display();
        list.add(150);
        list.add(20);
        list.add(30);
        list.add(50);
        list.add(60);
        list.add(3, 1000);
        list.add(70);
        list.display();
        list.delete(0);
        list.delete(2);
        list.delete(4);
        list.display();
        System.out.println(list.size());
    }
}
