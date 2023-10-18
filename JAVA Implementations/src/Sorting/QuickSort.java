package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {5,4,3,2,1};
        System.out.println(Arrays.toString(array));
        quickSort(array,0, array.length-1);
        System.out.println(Arrays.toString(array));
    }
    public static void quickSort(int[] array,int low,int high){
        if(low>=high){
            return;
        }
        int start = low;
        int end = high ;
        int mid = start + (end-start)/2;
        int pivot = array[mid];

        while (start<=end){
            while (array[start] < pivot){
                start++;
            }
            while (array[end] > pivot){
                end--;
            }
            while (start<=end){
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;
                start++;
                end--;
            }
        }
        quickSort(array,low,end);
        quickSort(array,start,high);
    }

}
