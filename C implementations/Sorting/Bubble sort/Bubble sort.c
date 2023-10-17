#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>  

void bubblesort(int* arr,int size);
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
    bubblesort(arr,size);
    display(arr,size);
}

void display(int* arr,int size){
    for(int i=0;i<size;i++)
        printf("%d ",arr[i]);
}

void bubblesort(int* arr,int size){
    for(int i = 0;i<size;i++){
        bool flag = false;
        for(int j=0;j<size;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                flag = true;
            }
        }
        if(flag==false)
            break;
    }        
}