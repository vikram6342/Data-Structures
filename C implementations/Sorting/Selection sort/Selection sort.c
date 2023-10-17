#include<stdio.h>
#include<stdlib.h>

void selection_sort(int* arr,int size);
void display(int* arr,int size);
void main(){
    int size;
    printf("Enter the array size");
    scanf("%d",&size);
    int arr[size];
    for(int i=0;i<size;i++){
        printf("Enter the %dth data",i+1);
        scanf("%d",&arr[i]);
    }
    selection_sort(arr,size);
    display(arr,size);
}

void display(int* arr,int size){
    for(int i=0;i<size;i++)
        printf("%d ",arr[i]);
}

void selection_sort(int* arr,int size){
    for(int i=0;i<size-1;i++){
        int min_index =i;
        for(int j=min_index+1; j<size ;j++){
            if(arr[j]<arr[min_index])
                min_index = j;
        }
        int temp = arr[min_index];
        arr[min_index]=arr[i];
        arr[i] = temp;
    }
}