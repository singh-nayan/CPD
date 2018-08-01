package jan30;

interface G{
    void m1();
}

interface H{
    void m2();
}

class I implements G,H {
    public void m1(){
        System.out.println("M!");
    }
public void m2(){
    System.out.println("M2");
}
}
public class Test3 
{
    public static void main(String[] args) 
    {
        I i=new I();
        i.m1();
        i.m2();
    }
}