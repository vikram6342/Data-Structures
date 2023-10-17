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
    struct Node* temp2=head;
    for(int i=0;temp2->link!=NULL;i++){
        temp2 = temp2->link;
    }
    temp2->link = temp1;
}

void delete(int n){
    struct Node* temp1 = head;
    if(n==1){
        head = temp1->link;
        free(temp1);
        return;
    }
    for(int i = 0;i<n-2;i++){
        temp1 = temp1->link;
    }
    struct Node* temp2 = temp1->link;
    temp1->link =temp2->link;
    free(temp2);
}
void display(){
    struct Node* temp = head;
    while (temp != NULL){
        printf(" %d",temp->data);
        temp = temp->link;
    }
    printf("\n");
}


void main(){
    insert(1);
    insert(2);
    insert(3);
    insert(4);
    insert(5);
    insert(6);
    display();
    delete(4);
    display();
}
