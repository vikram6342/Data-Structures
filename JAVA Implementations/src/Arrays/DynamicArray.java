package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class DynamicArray {
    static int capacity = 10;
    static int size = 0;
    int[] dynamicArray;
    public DynamicArray(){
        dynamicArray = new int[capacity];
    }

    public void add(int element){
        if(!isFull()){
            resize();
        }
        dynamicArray[size++] = element;
    }
    public boolean isFull(){
        return size == capacity;
    }
    public void resize(){
        int[] temp = new int[capacity*2];
        for(int i =0;i<size;i++){
            temp[i] = dynamicArray[i];
        }
        dynamicArray = temp;
    }
    public int get(int index){
        return dynamicArray[index];
    }
    public int remove(){
        int removedElement = dynamicArray[size()-1];
        size--;
        return removedElement;
    }
    public void set(int index,int element){
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
