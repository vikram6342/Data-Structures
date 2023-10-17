#include<stdio.h>
#include<stdlib.h>

int pos(int* arr,int start,int end);
void quick_sort (int* arr, int start,int end);

void main(){
    int size;
    printf("Enter the size of the array : ");
    scanf("%d",&size);
    int arr[size];
    for(int i=0;i<size;i++){
        printf("Enter the %d element : ",i+1);
        scanf("%d",&arr[i]);
    }
    quick_sort(arr,0,size-1);
    for(int i=0;i<size;i++)
        printf("%d ",arr[i]);
}

void quick_sort(int* arr,int start,int end){
    if(start<end){
        int p_index = pos(arr,start,end);
        quick_sort(arr,start,p_index-1);
        quick_sort(arr,p_index+1,end);
    }
}

int pos(int* arr,int start,int end){
    int pivot = arr[end];
    int p_index = start;
    for(int i=start;i<end;i++){
        if(arr[i]<=pivot){
            int temp = arr[i];
            arr[i]=arr[p_index];
            arr[p_index] = temp;
            p_index+=1;
        }
    }
    int temp = arr[p_index];
    arr[p_index] = pivot;
    arr[end] = temp;
    return p_index;
}