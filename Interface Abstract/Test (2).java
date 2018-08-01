package jan30;

abstract class A                                    //abstract method
{
    abstract void m1();                          //abstract method
    void m2()                                       //non abstract method
    {
        System.out.println("Non abstract method");
    }
}
class B extends A
{
    void m1()                                   //implemented method (compulsory)
    {
        System.out.println("Implemented Method");
    }
    /*
    void m2()                                   //overrided method (optional)
    {
        System.out.println("Overrided Method");
    }
    */ 
}
public class Test 
{
    public static void main(String[] args) 
    {
        //A ob = new A();         //cannot creae object of abstract class
        A ref;                          //ref variable of parent class
        ref = new B();              //upcasting(copy the child class obj into parent class ref variable )
        ref.m1();
        ref.m2();
    }
}