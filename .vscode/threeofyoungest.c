#include<stdio.h>
int main(){
    int ram;
    int shyam;
    int ajay;
    printf("Enter age of ram :");
    scanf("%d",&ram);
    printf("Enter age of shyam :");
    scanf("%d",&shyam);
    printf("Enter age of ajay :");
    scanf("%d",&ajay);
    
    if(ram<shyam){
        printf(" ram is youngest");
    }
    else if(shyam<ram){
        printf("shyam is youngest");
    }
    else("ajay is youngest");
    return 0;
}
