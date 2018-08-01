package feb26;

class MyThred extends Thread
{
    public void run()
    {
        Thread t = Thread.currentThread();
        boolean b = t.isDaemon();
        if(b == true)
        {
            for(int i=1;i<=10;i++)
            {
                System.out.println("Daemon : "+i);
                try
                {
                    Thread.sleep(2000);
                }
                catch(InterruptedException e)
                {
                    System.out.println(e);
                }
            }
        }
        else
        {
            for(char i='A';i<='J';i++)
            {
                System.out.println("User : "+i);
                try
                {
                    Thread.sleep(1000);
                }
                catch(InterruptedException e)
                {
                    System.out.println(e);
                }
            }
        }
    }
}
public class Test2 
{
    public static void main(String[] args) 
    {
        MyThred t1 = new MyThred();
        MyThred t2 = new MyThred();
        t1.setDaemon(true);
        t1.start();
        t2.start();
        //t1.setDaemon(true);
    }
}