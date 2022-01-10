 class Pen{//By convention, all class objects start with Capital Letter; Pen, Student, Car
    String color;
    String type;


    public void write(){
        System.out.printf("Writing something\n");
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
        Pen p1=new Pen();
        p1.color="Blue";
        p1.type="Gel";
        p1.write();
        p1.print_color();

        Pen p2= new Pen();
        p2.color="Black";
        p2.type="Ballpoint";
        p2.print_color();

        Student s1= new Student();
        s1.name= "Rahul";
        s1.age= 22;
        s1.print_info();
    }

}