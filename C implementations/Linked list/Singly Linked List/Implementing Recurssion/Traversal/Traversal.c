#include<stdio.h>
#include<stdlib.h>

struct Node{
    int data;
    struct Node* link;
};

struct Node* insert(struct Node* head,int data){
    struct Node* temp1 =(struct Node*)malloc(sizeof(struct Node));
    temp1->data = data;
    temp1->link = NULL;
    if(head == NULL){
        head = temp1;
        return head;
    }
    struct Node* temp2 = head;
    while(temp2->link != NULL){
        temp2 = temp2->link;
    }
    temp2->link =temp1;
    return head;
}

void display(struct Node* p){
    if(p ==NULL){
        printf("\n");  
        return;
    }    
    printf(" %d",p->data);
    display(p->link);
}
void rev_display(struct Node*p){
   
    if(p == NULL){
        printf("\n");   
        return;
    }    
    rev_display(p->link);
    printf(" %d",p->data); 
}
void main(){
    struct Node* head = NULL;
    head=insert(head,1);
    head=insert(head,2);
    head=insert(head,3);
    head=insert(head,4);
    head=insert(head,5);
    display(head);
    rev_display(head);
}