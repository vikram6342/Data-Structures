package Stack;

public class StackMain {
    public static void main(String[] args) throws Exception {
//        Stack<Integer> stack = new Stack<Integer>(5);
//        stack.push(12);
//        stack.push(12);
//        stack.push(12);
//        System.out.println(stack.peek());
//        System.out.println(stack.pop());
//        stack.push(13);
//        stack.push(14);
//        stack.push(15);
//        System.out.println(stack.isFull());
//        System.out.println(stack.toString());
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();
//
        CustomStack stack = new CustomStack(5);

        stack.push(34);
        stack.push(45);
        stack.push(2);
        stack.push(9);
        stack.push(18);
        //stack.push(89);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        //System.out.println(stack.pop());

    }

}
