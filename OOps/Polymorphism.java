package jan29;

class X
{
    int a = 100;
    void m1()
    {
        System.out.println("Class X");
    }
}
class Y extends X
{
    int a = 200;
    void m1()               //overrided method
    {
        System.out.println("Class Y");
    }
}
public class Test2 
{
    public static void main(String[] args) 
    {
        X ref = new Y();
        ref.m1();
        System.out.println("a : "+ref.a);           //parent class A = 100
    }
}