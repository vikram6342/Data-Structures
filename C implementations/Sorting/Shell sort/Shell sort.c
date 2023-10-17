#include<stdio.h>
#include<stdlib.h>

void shell_sort(int* arr,int size);
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
    shell_sort(arr,size);
    display(arr,size);
}

void display(int* arr,int size){
    for(int i=0;i<size;i++)
        printf("%d ",arr[i]);
}

void shell_sort(int* arr,int size){
    for(int interval=size/2;interval>0;interval/=2){
        for(int i=interval; i<size;i++){
            int temp = arr[i];
            int j;
            for(j=i;j>=interval && arr[j-interval]>temp; j-=interval){
                arr[j] = arr[j-interval];
            }
            arr[j] = temp; 
        }
    }
}