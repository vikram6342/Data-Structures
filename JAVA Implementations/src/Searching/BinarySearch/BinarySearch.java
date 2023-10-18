package Searching.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1,2,5,67,89,90};
        //int ans = iterativeBinarySearch(array,67);
        int ans = recursiveBinarySearch(array,91,0,array.length-1);
        if(ans == -1){
            System.out.println("Element not Found");
        }else{
            System.out.println("Element found at index:" + ans);
        }
    }
    //iterative Solution
    public static int iterativeBinarySearch(int[] array ,int target){
        int start = 0;
        int end = array.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;//to avoid overflow of int size
            if(array[mid] == target)
                return mid;
            else if(array[mid] < target)
                    start = mid+1;
            else
                end = mid -1;
        }
        return -1;
    }


    //Recursive Solution
    public static int recursiveBinarySearch(int[] array,int target,int start,int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(array[mid] == target)
                return mid;
            else if(target > array[mid]){
                return recursiveBinarySearch(array,target,mid+1,end);
            }else {
                return recursiveBinarySearch(array,target,start,mid-1);
            }
        }
        return -1;
    }
}
