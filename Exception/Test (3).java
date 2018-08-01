
import java.util.Scanner;

public class Test 
{
    public static void main(String[] args) 
    {
        System.out.println("Hello");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = x/y;
        //ArithmeticException a = new ArithmeticException("/ by zero");
        //throw a;          //implicit throw
        System.out.println("Result : "+z);
        System.out.println("Bye");
    }
}