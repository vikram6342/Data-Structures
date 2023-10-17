#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#define MAX 100
char stack[MAX];

int top = -1;

void push(char data){
    if(top>MAX-1){
        printf("Stack Overflow!.");
        return;
    }
    stack[++top] = data;
}
void pop(){
    if(top == -1){
        printf("Stack is empty");
    }
    top--;
}

int is_balanced(char p[]){
   for(int i=0;i<strlen(p);i++){
       if(p[i]==')'){
           if(stack[top]=='(')
               pop();
            else
                return 0;   
       }
       else if(p[i]==']'){
           if(stack[top]=='[')
               pop();
            else
                return 0;   
       }
       else if(p[i]=='}'){
           if(stack[top]=='{')
               pop();
            else
                return 0;   
       }
       else
            push(p[i]);
   }
   if(top == -1)
        return 1;
    else
        return 0;
}
void main(){
    char paranthesis[]="{[]}";
    printf("%d",is_balanced(paranthesis));
}