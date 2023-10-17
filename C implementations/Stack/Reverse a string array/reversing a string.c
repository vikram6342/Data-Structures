#include<stdio.h>
#include<stdlib.h>
#include<string.h>

#define MAX 100

char stack[MAX];
int top = -1;

void push(char str[]){
    if(strlen(str)>top){
        printf("Stack overflow");
        return;
    }
    for(int i = 0; i<strlen(str);i++){
        stack[++top]=str[i];
    }
}

char pop(){
    char popped = stack[top--];
    return popped;
}

void main(){
    char str[]= "Ranjana";
    push(str);
    // Reversing the string
    for(int i =0;i<strlen(str);i++)
        str[i]= pop();
    //Printing the string
    for(int i=0;i<strlen(str);i++)
        printf("%c",str[i]);
}