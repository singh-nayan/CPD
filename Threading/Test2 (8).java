package feb28;

class Tble
{
    static synchronized void printTable(int n)
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(n+" * "+i+" = "+(n*i));
            try
            {
                Thread.sleep(1500);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}
public class Test2 
{
    public static void main(String[] args) 
    {
        final Tble tab1 = new Tble();
        final Tble tab2 = new Tble();
        new Thread()                //annonymous inner class
        {
            public void run()
            {
                tab1.printTable(5);
            }
        }.start();
        new Thread()
        {
            public void run()
            {
                tab1.printTable(7);
            }
        }.start();
        
        new Thread()                //annonymous inner class
        {
            public void run()
            {
                tab2.printTable(4);
            }
        }.start();
        new Thread()
        {
            public void run()
            {
                tab2.printTable(9);
            }
        }.start(); 
    }
}