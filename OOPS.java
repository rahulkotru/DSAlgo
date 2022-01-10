 class Pen{//By convention, all class objects start with Capital Letter; Pen, Student, Car
    String color;
    String type;


    Pen(String color, String type){//3 types of constructors; Non-paramaterized, parameterized 
        //Non para doesnt take or return parameters
        //Parameterized takes parameters and initializes them to the class
        /*  
            p1.color="Blue";  } This part is done inside the constructor itself
            p1.type="Gel";    }
            */ 
        this.color = color;// It is important to assign these objects in the constructor
        this.type = type;
        System.out.printf("This is constructor for Pen, it is called only when the class is created\n");

    }

    public void write(){
        System.out.println("This pen is a ");//+ this.type+"\n");
    }

    public void print_color(){//By convention, all method objects start with lowercase letters; write(),print_color
        System.out.printf(this.color);
    }
 }
 class Student{
    String name;
    int age;
    public void print_info(){
        System.out.printf(this.name);
        System.out.print("\n"+this.age);
    }
}
public class OOPS{
    
    public static void main(String[] args){
        Pen p1=new Pen("Blue","Gel"); 
        p1.write();
        p1.print_color();

        Pen p2= new Pen("Black","Ballpoint");
        p2.print_color();

        Student s1= new Student();
        s1.name= "Rahul";
        s1.age= 22;
        s1.print_info();
    }

}