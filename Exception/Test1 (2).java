import java.util.Scanner;

public class Test1 
{
    public static void main(String[] args) 
    {
        int z=0;
        System.out.println("Hello");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        try
        {
            z = x/y;
            System.exit(0);
            System.out.println("Dividing Process");
            //ArithmeticException a = new ArithmeticException("/ by zero");
            //throw a;          //implicit throw
        }
        /*
        catch(ArithmeticException e)
        {
            //exception handling code
            System.out.println("cannot divide by zero");
        }
        */
        finally
        {
            System.out.println("Finally Block");
        }
        System.out.println("Result : "+z);
        System.out.println("Bye");
    }
}