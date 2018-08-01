package mar12;

class Outer
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
    class Inner                 //non static inner class
    {
        int a = 100;
        final static int b = 200;
        void m3()
        {
            System.out.println("Inner Class Non static Method");
            System.out.println("X : "+x);
            System.out.println("Y : "+y);
            System.out.println("A : "+a);
            System.out.println("B : "+b);
        }
        //static void m4() {  }             //static method not allowed in non static inner class
    }
}
public class Test 
{
    public static void main(String[] args) 
    {
         Outer o = new Outer();                       //obj of outer class
         Outer.Inner in = o.new Inner();            //obj of inner class
         o.m1();                           //accessing non-static method of outer class
         Outer.m2();                    //accessing static method of outer class
         in.m3();                         //accessing inner class method
    }
}