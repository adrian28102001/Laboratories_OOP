package lab2.task2;

public class Queue {
     int[] array;      // array to store queue elements
     int front;      // front points to the front element in the queue
     int rear;       // rear points to the last element in the queue
     int capacity;   // maximum capacity of the queue
     int count;      // current size of the queue

    // Constructor to initialize a queue
    public Queue()
    {
        array = new int[21474836];
        capacity = 21474836;
        front = 0;
        rear = -1;
        count = 0;
    }
    public Queue(int size)
    {
        array = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    // Utility function to dequeue the front element
    public void pop()
    {
        // check for queue underflow
        if (isEmpty())
        {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(1);
        }

        System.out.println("Removing " + array[front]);

        front = (front + 1) % capacity;
        count--;
    }

    // Utility function to add an item to the queue
    public void push(int item)
    {
        // check for queue overflow
        if (isFull())
        {
            System.out.println("Overflow\nProgram Terminated");
            System.exit(1);
        }

        System.out.println("Inserting " + item);

        rear = (rear + 1) % capacity;
        array[rear] = item;
        count++;
    }

    // Utility function to return the front element of the queue
    public int peek()
    {
        if (isEmpty())
        {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(1);
        }
        return array[front];
    }

    // Utility function to return the size of the queue
    public int size() {
        return count;
    }

    // Utility function to check if the queue is empty or not
    public Boolean isEmpty() {
        return (size() == 0);
    }

    // Utility function to check if the queue is full or not
    public Boolean isFull() {
        return (size() == capacity);
    }
}
