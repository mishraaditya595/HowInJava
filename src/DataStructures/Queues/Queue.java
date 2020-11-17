package DataStructures.Queues;

public class Queue
{
    int[] arr;
    int front, rear, capacity, count;

    Queue(int size)
    {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    void dequeue()
    {
        if (size() == 0)
        {
            System.out.println("Underflow");
            return;
        }

        System.out.println("Removed element: " + arr[front]);
        front = (front + 1) % capacity;
        count--;
    }

    void enqueue(int item)
    {
        if (size() == capacity)
        {
            System.out.println("Overflow");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = item;
        count++;
    }

    void display()
    {
        for (int i : arr)
            System.out.print(i);
        System.out.println();
    }

    int size()
    {
        return count;
    }

    public static void main(String[] args)
    {
        Queue queue = new Queue(10);
        for (int i = 1; i < 5; i++)
           queue.enqueue(i);

        queue.enqueue(5);

        queue.display();

        queue.dequeue();

        queue.dequeue();

        queue.enqueue(10);

        queue.display();
    }
}
