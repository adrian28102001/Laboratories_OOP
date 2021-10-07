package lab2.task2;

public class main {
    public static void main(String[] args) {
        System.out.println("For the first queue we have:");
        Queue queue = new Queue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        queue.push(6);
        queue.push(7);
        queue.push(8);
        queue.push(9);
        queue.push(10);
        System.out.println("Size of the queue " + queue.size());
        queue.pop();
        queue.pop();
        queue.pop();
        System.out.println("The front element of the queue " + queue.peek());
        queue.pop();
        queue.pop();
        queue.pop();
        System.out.println("The front element of the queue " + queue.peek());

        Queue queueLimited = new Queue(10);
        System.out.println("For the second queue we have:");
        queueLimited.push(1);
        queueLimited.push(2);
        queueLimited.push(3);
        queueLimited.push(4);
        queueLimited.push(5);
        queueLimited.push(6);
        queueLimited.push(7);
        queueLimited.push(8);
        queueLimited.push(9);
        queueLimited.push(10);
        System.out.println("Size of the queue" + queueLimited.size());
        queueLimited.pop();
        queueLimited.pop();
        queueLimited.pop();
        System.out.println("The front element of the queue " + queueLimited.peek());
        queueLimited.pop();
        queueLimited.pop();
        queueLimited.pop();
        System.out.println("The front element of the queue " + queueLimited.peek());
    }
}
