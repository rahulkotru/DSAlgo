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
        
    }
    int getAge(){//Encapsulation
        return Age;
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
    // E1.Name="Phil";
    // E1.Company="Tata";
    // E1.Age=24;
    Phil.giveIntro();
    E2.giveIntro();
    Karan.giveIntro();
    Jacob.giveIntro();
    //cout<<"Age is: "<<E1.getAge()<<endl; 
    Phil.getPromoted();
    E2.getPromoted();
    Karan.getPromoted();
    Jacob.getPromoted();
    Jacob.fixBugs();
    Jack.fixBugs();
    return 0;
}
