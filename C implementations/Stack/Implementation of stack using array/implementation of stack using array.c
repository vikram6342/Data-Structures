#include<stdio.h>
#include<stdlib.h>
#define MAX 10

int stack[MAX];
int top = -1;
void push(int data){
    if(top > MAX-1){
        printf("Stack overflow");
        return;
    }
    stack[++top] = data;
}
void pop(){
    if(top == -1){
        printf("Stack is Empty");
        return;
    }
    printf("%d",stack[top]);
    top--;
}
void display(){
    for(int i=0;i<=top;i++){
        printf(" %d",stack[i]);
    }
}
void main(){
    push(1);
    push(2);
    push(3);
    display();
}