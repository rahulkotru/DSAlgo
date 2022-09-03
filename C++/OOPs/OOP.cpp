/*
4 important aspects of OOPs are:
Polymorphism
Encapsulation
Inheritence
Abstraction
*/
#include <iostream>
using namespace std;
class Office{//Abstraction
    virtual void getPromoted()=0;
};
class Employee:Office{//Office(Abstraction)
private://Access modifiers(Private,Protected,Public); Property of Encapsulation
    string Company;
    int Age;
protected://For inheritence
   string Name;
public:
    Employee(){//Constructor(can be empty as well. If not defined, C++ uses default.)
        cout<<"No information provided, setting default values"<<endl;
        Name="John";
        Company="Unemployed";
        Age=18;
    }
    Employee(string name,string company,int age){//Creating contructor 1) No return type. 2) Same name as class 3) 
    Name=name;
    Company=company;
    Age=age;
    }
1234
    void giveIntro(){
        cout<<"Hi! My name is: "<<Name<<", I work at: "<<Company<<" and I am "<<Age<<" years old."<<endl;
    }
    void setName(string name){//Encapsulation
        Name=name;
    }
    string getName(){//Encapsulation
        return Name;
    }
    void setCompany(string company){//Encapsulation
        Company=company;
    }
    string getCompany(){//Encapsulation
        return Company;
    }
    void setAge(int age){//Encapsulation
        if(age>=18){
            Age=age;
        }
        cout<<"Age less than 18 is prohibited, setting default age at 18"<<endl;
        Age=18;
        
    }1
    int getAge(){//Encapsulation
        return Age;
    }
    void work(){
        cout<<Name<<" doesnt work"<<endl;
    }
    void getPromoted(){
        if(Age>=30){
            cout<<Name<<" gets Promoted by 1 level"<<endl;
        }
        else{
            cout<<Name<<" is not eligible for promotion"<<endl;
        }
    }

};
class Developer: public Employee{//Inheritence
public:
    string favProgrammingLanguage;
    Developer(string name,string company,int age,string language):Employee(name,company,age){
        favProgrammingLanguage=language;
    }
    void fixBugs(){
        cout<<Name<<" fixed bugs using "<<favProgrammingLanguage<<endl;
    }
    void work(){
        cout<<Name<<" is writing software in "<<favProgrammingLanguage<<"."<<endl;//Polymorphism
    }
    
};
class Teacher :public Employee{
    public:
    string subject;
    
    void prepareLesson(){
        cout<<Name<<" is preparing for"<<subject<<" lessons."<<endl;
    }
    Teacher(string name,string company,int age, string Subject):Employee(name,company,age){
        subject=Subject;
    }
    void work(){
        cout<<Name<<" is giving lecture on "<<subject<<"."<<endl;//Polymorphism
    }
    };
int main(){
    Employee Phil=Employee("Phil","Tata",24);
    Employee E2;
    Employee Karan;
    Karan.setName("Karan");
    Karan.setCompany("Infosys");
    Karan.setAge(17);
    Developer Jacob=Developer("Jacob","Intel",31,"C#");
    Developer Jack=Developer("Jack","Verizon",33,"C++");
    Teacher Sal=Teacher("Sal","Donbas",29," French");
    // E1.Name="Phil";
    // E1.Company="Tata";
    // E1.Age=24;
    Phil.giveIntro();
    E2.giveIntro();
    Karan.giveIntro();
    Jacob.giveIntro();
    Sal.giveIntro();
    //cout<<"Age is: "<<E1.getAge()<<endl; 
    Phil.getPromoted();
    E2.getPromoted();
    Karan.getPromoted();
    Jacob.getPromoted();
    Jack.getPromoted();
    Sal.getPromoted();
    Jacob.fixBugs();
    Jack.fixBugs();
    Sal.prepareLesson();
    Jack.work();
    Jacob.work();
    Karan.work();
    Phil.work();
    Sal.work();
    return 0;
}

