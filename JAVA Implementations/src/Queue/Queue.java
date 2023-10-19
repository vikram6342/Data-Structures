package Queue;

public class Queue {
    static int front,rear;
    static int capacity = 10;
    static int[] queue;

    public Queue(){
        this(capacity);
    }
    public Queue(int size){

        queue = new int[size];
    }
}
