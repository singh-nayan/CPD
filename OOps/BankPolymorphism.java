package jan29;

class Bank
{
    Bank(){}
    Number getRateOfInterest()          //default method
    {
        return 10;
    }
}
class SBI extends Bank
{
    //Bank(){}                                          //cannot override constructor
    Integer getRateOfInterest()             //overrided method
    {
        return 9;
    }
}
class ICICI extends Bank
{
    protected Long getRateOfInterest()             //overrided method
    {
        return 8L;
    }
}
class PNB extends Bank
{
    public Float getRateOfInterest()             //overrided method
    {
        return 7.8F;
    }
}
public class Test1 
{
    public static void main(String[] args) 
    {
        //method overriding
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        PNB pnb = new PNB();
        
        System.out.println("SBI Rate : "+sbi.getRateOfInterest());
        System.out.println("ICICI Rate : "+icici.getRateOfInterest());
        System.out.println("PNB Rate : "+pnb.getRateOfInterest());
        
        System.out.println("Run Time Polymorphism");
        Bank b;             //ref variable of parent class
        b = new SBI();                      //upcasting
        System.out.println("SBI Rate : "+b.getRateOfInterest());
        
        b = new ICICI();
        System.out.println("ICICI Rate : "+b.getRateOfInterest());
        
        b = new PNB();
        System.out.println("PNB Rate : "+b.getRateOfInterest());
    }
}