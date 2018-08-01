package mar1;

public class Test2 
{
    int fun(int n)
    {
        for(int i=(n-1);i>=1;i--)
            n = n-i;
        return n;
    }
    int func(int n)
    {
        if(n == 1)
            return 1;
        else
            return n-func(n-1);
    }
    public static void main(String[] args) 
    {
        Test2 t = new Test2();
        int r = t.func(10);
        System.out.println("Result : "+r);
    }
}