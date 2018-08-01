package mar1;

import java.util.Scanner;

public class Test1 
{
    int fact(int n)
    {
        if(n == 1)
            return 1;
        else
            return n*fact(n-1);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        Test1 t = new Test1();
        int r = t.fact(n);
        System.out.println("result : "+r);
    }
}