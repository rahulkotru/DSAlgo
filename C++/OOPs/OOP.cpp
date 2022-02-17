#include <iostream>
using namespace std;
class Employee{
public://Access modifiers(Private,Protected,Public)
    string Name;
    string Company;
    int Age;

    Employee(string name,string company,int age){//Creating contructor 1) No return type. 2) Same name as class 3) 
    Name=name;
    Company=company;
    Age=age;

    }

    void giveIntro(){
        cout<<"Hi! My name is: "<<Name<<", I work at: "<<Company<<" and I am "<<Age<<" years old."<<endl;
    }
};
int main(){
    Employee E1;
    E1.Name="Phil";
    E1.Company="Tata";
    E1.Age=24;
    E1.giveIntro();
    return 0;
}
