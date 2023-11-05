package Trees;

public class BinarySearchTree {
    public BinarySearchTree(){}
    private static class Node{
        private final int value;
        Node left;
        Node right;
        int height;

        public Node(int value){
            this.value = value;
        }
        private int getValue(){
            return value;
        }
    }

    private Node root;

    public void insert(int value){
        root = insert(root,value);
    }

    private Node insert(Node node,int value){
        if(node == null){
            node = new Node(value);
            return node;
        }
        if(value < node.value){
            node.left = insert(node.left,value);
        }
        if(value > node.value){
            node.right = insert(node.right,value);
        }
        node.height = Math.max(getHeight(node.left) , getHeight(node.right))+1;
        return node;
    }
    public void populate(int[] nums){
        for (int num : nums) {
            insert(num);
        }
    }
    public void populateSorted(int[] nums){
        populateSorted(nums,0,nums.length);
    }
    private void populateSorted(int[] nums,int start,int end){
        if(start>= end){
            return;
        }
        int mid = (start + end)/2;
        this.insert(nums[mid]);
        populateSorted(nums,0,mid);
        populateSorted(nums,mid+1,end);
    }

    public void display(){
        display(root,"The Root Node is: ");
    }
    private void display(Node node,String details){
        if(node == null){
            return;
        }
        System.out.println(details + node.value);
        display(node.left,"The left child of "+node.value+" is : ");
        display(node.right,"The right child of "+node.value+" is : ");
    }
    public boolean isEmpty(){
        return root == null;
    }

    public int getHeight(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(getHeight(node.left) - getHeight(node.right)) <=1 && balanced(node.left) && balanced(node.right);
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

}

