#include<iostream>
using namespace std;
int main(){
    int a;
    cout<<"Enter a row :";
    cin>>a;
    int b;
    cout<<"Enter a column :";
    cin>>b;
    for(int i=1;i<=a;i++){
        for(int j=1;j<=b;j++){
            cout<<" 1 ";
        }
        cout<<endl;
    }
}