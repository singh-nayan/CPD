package feb26;

class MyThread extends Thread
{
    public void run()
    {
        Thread t = Thread.currentThread();      //returns currently running thread ref
        String nm = t.getName();                    //returns the name of currently running thread
        if(nm.equals("ABC"))
        {
            for(int i=1;i<=10;i++)
            {
                System.out.println(nm+" : "+i);
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
        else
        {
            for(char i='A';i<='J';i++)
            {
                System.out.println(nm+" : "+i);
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
    }
}
public class Test 
{
    public static void main(String[] args) 
    {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.setName("ABC");
        //t2.setName("XYZ");
        t1.start();
        t2.start();
    }
}