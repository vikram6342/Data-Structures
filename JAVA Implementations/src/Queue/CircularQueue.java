package Queue;

public class CircularQueue {
    int[] circularQueue;
    private static final int DEFAULT_size = 10;
    int front = 0;
    int rear = 0;
    int size = 0;

    public CircularQueue(){
        this(DEFAULT_size);
    }
    public CircularQueue(int size){
        circularQueue = new int[size];
    }

    public boolean insert(int item) throws Exception{
        if(isFull()){
            throw new Exception("Queue is Full!!");
        }
        circularQueue[rear++] = item;
        rear = rear % circularQueue.length;
        size++;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int removedItem = circularQueue[front];
        front = (front+1) % circularQueue.length;
        size--;
        return removedItem;
    }
    public boolean isFull(){
        return size == circularQueue.length;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public int size(){
        return size;
    }

    public void display() throws Exception{
        if(isEmpty()){
            throw new Exception("Empty Queue");
        }
        int i = front;
        do{
            System.out.print(circularQueue[i] + "->");
            i++;
            i %= circularQueue.length;
        }while (i != rear);
        System.out.println("END");
    }

}
