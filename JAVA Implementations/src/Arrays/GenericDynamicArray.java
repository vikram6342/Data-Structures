package Arrays;

import java.util.Arrays;

public class GenericDynamicArray<T> {
    static int capacity = 10;
    static int size = 0;
    T[] dynamicArray;
    public GenericDynamicArray(){
        dynamicArray = (T[]) new Object[capacity];
    }
    public void add(T element){
        if(isFull()){
            resize();
        }
        dynamicArray[size++] = element;
    }
    public boolean isFull(){
        return size == capacity;
    }
    public void resize(){
        capacity = capacity *2;
        T[] temp = (T[])new Object[capacity];
        for(int i =0;i<size;i++){
            temp[i] = dynamicArray[i];
        }
        dynamicArray = temp;
    }
    public T get(int index){
        return dynamicArray[index];
    }
    public T remove(){
        T removedElement = dynamicArray[size()-1];
        size--;
        return removedElement;
    }
    public void set(int index,T element){
        dynamicArray[index] = element;
    }
    public int size(){
        return size;
    }

    @Override
    public String toString(){
        return "CustomArrayList{" +
                "data=" + Arrays.toString(dynamicArray) +
                ", size=" + size +
                '}';
    }
}
