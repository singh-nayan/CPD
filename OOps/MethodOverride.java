package jan29;

class A
{
    void m1()
    {
        System.out.println("Parent class");
    }
}
class B extends A
{
    void m1()               //overrided method
    {
        System.out.println("Child Class Overrided Method");
    }
}
public class Test 
{
    public static void main(String[] args) 
    {
        B ob = new B();             //obj of child class
        ob.m1();                        //call overrided method
         A obj = new A();           //object of parent class
        obj.m1();                       //calling parent class method
       
    }
}