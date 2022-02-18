#include <iostream>
using namespace std;
class Office{
    virtual void getPromoted()=0;
};
class Employee:Office{
private://Access modifiers(Private,Protected,Public)
    string Name;
    string Company;
    int Age;
public:
    Employee(){
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
        if(age>=18){
            Age=age;
        }
        cout<<"Age less than 18 is prohibited, setting default age at 18"<<endl;
        Age=18;
        
    }
    int getAge(){
        return Age;
    }
    void getPromoted(){
        if(Age>=30){
            cout<<Name<<"gets Promoted by 1 level"<<endl;
        }
        else{
            cout<<Name<<" is not eligible for promotion"<<endl;
        }
    }

};
int main(){
    Employee E1=Employee("Phil","Tata",24);
    Employee E2;
    Employee E3;
    E3.setName("Karan");
    E3.setCompany("Infosys");
    E3.setAge(17);
    // E1.Name="Phil";
    // E1.Company="Tata";
    // E1.Age=24;
    E1.giveIntro();
    E2.giveIntro();
    E3.giveIntro();
    cout<<"Age is: "<<E1.getAge()<<endl;
    E1.getPromoted();
    E2.getPromoted();
    E3.getPromoted();
    return 0;
}
