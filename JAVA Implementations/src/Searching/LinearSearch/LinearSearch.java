package Searching.LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {1,2,5,67,89,21};
        int ans = search(array,67);
        if(ans == -1){
            System.out.println("Element not Found");
        }else{
            System.out.println("Element found at index:" + ans);
        }
    }
    public static int search(int[] array,int target){
        for(int i=0;i<array.length;i++){
            if(array[i] == target){
                return i;
            }
        }
        return -1;
    }
}
