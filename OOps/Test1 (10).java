package mar12;

class Out
{
    private int x = 10;
    static int y = 20;
    void m1()
    {
        System.out.println("Outer Class Non Static Method");
        System.out.println("X : "+x);
        System.out.println("Y : "+y);
    }
    static void m2()
    {
        System.out.println("Outer Class Static Method");
        //System.out.println("X : "+x);             //cannot access non static
        System.out.println("Y : "+y);
    }
    static class Inn            //static nested class
    {
         int a = 100;
        final static int b = 200;
        void m3()
        {
            System.out.println("Nested Class Non Static Method");
            //System.out.println("X : "+x);         //cannot access non static member of outer inside static nested class
            System.out.println("Y : "+y);
            System.out.println("A : "+a);
            System.out.println("B : "+b);
        }
        static void m4()
        {
            System.out.println("Nested Class Static Method");
            //System.out.println("X : "+x);         //cannot access non static member of outer inside static nested class
            System.out.println("Y : "+y);
            //System.out.println("A : "+a);         //cannot access non static member of inside static 
            System.out.println("B : "+b);
        }
    }
}
public class Test1 
{
    public static void main(String[] args) 
    {
        Outer o = new Outer();
        o.m1();
        Out.m2();
        Out.Inn in = new Out.Inn();
        in.m3();                       //accessing non static method of static nested class 
        Out.Inn.m4();               //accessing static method of static nested class
    }
}