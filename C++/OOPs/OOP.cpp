#include <iostream>
using namespace std;
class Employee{
private://Access modifiers(Private,Protected,Public)
    string Name;
    string Company;
    int Age;
public:
    Employee(){

    }
    Employee(string name,string company,int age){//Creating contructor 1) No return type. 2) Same name as class 3) 
    Name=name;
    Company=company;
    Age=age;

    }

    void giveIntro(){
        cout<<"Hi! My name is: "<<Name<<", I work at: "<<Company<<" and I am "<<Age<<" years old."<<endl;
    }
    void setName(string name){
        Name=name;
    }
    string getName(){
        return Name;
    }
    void setCompany(string company){
        Company=company;
    }
    string getCompany(){
        return Company;
    }
    void setAge(int age){
        Age=age;
    }
    int getAge(){
        return Age;
    }

};
int main(){
    Employee E1=Employee("Phil","Tata",24);
    Employee E2;
    Employee E3;
    E3.setName("Karan");
    E3.setCompany("Infosys");
    E3.setAge(22);
    // E1.Name="Phil";
    // E1.Company="Tata";
    // E1.Age=24;
    E1.giveIntro();
    E2.giveIntro();
    E3.giveIntro();
    cout<<E1.getAge();
    return 0;
}
