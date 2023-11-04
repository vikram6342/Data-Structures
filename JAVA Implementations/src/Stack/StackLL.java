package Stack;
 class Node{
    int val;
    Node next;

     public Node(int val) {
         this.val = val;
     }

     public Node(int val, Node next) {
         this.val = val;
         this.next = null;
     }
 }

public class StackLL {
     Node top=null;
     //Push method
    public void push(int val){
        Node temp=new Node(val);
        if(top==null){
            top=temp;
        }
        else {
            temp.next = top;
            top = temp;
        }
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("stack is underflow");
        }
        int val=top.val;
        top=top.next;
        return val;
    }
    //check the stack is empty
    public boolean isEmpty(){
        return top==null;
    }
    // check the peek element

    public int peek(){
        if(isEmpty()){
            System.out.println("stack is underflow");
        }
        return top.val;
    }

    public void display(){
        Node temp=top;
        while(temp!=null){
            System.out.print(temp.val + "->");
            temp=temp.next;
        }
        System.out.print("-> END");
    }
}
