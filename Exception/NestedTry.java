
import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedTry 
{
    public static void main(String[] args)
    {
        System.out.println("hello");
        try
        {
            try
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter 2 numbers : ");
                int x = sc.nextInt();
                int y = sc.nextInt();
                int z = x/y;
            }
            catch(InputMismatchException e)
            {
                System.out.println("cannot enter characters");
            }
            catch(ArithmeticException e)
            {
                System.out.println("cannot divide by zero");
            }
            //---rest of exceptions----
            String str = null;
            str.length();
        }
        catch(NullPointerException e)
        {
            System.out.println("cannot find length of null");
        }
        catch(Exception e)
        {
            System.out.println("other exception");
        }
        System.out.println("bye");
    }
}