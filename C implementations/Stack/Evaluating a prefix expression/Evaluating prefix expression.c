#include<stdio.h>
#include<stdlib.h>
#include<string.h>

#define MAX 20
int stack[MAX];
int top = -1;
void push(int data){
    if(top>= MAX){
        printf("Stack Overflow");
        return;
    }
    stack[++top] = data;
}

int pop(){
    if(top == -1){
        printf("Stack is empty");
        exit(0);
    }
    return stack[top--];
}

int eval_prefix(char exp[]){
    int num1,num2;
    for(int i=strlen(exp)-1;i>=0;i--){
        if(exp[i]<='9' && exp[i]>='0'){
            push(exp[i]-'0');
        }
        else{
            num1 = pop();
            num2 = pop();
            switch (exp[i])
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
    char exp[]="-+*23*56";
    printf("%d",eval_prefix(exp));
}