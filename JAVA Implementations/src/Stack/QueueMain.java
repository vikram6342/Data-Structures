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

    }
}
