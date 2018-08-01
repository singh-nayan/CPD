package jan30;

interface X1
{
    void m1();
    void m2();
}
abstract class Y1 implements X1
{
    public void m1()
    {
        System.out.println("Implemented Method from Interface");
    }
    //m2() is inherited (not implemented..so considered as abstract)
}
class Z1 extends Y1
{
    //m1() is inherited
    public void m2()
    {
        System.out.println("Implemented Method from Abstract Class");
    }
}
public class Test2 
{
    public static void main(String[] args) 
    {
        X1 ref = new Z1();
        ref.m1();
        ref.m2();
    }
}