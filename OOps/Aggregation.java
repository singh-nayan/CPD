class Address
{
    int hno;
    String city;
    long pin;
    public Address(int hno, String city, long pin) 
    {
        this.hno = hno;
        this.city = city;
        this.pin = pin;
    }
    void show()
    {
        System.out.println("Address Details are : ");
        System.out.println("House No : "+hno+", "+city+"-"+pin);
    }
}
class Empl
{
    int id;
    String name, desig;
    Address addr;                       //has-a relationship
    public Empl(int id, String name, String desig) 
    {
        this.id = id;
        this.name = name;
        this.desig = desig;
    }
    public Empl(int id, String name, String desig, Address addr) 
    {
        this(id, name, desig);
        this.addr = addr;
    }
    void display()
    {
        System.out.println("\nEmp Id : "+id);
        System.out.println("Emp Name : "+name);
        System.out.println("Emp Desig : "+desig);
        if(addr != null)
            addr.show();
    }
}
public class Aggregation 
{
    public static void main(String[] args) 
    {
        Address ad = new Address(1, "Delhi", 110085);
        Empl e1 = new Empl(101, "Ram", "Clerk");
        Empl e2 = new Empl(102, "Raman", "Manager", ad);
        Empl e3 = new Empl(103, "Neha", "Typist", ad);
        e1.display();
        e2.display();
        e3.display();
    }
}