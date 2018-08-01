
package jan30;

interface K{
void m1();
}

interface L{
    void m2();
}

interface M extends K,L {
void m3();
}

class N implements M {
    public void m3() {
        System.out.println("M3");  
    }
    public void m1() {
        System.out.println("M1");
    }
    public void m2() {
        System.out.println("M2");
    }
}
public class test4 {

    
    public static void main(String[] args) {
        
        N n=new N();
        n.m1();
        n.m2();
        n.m3();
    }
}
