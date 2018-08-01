package feb2;

import java.io.IOException;

class X
{
    void m1()
    {
    }
    void m2()throws RuntimeException
    {
    }
}
class Y extends X
{
    //void m1()throws IOException                 //cannot throws checked exception
    void m1()throws ArithmeticException
    {    
    }
    
    //void m2()throws Exception                   //cannot declare parent of RuntimeException
    //void m2()throws RuntimeException
    void m2()throws ArithmeticException
    //void m2()
    {
    }
}
public class Test2 
{
    public static void main(String[] args) 
    {
        
    }
}