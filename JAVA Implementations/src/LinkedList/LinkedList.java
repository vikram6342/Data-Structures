package LinkedList;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.size=size;
    }


    //Insert node in first of LL
     public void insertfirst(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size++;
     }
     // Insert  node in last
    public void insertlast(int val){
        if(tail==null){
            insertfirst(val);
            return;
        }
        Node node =new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }
    //Insert at specific position
    public void insert(int value,int index) {
        if (index == 0) {
            insertfirst(value);
            return;
        }
        else if (index == size) {
            insertlast(value);
            return;
        }
        else {
            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            Node node = new Node(value, temp.next);
            temp.next=node;
            size++;
        }
    }


     //Display the values in linkedlist
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+ "->" );
            temp=temp.next;
        }
        System.out.print("END");
    }

    //delete at first
    public int deletefirst(){
        int val=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }

    //Delete at last
    public int deletelast(){
        if(size<=1)  return deletefirst();
        Node secondlast=get(size-2);
        int val= tail.value;
        tail=secondlast;
        tail.next=null;
        return val;
    }

    public int delete(int index){
        if(index==0)   return deletefirst();
        if(index==size-1)  return deletelast();
        Node prev=get(index-1);
        int val =prev.next.value;
        prev.next=prev.next.next;
        return val;
    }

    //Get node at index
    public Node get(int index){
        Node node=head;
        for (int i = 0; i < index; i++) {
            node=node.next;
        }
        return node;
    }

    //Find a node which has value
    public Node find(int value){
        Node node=head;
        while(node!=null){
            if(node.value==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }

     //Implement a LL
    public class Node{
         private int value;
         private Node next;
         public Node(int value){
             this.value=value;
         }
         public Node(int value,Node next){
             this.value=value;
             this.next=next;
         }
     }


}
