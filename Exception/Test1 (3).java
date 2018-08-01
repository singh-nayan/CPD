package feb2;

import java.io.IOException;

class A
{
    void m1()throws IOException, ArithmeticException
    {
        throw new ArithmeticException("Error");
        //throw new IOException("Error");
    }
    void m2()throws IOException
    {
        m1();
    }
    void m3()throws IOException
    {
        m2();
    }
}
public class Test1 
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("Hello");
        A ob = new A();
        ob.m3();
        System.out.println("Bye");
    }
}