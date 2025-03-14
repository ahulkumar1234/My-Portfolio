#include<stdio.h>
int main(){
    int arr[6]={1,2,3,4,5,12};
    int max = -1;
    for(int i=0;i<=5;i++){
        if(max<arr[i]){
            max=arr[i];
            
        }
        
    }
    printf("%d",max);
    return 0;
}