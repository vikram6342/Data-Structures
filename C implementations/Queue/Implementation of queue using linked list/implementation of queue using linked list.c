#include<stdio.h>
#include<stdlib.h>

struct Node{
    int data;
    struct Node* link;
};

struct Node* front=NULL;
struct Node* rear=NULL;

void enqueue(int data){
    struct Node* temp = (struct Node*)malloc(sizeof(struct Node));
    temp->data= data;
    temp->link= NULL;
    if(front==NULL && rear==NULL){
        front = temp;
        rear = temp;
        return;
    }
    rear->link = temp;
    rear = temp;
}

void dequeue(){
    struct Node* temp = front;
    if(front==NULL){
        printf("The queue is empty");
        return;
    }
    else if(front == rear)
        front=rear=NULL;
    else    
        front=front->link;
    free(temp);        
}
void display(struct Node* temp){
    if(temp==NULL)
        return;
    printf("%d ",temp->data);
    display(temp->link);
}
void main(){
    enqueue(1);
    enqueue(2);
    enqueue(3);
    dequeue();
    display(front);
}
