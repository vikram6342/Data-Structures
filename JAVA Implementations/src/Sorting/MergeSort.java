package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {10, 7, 8, 9, 1, 5};
        System.out.println(Arrays.toString(mergeSort(array)));
    }
    public static int[] mergeSort(int[] array){
        if(array.length == 1){
            return array;
        }
        int mid = array.length/2;
        //divide the array till size of array becomes 1
        int[] left = mergeSort(Arrays.copyOfRange(array,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(array,mid,array.length));

        return merge(left,right);
    }
    public static int[] merge(int[] left ,int[] right){
        int[] combined = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;

        //compare the elements from both the array left and right and add the smallest element in combined array
        //till either of the array completes
        while(i<left.length && j<right.length){
            if(left[i] < right[j]){
                combined[k++] = left[i++];
            }else{
                combined[k++] = right[j++];
            }
        }

        //add the remaining elements of left array to combined array as there is no elements remaining in right array to compare
        while (i < left.length){
            combined[k++] = left[i++];
        }
        //add the remaining elements of right array to combined array as there is no elements remaining in left array to compare
        while (j < right.length){
            combined[k++] = right[j++];
        }
        return combined;
    }
}
