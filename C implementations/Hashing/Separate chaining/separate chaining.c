#include<stdio.h>
#include<stdlib.h>
#define size 10
struct Node{
    int data;
    struct Node* link;
};

struct Node *arr[size] = {NULL}, *p;

void insert(int data,int pos){
    struct Node* temp = (struct Node*)malloc(sizeof(struct Node));
    temp->data = data;
    temp->link = NULL;
    if(arr[pos]==NULL)
        arr[pos] = temp;
    else{
        p = arr[pos];
        while(p->link !=NULL){
            p=p->link;
        }
        p->link = temp;
    }
}

void display(int pos){
    if(arr[pos] == NULL)
        printf("No hash entry\n");
    else{
        p = arr[pos];
        while(p!=NULL){
            printf("%d->  ",p->data);
            p=p->link;
        }
        printf("\n");
    }
}

void main(){
    int choice;
    int data, key;
    printf("\t Menu");
    printf("\n1. Insert\n2. Display\n3. Exit");
    while(1){
    scanf("%d",&choice);
    switch(choice){
        case 1: printf("Enter the data to be inserted :");
                scanf("%d",&data);
                key = data%size;
                insert(data,key);
                break;
        case 2: for(int i=0;i<size;i++){
                    printf("Entry at position %d :",i);
                    display(i);
                }
                break;
        case 3: exit(0);

        default: printf("Invalid choice");
                break;
            }        }
}
