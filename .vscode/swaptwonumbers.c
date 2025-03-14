#include<stdio.h>
int main(){
    int a;
    int b;
    printf("Enter a Number a : ");
    scanf("%d",&a);
    printf("Enter a Number b : ");
    scanf("%d",&b);
    a=a+b;
    b=a-b;
    a=a-b;
    printf("The number a is %d ",a);
     printf("The number b is %d ",b);
    return 0;
}