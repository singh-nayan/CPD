package apr12;

abstract class A
{
    abstract void m1();      //abstract method
    void m2()               //non abstract method
    {    
    }
}
class B extends A
{
    void m1() 
    {
        System.out.println("Implementing Method");
    }
    void m2()
    {
        System.out.println("Overriding Method");
    }
}
public class Test 
{
    public static void main(String[] args) 
    {
        A ob = new A()
        {
          void m1(){} 
        };
        
        A obj = new B();        //upcasting
        obj.m1();               //polymorphism
    }
}