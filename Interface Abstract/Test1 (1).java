package jan30;

interface X
{
    int a = 100;                    //by default static, final & public
    void m1();                     // by default abstract & public
    void m2();                     // by default abstract & public
}
class Y implements X
{
    public void m1()            //implementde method
    {
        //a = a + 10;                 //cannot modify final
        System.out.println("M1 method Implemented");
        System.out.println("Final A : "+a);
    }
    public void m2()            //implemented method
    {
        System.out.println("M2 method Implemented");
    }
}
public class Test1 
{
    public static void main(String[] args) 
    {
        X ref = new Y();
        ref.m1();
        ref.m2();
    }
}