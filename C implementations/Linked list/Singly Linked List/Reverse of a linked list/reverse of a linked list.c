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
    while(temp2->link != NULL){
        temp2 = temp2->link;
    }
    temp2->link = temp1;
}

void display(){
    struct Node* temp = head;
    while(temp != NULL){
        printf(" %d",temp->data);
        temp = temp->link;
    }
    printf("\n");
}

void reverse(){
    struct Node* current = head;
    struct Node* pre =NULL;
    struct Node* next;
    while(current != NULL){
        next = current->link;
        current -> link =pre;
        pre = current;
        current = next;
    }
    head = pre;
}
void main(){
    insert(1);
    insert(2);
    insert(3);
    insert(4);
    insert(5);
    display();
    reverse();
    display();
    reverse();
    display();
}