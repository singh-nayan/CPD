class A1                //parent class
{
    void m1()
    {
        System.out.println("Parent class");
    }
}
class B1 extends A1         //child class
{
    //m1() is inherited
    void m2()
    {
        m1();                   //reusing parent class property
        System.out.println("Child class");
    }
}
public class InheritanceExample 
{
    public static void main(String[] args) 
    {
        B1 ob = new B1();
        ob.m1();                //calling parent class method through child class object
        ob.m2();                //calling child class method through child class object
    }
}
