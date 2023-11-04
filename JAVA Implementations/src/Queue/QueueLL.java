package Queue;
class  Node{
    int val;
    Node next;

    public Node(Node next) {
        this.next = null;
    }

    public Node(int val) {
        this.val = val;
    }
}
public class QueueLL  {
    Node front , rear=null;
    public void enqueue(int val){
        Node temp=new Node(val);
        if(front ==null && rear==null){
            front=rear=temp;
        }
        else{
            rear.next=temp;
            rear=temp;
        }
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }
        int val= front.val;
        front=front.next;

        if(front==null){
            rear=null;
        }
        return val;
    }

    public int front(){
        if(isEmpty()){
            System.out.println("queue is Empty");
        }
        return front.val;
    }

    public void display(){
        Node temp=front;
        while(temp!=null){
            System.out.print(temp.val + "->");
            temp=temp.next;
        }
    }

    public boolean isEmpty(){
        return rear==null;
    }
}
