#include<stdio.h>
#include<stdlib.h>

struct Node{
    int data;
    struct Node* link;
};
 
struct Node* top = NULL;
void push(int data){
    struct Node* temp = (struct Node*)malloc(sizeof(struct Node));
    temp->data = data;
    temp->link = top;
    top = temp;
}
void pop(){
    if(top == NULL){
        printf("Stack is Empty");
        return;
    }
    struct Node* temp = top;
    top = temp->link;
    free(temp);
}
void display(struct Node* p){
    if(p==NULL){
        return;
    }
    printf(" %d",p->data);
    display(p->link);
}
void main(){
    push(1);
    push(2);
    push(3);
    pop();
    display(top);
}