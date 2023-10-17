#include<stdio.h>
#include<stdlib.h>

void ins_sort(int arr[],int length);

void main(){
    int arr[5]={3,1,41,0,3};
    ins_sort(arr,5);
    printf("Sorted array :");
    for(int i=0;i<5;i++){
        printf("%d ",arr[i]);
    }
}

void ins_sort(int arr[],int length){
    for(int i = 1;i<length;i++){
        int target = arr[i];
        int j=i-1;
        while(target<arr[j] && j>=0){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=target;
    }
}