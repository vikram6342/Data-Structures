package Stack;

import java.util.Arrays;


//it is a generic(i.e, it can be initialised with any dataTypes) stack class
public class Stack<T> {
    //Top pointer is used to keep track of the top most element push in the stack
    static int top = -1;
    static int size;
    T[] stack;

    //initialised the stack with size as parameter by constructor
    public Stack(int size){
        Stack.size = size;
        this.stack = (T[]) new Object[size];
    }

    //we can push is the element in stack if is stack is not full
    //increment the top pointer and insert the element in the top index of stack
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
    //we can pop an element from stack if is not empty(i.e, something is there to remove(pop) from the stack.
    //return the top element from the stack and decrement the top pointer
    public T pop(){
        if(!isEmpty()){
            return stack[top--];
        }else{
            System.out.println("Stack is Empty");
        }
        return null;
    }
    //peek function returns the top element in the stack
    public T peek(){
        return stack[top];
    }
    @Override
    public String toString(){
        return "Elements in Stack are :"+ Arrays.toString(stack)
                +" with size "+size;
    }

}
