class Employe
{
    int id;
    String name, addr;
    long contact;
    Employe(int id, String name) 
    {
        System.out.println("Constructor 1");
        this.id = id;
        this.name = name;
    }
    Employe(int id, String name, String addr) 
    {
        this(id, name);              //call constructor 1
        System.out.println("Constructor 2");
        this.addr = addr;
    }
    Employe(int id, String name, String addr, long contact) 
    {
        this(id, name, addr);               //call constructor 2
        System.out.println("Constructor 3");
        this.contact = contact;
    }
}
public class ConstructorChaining 
{
    public static void main(String[] args) 
    {
        Employe e = new Employe(1, "AB", "Delhi", 1234567890);          //constructor 3 called
    }
}