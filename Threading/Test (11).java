package feb28;

class Table
{
    synchronized void printTable(int n)
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
class MyThread extends Thread
{
    Table tab;
    MyThread(Table tab)
    {
        this.tab = tab;
    }
    public void run()
    {
        if(Thread.currentThread().getName().equals("A"))
            tab.printTable(5);
        else
            tab.printTable(7);
    }
}
public class Test 
{
    public static void main(String[] args) 
    {
        Table tab = new Table();
        MyThread t1 = new MyThread(tab);
        MyThread t2 = new MyThread(tab);
        t1.setName("A");
        t2.setName("B");
        t1.start();
        t2.start();
    }
}