#include<stdio.h>
#include<stdlib.h>

struct Node{
    int data;
    struct Node* next;
    struct Node* pre;
};

struct Node* head = NULL;

struct Node* createNode(int data){
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = data;
    newNode->next = NULL;
    newNode->pre = NULL;
    return newNode;
}

void ins_at_beg(int data){
    struct Node* temp = createNode(data);
    if(head == NULL){
        head = temp;
        return;
    }
    temp->next = head;
    head->pre = temp;
    head = temp;
}
void ins_at_end(int data){
    struct Node*temp1 = createNode(data);
    if(head == NULL){
        head = temp1;
        return;
    }
    struct Node* temp2 = head;
    while(temp2->next !=NULL){
        temp2 = temp2->next;
    }
    temp2->next = temp1;
    temp1->pre = temp2;
}

void display(struct Node* p){
    if(p == NULL)
        return;
    printf(" %d" ,p->data);
    display(p->next);
}

void rev_display(){
    struct Node* temp = head;
    while(temp->next != NULL){
        temp = temp->next;
    }
    while(temp != NULL){
        printf(" %d",temp->data);
        temp = temp->pre;
    }
}
void main(){
    ins_at_end(1);
    ins_at_end(2);
    ins_at_end(3);
    display(head);
}