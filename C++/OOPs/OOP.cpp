#include <iostream>
using namespace std;
class Employee{
public:
    string Name;
    string Company;
    int Age;

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
