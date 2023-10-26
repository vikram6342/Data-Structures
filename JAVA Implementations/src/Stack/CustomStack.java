package Stack;

public class CustomStack {
    protected int[] stack;
    private static final int DEFAULT_SIZE = 10;
    int top = -1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size){
        stack = new int[size];
    }

    public boolean push(int item) throws Exception{
        if(isFull()){
            throw new Exception("Stack OverFlow!!");
        }
        stack[++top] = item;
        return true;
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack UnderFlow");
        }
        return stack[top--];
    }
    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack UnderFlow");
        }
        return stack[top];
    }
    public boolean isFull() {
        return top == stack.length -1;
    }
    public boolean isEmpty(){
        return top == -1;
    }
}
