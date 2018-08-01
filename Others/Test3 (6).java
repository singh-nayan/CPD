package feb28;

class Customer
{
    int balance = 10000;
    synchronized void deposit(int amt)
    {
        System.out.println("Going to Deposit");
        balance = balance + amt;
        System.out.println("Deposit Completed");
        System.out.println("New Balance after Deposit : "+balance);
        notify();
    }
    synchronized void withdrawl(int amt)
    {
        System.out.println("Going to withdrawl");
        if(balance < amt)
        {
            System.out.println("Insufficient Balance... Going to wait...");
            try
            {
                wait();
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
        balance = balance - amt;
        System.out.println("Withdrawl Completed");
        System.out.println("New Balance after Withdrawl : "+balance);
    }
}
public class Test3 
{
    public static void main(String[] args) 
    {
        final Customer c = new Customer();
        new Thread()
        {
            public void run()
            {
                c.withdrawl(12000);
            }
        }.start();
        new Thread()
        {
            public void run()
            {
                c.deposit(5000);
            }
        }.start();
    }
}