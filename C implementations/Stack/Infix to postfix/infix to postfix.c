#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<ctype.h>
#define MAX 25
char stack[MAX];
int top=-1;
void push(char data){
    if(top>=MAX){
        printf("Stack Overflow");
        exit(0);
    }
    stack[++top]=data;
}

char pop(){
    if(top == -1){
        printf("Stack Empty");
        exit(0);
    }
    return stack[top--];
}

int priority(char operator){
    if(operator == '^')
        return 3;
    else if (operator == '*' || operator == '/')
        return 2;
    else if(operator == '+' || operator == '-')
        return 1;
    else 
        return 0;    
}

char* postfix(char exp[]){
    char* prefix=malloc(strlen(exp)+1);
    int j=0,i=0;
    for(i=0;i<strlen(exp);i++){
        if(exp[i]=='(')
            push(exp[i]);
        else{
            if(isalnum(exp[i]))
                prefix[j++]=exp[i];
            else{
                if(exp[i]==')'){
                    while(stack[top]!='('){
                        prefix[j++]=pop();
                    }
                    pop();  
                }
                else{
                    while(priority(stack[top])>=priority(exp[i]))
                        prefix[j++]=pop();
                    push(exp[i]);
                }
            }    
        }
    }
    while(top!=-1)
      prefix[j++]=pop();
    prefix[j++]='\0';
    return prefix;
}

void main(){
    char exp[20];
    printf("%d",stack[top]);
    printf("Enter the expression :");
    scanf("%s",exp);
    char* post=postfix(exp);
    printf("The postfix expression is :");
    for(int i = 0;i<strlen(post);i++)
        printf("%c",post[i]);
}