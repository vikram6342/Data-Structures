#include<stdlib.h>
#include<stdio.h>

struct Node{
    struct Node* left_link;
    int data;
    struct Node* right_link;
};

struct Node* create_node(int data){
    struct Node* temp = (struct Node*)malloc(sizeof(struct Node));
    temp->data = data;
    temp->left_link = NULL;
    temp->right_link = NULL;
    return temp;
}

struct Node* insert(struct Node* root,int data){
    if(root == NULL){
        root=create_node(data);
    }
    else if(data<=root->data){
        root->left_link = insert(root->left_link,data);
    }
    else 
        root->right_link = insert(root->right_link,data);
    return root;
}

void preorder(struct Node* root){
    if(root == NULL)
        return;
    printf("%d ",root->data);
    preorder(root->left_link);
    preorder(root->right_link);
}
void inorder(struct Node* root){
    if(root == NULL)
        return;
    inorder(root->left_link);
    printf("%d ",root->data);
    inorder(root->right_link);
}

void postorder(struct Node* root){
    if(root == NULL)
        return;
    postorder(root->left_link);
    postorder(root->right_link);
    printf("%d ",root->data);
}
void main(){
    struct Node* root = NULL;
    root = insert(root,20);
    root = insert(root,15);
    root = insert(root,17);
    root = insert(root,26);
    root = insert(root,24);
    root = insert(root,40);
    root = insert(root,6);
    root = insert(root,3);
    printf("\n");
    preorder(root);
    printf("\n");
    inorder(root);
    printf("\n");
    postorder(root);
}