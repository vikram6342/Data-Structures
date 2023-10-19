package Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>(5);
        stack.push(12);
        stack.push(12);
        stack.push(12);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        stack.push(13);
        stack.push(14);
        stack.push(15);
        System.out.println(stack.isFull());
        System.out.println(stack.toString());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.isEmpty());

    }

}
