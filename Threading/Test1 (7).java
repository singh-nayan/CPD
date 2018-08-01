package feb26;

class MyThreadd extends Thread
{
    public void run()
    {
        Thread t = Thread.currentThread();      //returns currently running thread ref
        String nm = t.getName();                    //returns the name of currently running thread
        int prio = t.getPriority();                     //returns the priority of currently running thread
        if(prio == Thread.MIN_PRIORITY)
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
        else if(prio == 10)
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
public class Test1 
{
    public static void main(String[] args) 
    {
        MyThreadd t1 = new MyThreadd();
        MyThreadd t2 = new MyThreadd();
        t1.setName("ABC");
        //t2.setName("XYZ");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(1);
        t1.start();
        t2.start();
    }
}