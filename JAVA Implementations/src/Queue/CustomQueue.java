package Queue;


// Queue implementation using single pointer
public class CustomQueue {
    protected int[] queue;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;
    public CustomQueue(){
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size){
        queue = new int[size];
    }
    public boolean insert(int item) throws Exception{
        if(isFull()){
            throw new Exception("Queue is Full!!");
        }
        queue[end++] = item;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int removedItem = queue[0];
        for(int i=1;i< end;i++){
            queue[i-1] = queue[i];
        }
        end--;
        return removedItem;
    }

    public int front(){
        return queue[0];
    }
    public void display(){
        for(int i=0;i<end;i++){
            System.out.print(queue[i] + " <- ");
        }
        System.out.println("END");
    }

    public boolean isFull(){
        return end == queue.length;
    }

    public boolean isEmpty(){
        return end == 0;
    }
}
