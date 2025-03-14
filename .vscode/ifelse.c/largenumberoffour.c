#include<stdio.h>
int main(){
    int a;
    int b;
    int c;
    int d;
    printf("Enter Number a :");
    scanf("%d",&a);
    printf("Enter Number b :");
    scanf("%d",&b);
    printf("Enter Number c :");
    scanf("%d",&c);
    printf("Enter Number d :");
    scanf("%d",&d);
    if(a>b && a>c && a>d){
        printf("%d A is Greater",a);
    }
      if(b>a && b>c && b>d){
        printf("%d B is Greater",b);
    }
      if(c>b && c>a && c>d){
        printf("%d C is Greater",c);
    }
      if(d>b && d>a && d>c){
        printf("%d D is Greater",c);
    }
    return 0;
}