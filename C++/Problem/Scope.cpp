#include<iostream>
using namespace std;

int gscope=9;
int main(){
    int num1;
    cout <<"enter Number\n";
    cin>> num1;
    cout<< num1<<"Global scope is "<<::gscope;
    return 0;
}