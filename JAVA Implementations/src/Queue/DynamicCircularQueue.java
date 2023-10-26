package Queue;

public class DynamicCircularQueue extends CircularQueue {
    public DynamicCircularQueue(){
        super();
    }
    public DynamicCircularQueue(int size){
        super(size);
    }
    @Override
    public boolean insert(int item) throws Exception {
        if(isFull()){
           int[] temp = new int[circularQueue.length * 2];
           for(int i=0;i<circularQueue.length;i++){
               temp[i] = circularQueue[(front + i) % circularQueue.length];
           }
            front = 0;
            rear =  circularQueue.length;
            circularQueue = temp;

        }
        super.insert(item);
        return true;
    }
}
