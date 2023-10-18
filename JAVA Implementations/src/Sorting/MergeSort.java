package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {5,4,3,2,1};
        System.out.println(Arrays.toString(mergeSort(array)));
    }
    public static int[] mergeSort(int[] array){
        if(array.length == 1){
            return array;
        }
        int mid = array.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(array,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(array,mid,array.length));

        return merge(left,right);
    }
    public static int[] merge(int[] left ,int[] right){
        int[] combined = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i<left.length && j<right.length){
            if(left[i] < right[j]){
                combined[k++] = left[i++];
            }else{
                combined[k++] = right[j++];
            }
        }
        while (i < left.length){
            combined[k++] = left[i++];
        }
        while (j < right.length){
            combined[k++] = right[j++];
        }
        return combined;
    }
}
