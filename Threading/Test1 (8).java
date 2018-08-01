package feb28;

class Tablee
{
    void printTable(int n)
    {
        synchronized(this)          //synchronized block
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
        //------- non synchronized block of method ----------
    }
}
public class Test1 
{
    public static void main(String[] args) 
    {
        final Tablee tab = new Tablee();
        new Thread()                //annonymous inner class
        {
            public void run()
            {
                tab.printTable(5);
            }
        }.start();
        new Thread()
        {
            public void run()
            {
                tab.printTable(7);
            }
        }.start();
    }
}