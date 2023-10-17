#include<stdio.h>
#include<stdlib.h>

struct Node{
    struct Node* left_link;
    int data;
    struct Node* right_link;
};

struct Node* root = NULL;

// Creating Node
struct Node* create(int data){
    struct Node* temp = (struct Node*)malloc(sizeof(struct Node));
    temp->data=data;
    temp->left_link=NULL;
    temp->right_link=NULL;
    return temp;
}

struct Node* insert(struct Node* p,int data){
    if(p==NULL)
        p=create(data);
    else if(data<=p->data){
        p->left_link=insert(p->left_link,data);
    }
    else
        p->right_link=insert(p->right_link,data);
    return p;
}

int height(struct Node* p){
    if(p==NULL)
        return -1;
    else{
        int left_length=height(p->left_link);
        int right_length=height(p->right_link);
        if(left_length>right_length)
            return left_length+1;
        else
            return right_length+1;
    }
}

void main(){
    struct Node* root =NULL;
    root=insert(root,15);
    root=insert(root,8);
    root=insert(root,20);
    root=insert(root,6);
    root=insert(root,10);
    printf("The height of the tree is : %d",height(root));
}