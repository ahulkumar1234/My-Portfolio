#include<stdio.h>
int main(){
    int n;
    printf("Enter a Number :");
    scanf("%d",&n);
    for(int i=2;i<=n-1;i++){
        if(n%i==0){
            printf("Our number is composite");
            break;
        }
        else
            printf("our number is prime ");
            break;
    }
    return 0;
}