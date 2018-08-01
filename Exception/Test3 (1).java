class AgeValidator
{
    void validate(int age)
    {
        if(age<18)
        {
            //ArithmeticException a = new ArithmeticException("invalid age");
            //throw a;
            
            throw new ArithmeticException("invalid age");
        }
        else
        {
            System.out.println("Welcome to vote");
        }
    }
}
public class Test3 
{
    public static void main(String[] args) 
    {
        System.out.println("Hello");
        AgeValidator ag = new AgeValidator();
        try
        {
            ag.validate(15);
        }
        catch(Exception e)
        {
            System.out.println(e);
            e.printStackTrace();
        }
        System.out.println("Bye");
    }
}