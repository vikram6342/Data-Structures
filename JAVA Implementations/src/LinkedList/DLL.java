package LinkedList;

public class DLL{

     private Node head;
     private Node tail;
     //Insert a node in first
     public void insertfirst(int val){
         Node node=new Node(val);
         node.next=head;
         node.prev=null;
         if(head!=null)   head.prev=node;
         head=node;
     }

     //Diaplay a linkedlist
    public void display(){
         Node temp=head;
         tail=null;
         while(temp!=null){
             System.out.print(temp.val+ "->");
             tail=temp;
             temp=temp.next;
         }
        System.out.print("END");

         //REVERSE
        System.out.println();
        System.out.println("Reverse : ");
        while(tail!=null){
            System.out.print(tail.val+"->");
            tail=tail.prev;
        }
        System.out.print("Start");

    }
// Insert at last
    public void insertlast(int val){
         Node node=new Node(val);
         tail=head;

         if(head==null){
             node.prev=null;
             head=node;
         }
         while(tail.next!=null){
             tail=tail.next;
         }


         node.prev=tail;
         tail.next=node;
         tail=node;
         tail.next=null;
    }
// insert at after
public Node find(int value){
    Node node=head;
    while(node!=null){
        if(node.val==value){
            return node;
        }
        node=node.next;
    }
    return null;
}
public void insert(int after,int val){
         Node p=find(after);
         Node node=new Node(val);
         node.next=p.next;
         node.prev=p;
         p.next=node;
        if(node.next!=null) node.next.prev=node;
}


     //Implement a doubly linked List
    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
