#include<stdio.h>
#include<stdlib.h>
#include<string.h>

#define MAX 50
int stack[MAX];
int top = -1;

void push(int data){
    if(top>=MAX){
        printf("Stack Overflow");
        return;
    }
    stack[++top] = data;
}

int pop(){
    if(top == -1){
        printf("Stack Empty");
        exit(0);
    }
    return stack[top--];
}

int evaluation(char temp[]){
    int num1,num2;
    for(int i=0; i<strlen(temp);i++){
        if(temp[i]<='9' && temp[i]>='0'){
            push(temp[i]-'0');
        }
        else{
            num2 = pop();
            num1 = pop();
            switch (temp[i])
            {
            case '+':
                push(num1+num2);
                break;
            case '-':
                push(num1-num2);
                break;
            case '*':
                push(num1*num2);
                break;
            case '/':
                push(num1/num2);
                break;
            default:
                break;
            }
        }    
    }
    return stack[top];
}

void main(){
    char expression[]="23*45*+6-";
    printf("%d",evaluation(expression));
}