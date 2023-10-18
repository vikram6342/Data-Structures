package Sorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array ={5,4,3,2,1};
        System.out.println(Arrays.toString(array));
//        bubbleSort(array);
//        selectionSort(array);
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void selectionSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            int last = array.length - i-1;
            int maxIndex = getMaxIndex(array,0,last);
            swap(array,maxIndex,last);
        }
    }
    public static void insertionSort(int[] array){
        for(int i=0;i<array.length -1;i++){
            for(int j = i+1;j > 0;j--){
                if(array[j] < array[j-1]){
                    swap(array,j,j-1);
                }else{
                    break;
                }
            }
        }
    }
    public static void cyclicSort(int[] array){

    }
    public static void bubbleSort(int[] array){
        boolean flag;
        for(int i=0;i<array.length;i++){
            flag = false;
            for(int j=1;j<array.length - i;j++){
                if(array[j] < array[j-1]){
                   int temp = array[j-1];
                   array[j-1]=array[j];
                   array[j] = temp;
                   flag = true;
                }
            }
            if(!flag){
                break;
            }
        }
    }
    public static int getMaxIndex(int[] array,int start,int end){
       int max = 0;
       for(int i = start;i<=end;i++){
           if(array[max] < array[i]){
               max = i;
           }
       }
       return max;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
