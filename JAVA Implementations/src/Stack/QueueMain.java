package Stack;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue(5);
        queue.insert(1);
        queue.insert(3);
        queue.insert(145);
        queue.insert(123);
        queue.insert(6);

        queue.display();
        System.out.println(queue.front());
        System.out.println(queue.remove());
        queue.display();

        Queue queue1 = new Queue(5);
        queue1.enqueue(1);
        queue1.enqueue(2);
        queue1.enqueue(3);
        queue1.enqueue(4);
        queue1.enqueue(5);
        System.out.println("Current Queue Size:" + queue1.size());
        System.out.println(queue1.dequeue());
        System.out.println(queue1.dequeue());
        System.out.println(queue1.dequeue());
        System.out.println(queue1.dequeue());
        System.out.println(queue1.dequeue());
        System.out.println("Current Queue Size:"+ queue1.size());
        //here observe that the queue is empty but i can't insert a item
        //So,to optimize it we use circular queue.
        queue1.enqueue(6);

    }
}
