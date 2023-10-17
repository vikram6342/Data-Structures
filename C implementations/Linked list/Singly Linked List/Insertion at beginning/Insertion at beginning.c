#include <stdio.h>
#include<stdlib.h>
#include <malloc.h>
struct Node
{
    int data;
    struct Node* link;
}*head;
// struct Node* head;

void insert(int x);
void display();

void main(){
    head = NULL;
    printf("Enter the no of elements needed to be stored \n");
    int n,i,x;
    scanf("%d",&n);
    for(i=0;i<n;i++){
        printf("Enter the number \n");
        scanf("%d",&x);
        insert(x);
        display();
    }
}
void insert(int x){
    struct Node* temp = (struct Node*)malloc(sizeof(struct Node));
    temp->data = x;
    temp->link =head;
    head = temp;
}
void display(){
    struct Node*temp = head;
    while(temp != NULL){
        printf("%d",temp->data);
        temp=temp->link;
    }
    printf("\n");
}