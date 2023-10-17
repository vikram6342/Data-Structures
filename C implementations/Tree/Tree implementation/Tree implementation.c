#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>
struct Node{
    struct Node* left_link;
    int data;
    struct Node* right_link;
};
struct Node* root=NULL;
struct Node* create_node(int data){
    struct Node* temp =(struct Node*)malloc(sizeof(struct Node));
    temp->data=data;
    temp->left_link=NULL;
    temp->right_link=NULL;
    return temp;
}

struct Node* insert(struct Node* p,int data){
    if(p==NULL){
        p=create_node(data);
    }
    else if(data<=p->data){
        p->left_link=insert(p->left_link,data);
    }
    else
        p->right_link=insert(p->right_link,data);
    return p;
}

bool search(struct Node* p,int data){
    if(p == NULL)
        return false;
    else if(p->data == data)
        return true;
    else if(data>p->data)
        return search(p->right_link,data);
    else
        return search(p->left_link,data);
}
void main(){
    root=insert(root,14);
    root=insert(root,15);
    root=insert(root,2);
    root=insert(root,3);
    printf("%d",search(root,8));
}