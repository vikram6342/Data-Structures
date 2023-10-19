package LinkedList;

public class CLL {

   private Node head;
   private Node tail;

    public CLL(Node head, Node tail) {
        this.head = null;
        this.tail = null;
    }

    public CLL() {

    }

    public void insert(int val){
        Node node=new Node(val);
        if(head==null){
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }

    public void display() {
        Node temp = head;
        if (head != null) {
            do {
                System.out.print(temp.val + "->");
                temp = temp.next;
            }
            while (temp != head);
        }
        System.out.print("END");
    }



    private class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}
