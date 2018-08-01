package feb2;

class Out
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
    static class Inn                 //static nested class
    {
        int a = 100;
        static int b = 200;
        void m3()
        {
            System.out.println("Non static method of static nested class");
            //System.out.println("X : "+x);                     //cannot access non static variable inside static nested class
            System.out.println("Y : "+y);
            System.out.println("A : "+a);
            System.out.println("B : "+b);
        }
        static void m4()
        {
            System.out.println("Static method of static nested class");
            //System.out.println("X : "+x);                     //cannot access non static variable inside static nested class
            System.out.println("Y : "+y);
            //System.out.println("A : "+a);                     //cannot access non static variable inside static nested class
            System.out.println("B : "+b);
        }
    }
}
public class Test4 
{
    public static void main(String[] args) 
    {
        Out o = new Out();
        o.m1();
        Out.m2();
        Out.Inn i = new Out.Inn();                  //obj of nested class
        i.m3();
        Out.Inn.m4();                                   //access static method of static nested class
    }
}