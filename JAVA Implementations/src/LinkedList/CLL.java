package LinkedList;

public class CLL {

    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    // Node class definition
    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    // Method to insert a new node at the end of the circular linked list
    public void insert(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }
    }

    // Method to display the circular linked list
    public void display() {
        Node temp = head;
        if (head != null) {
            do {
                System.out.print(temp.val + "->");
                temp = temp.next;
            } while (temp != head);
            System.out.print("END");
        } else {
            System.out.println("Empty Circular Linked List");
        }
    }

    // Method to delete a node with given value from the circular linked list
    public void delete(int val) {
        if (head == null) {
            return;
        }

        Node current = head;
        Node previous = null;

        do {
            if (current.val == val) {
                if (previous != null) {
                    previous.next = current.next;
                    if (current == head) {
                        head = current.next;
                    }
                    if (current == tail) {
                        tail = previous;
                    }
                } else {
                    head = head.next;
                    tail.next = head;
                }
                return;
            }
            previous = current;
            current = current.next;
        } while (current != head);
    }

    // Method to check if the circular linked list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Method to clear the circular linked list
    public void clear() {
        head = null;
        tail = null;
    }
}
