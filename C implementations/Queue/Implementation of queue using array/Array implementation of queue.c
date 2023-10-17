#include<stdio.h>
#include<stdlib.h>

#define MAX 10
int queue[MAX];
int front=-1,rear=-1;

void enqueue(int data){
    if((rear+1)%MAX==front){
        printf("The queue is full");
        return;
    }
    else if(front ==-1 && rear == -1){
        front+=1;
        queue[++rear]=data;
    }
    
    else{
        rear = (rear+1)%MAX;
        queue[rear]=data;
    }
}

void dequeue(){
    if(front ==-1&&rear==-1){
        printf("Queue empty");
        return;
    }
    else if(front == rear){
        front = -1;
        rear = -1;
    }
    else{
        front = (front+1)%MAX;
    }
}

void display(){
    while(front!=-1){
        printf("%d ",queue[front]);
        dequeue();
    }
}
void main(){
    enqueue(1);
    enqueue(2);
    enqueue(3);
    enqueue(4);
    dequeue();
    display();
}