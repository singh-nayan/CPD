package apr12;

interface X
{
    int a=100;      //static & final & public
    void m1();      //abstract & public
    void m2();      //abstract & public
}
class Y implements X
{
    public void m1() 
    {
        System.out.println("Implemented Method 1");
    }
    public void m2() 
    {
        System.out.println("Implemented Method 2");
    }
}
public class Test1 
{
    public static void main(String[] args) 
    {
        X ob = new Y();         //upcasting
        ob.m1();
        ob.m2();
        
        X obj = new X() 
        {
            @Override
            public void m1() {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public void m2() {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        };
    }
}