#include<stdio.h>
#include<stdlib.h>

void merge(int* arr,int l_first,int l_end,int r_first,int r_end);
void merge_sort(int* arr,int first,int last){
    if(first<last){
       int middle = (first+last)/2;
       merge_sort(arr,first,middle);
       merge_sort(arr,middle+1,last);
       merge(arr,first,middle,middle+1,last);
    }
}

void merge(int* arr,int l_first,int l_end,int r_first,int r_end){
    int temp[20];
    int i=l_first,j=r_first,k=0;
    while(i<=l_end &&j<=r_end){
        if(arr[i]<arr[j])
            temp[k++] = arr[i++];
        else
            temp[k++] = arr[j++];
    }
    while(i<=l_end)
        temp[k++] = arr[i++];
    while(j<=r_end)
        temp[k++] = arr[j++];
    for(i=l_first,j=0;i<=r_end;i++,j++)
	    arr[i]=temp[j];
}

void main(){
    int arr[]={5,4,3,2,1};
    merge_sort(arr,0,4);
    for(int i=0;i<5;i++){
        printf("%d ",arr[i]);
    }
}