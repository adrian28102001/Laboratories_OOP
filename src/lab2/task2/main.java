package lab2.task2;

public class main {
    public static void main(String[] args) {
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
        System.out.println(queue.size());
        queue.pop();
        queue.pop();
        queue.pop();
        System.out.println(queue.peek());
        queue.pop();
        queue.pop();
        queue.pop();
        System.out.println(queue.peek());


    }
}
