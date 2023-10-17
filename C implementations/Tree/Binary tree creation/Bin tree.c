#include<stdio.h>
#include<stdlib.h>

struct Node{
    struct Node* left_link;
    int data;
    struct Node* right_link;
};

struct Node* create_node(int data){
    struct Node* temp = (struct Node*)malloc(sizeof(struct Node));
    temp->left_link = NULL;
    temp->data = data;
    temp->right_link = NULL; 
    return temp;
}

struct Node* insert(struct Node* p,int data){
    int temp;
    if(p == NULL){
        p = create_node(data);
        return p;
    }
    printf("Enter the data for subtrees (-1 for no data)");
    scanf("%d",&temp);
    if(temp==-1)
        return NULL;
    printf("Enter the data for left child");
    scanf("%d",&temp);
    p->left_link = insert(p->left_link,temp);
    printf("Enter the data for right child");
    scanf("%d",&temp);
    p->right_link = insert(p->right_link,temp);
}
void inorder(struct Node* root){
    if(root == NULL)
        return;
    inorder(root->left_link);
    printf("%d",root->data);
    inorder(root->right_link);
}

void main(){
    int data;
    struct Node* root = NULL;
    printf("Enter the data to be inserted");
    scanf("%d",&data);
    root = insert(root,data);
    root = insert(root,data);
    inorder(root);
}