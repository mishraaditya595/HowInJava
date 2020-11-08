package DataStructures.LinkedList;

import java.util.LinkedList;

public class BasicLinkedList
{
    static LinkedList<String> list = new LinkedList<>();

    public static void main(String[] args)
    {
        add();
        replace();
        remove();
        traverse();
    }

    private static void add()
    {
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("F");
        System.out.println(list);

        list.add(3,"D");
        System.out.println(list);

        list.addLast("F");
        System.out.println(list);

        list.addFirst("A");
        System.out.println(list);
    }

    private static void replace()
    {
        list.set(5,"E");
        System.out.println(list);
    }

    private static void remove()
    {
        list.remove("F");
        System.out.println(list);

        list.remove(1);
        System.out.println(list);
    }

    private static void traverse()
    {
        for (int i = 0; i < list.size(); i++)
            System.out.print(list.get(i)+" ");
    }
}
