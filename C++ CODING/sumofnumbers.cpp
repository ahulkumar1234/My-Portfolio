#include<iostream>
using namespace std;
int main(){
    int n;
    cout<<"Enter the value :";
    cin>>n;
   int sum = 0;
for(int i =0;i<=n;i++){
    sum+=i;
}
cout<< "sum = "<< sum;
}