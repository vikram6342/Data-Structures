#include<stdio.h>
#include<stdlib.h>
#include<malloc.h>
struct Node{
    int data;
    struct Node* link;
};

struct Node* head = NULL;
void insert(int x,int pos){
    struct Node* temp1 = (struct Node*)malloc(sizeof(struct Node));
    temp1->data = x;
    temp1->link = NULL;
    if(pos == 1){
        temp1->link =head;
        head = temp1;
        return ;
    }
    struct Node* temp2=head;
    for(int i=0;i<pos-2;i++)
        temp2 = temp2->link;
    temp1->link = temp2->link;
    temp2->link = temp1;
  
}
void display(){
    struct Node* temp = head;
    while (temp != NULL){
        printf(" %d",temp->data);
        temp = temp->link;
    }
}

void main(){
    insert(2,1);
    insert(3,2);
    insert(4,2);
    insert(5,1);
    display();
}