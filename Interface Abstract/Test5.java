
package jan30;
interface R{
    void m1();
   }

class S{
    void m2(){
        System.out.println("M2");
    }
 }

class T extends S implements R              //extends always comes before implements
{
    public void m1(){
            System.out.println("M1");
    }
}
public class Test5 {
public static void main(String[] args) {
    T t= new T();
    t.m1();
    t.m2();
    }
}
