package feb23;

class MyThread extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
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
public class Test 
{
    public static void main(String[] args) throws InterruptedException
    {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        //t1.start();
        //t2.start();
        //t1.start();
        //t1.run();
        //t2.run();
        
        t1.start();
        t1.join(5000);
        t2.start();
        t3.start();
    }
}