class Person
{
    int id;
    String name;
    Person(int id, String name) 
    {
        this.id = id;
        this.name = name;
    }
    void show()
    {
        System.out.println("Person Id : "+id);
        System.out.println("Person Name : "+name);
    }
}
class Studnt extends Person
{
    int id;                 //same name property as in parent class
    String college;
    float marks;
    Studnt(String college, float marks, int id, String name, int sid) 
    {
        super(id, name);                //call parent constructor (should be the first statement in a constructor)
        this.id = sid;
        this.college = college;
        this.marks = marks;
    }
    void show()
    {
        System.out.println("Person Id : "+super.id);
        System.out.println("Student Id : "+id);
        super.show();                   //call parent class method
        System.out.println("College : "+college);
        System.out.println("Marks : "+marks);
    }
}
public class InheritExample 
{
    public static void main(String[] args) 
    {
        Studnt std = new Studnt("DU", 98, 101, "Ram", 111);
        std.show();
    }
}