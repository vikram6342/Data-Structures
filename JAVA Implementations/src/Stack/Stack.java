package Stack;

import java.util.Arrays;

public class Stack<T> {
    static int top = -1;
    static int size;
    T[] stack;

    public Stack(int size){
        Stack.size = size;
        this.stack = (T[]) new Object[size];
    }

    public void push(T data){
        if(!isFull()){
           stack[++top] = data;
        }else{
            System.out.println("Stack is Full");
        }
    }
    public boolean isFull(){
        return top == size-1;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public T pop(){
        if(!isEmpty()){
            return stack[top--];
        }else{
            System.out.println("Stack is Empty");
        }
        return null;
    }
    public T peek(){
        return stack[top];
    }
    @Override
    public String toString(){
        return "Elements in Stack are :"+ Arrays.toString(stack)
                +" with size "+size;
    }

}
