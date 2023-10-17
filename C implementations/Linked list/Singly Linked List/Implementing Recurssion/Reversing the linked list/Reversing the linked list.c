#include<stdio.h>
#include<stdlib.h>

struct Node{
    int data;
    struct Node* link;
}; 

struct Node* head = NULL;
void insert(int data){
    struct Node* temp1 = (struct Node*)malloc(sizeof(struct Node));
    temp1->data = data;
    temp1->link = NULL;
    if(head == NULL){
        head = temp1;
        return;
    }
    struct Node* temp2 = head;
    while(temp2->link != NULL)
        temp2 = temp2->link;
    temp2->link =temp1;    
}

void invert(struct Node* p){
    if(p->link == NULL){
        head = p;
        return;
    }
    invert(p->link);
    p->link->link=p;
    p->link = NULL;
}

void display(struct Node* p){
    if(p == NULL){
        printf("\n");
        return;
    }
    printf(" %d",p->data);
    display(p->link);    
}
void main(){
    insert(1);
    insert(2);
    insert(3);
    display(head);
    invert(head);
    display(head);
}