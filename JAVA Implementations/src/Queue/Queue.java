package Queue;

public class Queue {
    protected int[] queue;
    private static final int DEFAULT_SIZE = 10;
    int front;
    int rear;
    public Queue(){
        this(DEFAULT_SIZE);
    }
    public Queue(int size){
        queue = new int[size];
        front = 0;
        rear = -1;
    }

    public void enqueue(int item) throws Exception {
        if(isFull()){
            throw new Exception("Queue is Full");
        }
        queue[++rear] = item;
    }
    public int dequeue() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        front++;
        return queue[front-1];
    }
    public boolean isFull(){
        return rear == queue.length -1;
    }
    public boolean isEmpty() {
        return front - 1 == rear;
    }
    public int size() {
        return rear - front + 1;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

}
