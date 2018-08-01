package feb2;

class Outer
{
    private int x = 10;
    static int y=20;
    void m1()
    {
        System.out.println("Non static method of outer class");
        System.out.println("X : "+x);
        System.out.println("Y : "+y);
    }
    static void m2()
    {
        System.out.println("Static method of outer class");
        //System.out.println("X : "+x);                 //cannot access non static inside static
        System.out.println("Y : "+y);
    }
    class Inner                 //non static inner class
    {
        int a = 100;
        final static int b = 200;       //non static inner class can contain static variables with final only
        void m3()
        {
            System.out.println("Non static method of non static inner class");
            System.out.println("X : "+x);
            System.out.println("Y : "+y);
            System.out.println("A : "+a);
            System.out.println("B : "+b);
        }
        //static void m4(){  }              //cannot use static with methods in non static inner class
    }
}
public class Test3 
{
    public static void main(String[] args) 
    {
        Outer o = new Outer();
        o.m1();                     //accessing non static
        Outer.m2();              //accessing static
        Outer.Inner i = o.new Inner();              //obj of inner class using obj of outer class
        i.m3();
    }
}