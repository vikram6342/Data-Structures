package Trees;

import java.util.Scanner;

public class BinaryTree {
    public BinaryTree(){}
    private static class Node{
        private final int  value;
        private Node left;
        private Node right;
        public Node(int value){
            this.value  = value;
        }
    }
    private Node root = null;
    public void populate(Scanner scanner){
        System.out.println("Enter the value for root Node");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner,root);
    }
    public void populate(Scanner scanner,Node node){
        System.out.println("Do you want to enter left of " + node.value);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value of the left of " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner,node.left);

        }
        System.out.println("Do you want to enter right of " + node.value);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value of the right of " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner,node.right);
        }
    }
    public void preOrder(){
        preOrder(root);
        System.out.println("END");
    }
    private void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.value+"->");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(){
        inOrder(root);
        System.out.println("END");
    }
    private void inOrder(Node node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.value+"->");
        inOrder(node.right);
    }
    public void postOrder(){
        postOrder(root);
        System.out.println("END");
    }
    private void postOrder(Node node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value+"->");

    }

    public void display() {
        display(root, 0);
    }

    private void display(Node node, int level) {
        if (node == null) {
            return;
        }
        display(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->" + node.value);
        } else {
            System.out.println(node.value);
        }
        display(node.left, level + 1);
    }

}
