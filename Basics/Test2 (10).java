package mar12;

public class Test2 
{
    public static void main(String[] args) 
    {
        int x = 48, y = 36;
        int z = x&y;
        int p= x|y;
        int q=~x;
        System.out.println("X & Y = "+z);
        System.out.println("X | Y = "+p);
        System.out.println("~X = "+q);
        
        int a=49, b=2;
        System.out.println("A >> B = "+(a>>b));
        System.out.println("A << B = "+(a<<b));
    }
}