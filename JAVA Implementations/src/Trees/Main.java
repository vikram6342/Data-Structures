package Trees;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        Scanner scanner = new Scanner(System.in);
        binaryTree.populate(scanner);
        binaryTree.display();
//        BinarySearchTree binarySearchTree = new BinarySearchTree();
//        int[] nums = { 5, 2, 7, 1, 4, 6, 9, 8, 3, 10 };
//        //Arrays.sort(nums);
//        binarySearchTree.populate(nums);
//        binarySearchTree.display();
//        System.out.println(binarySearchTree.balanced());
//        binarySearchTree.preOrder();
//        binarySearchTree.inOrder();
//        binarySearchTree.postOrder();

    }
}
