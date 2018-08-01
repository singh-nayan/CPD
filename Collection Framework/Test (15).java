package mar20;

import java.util.Iterator;
import java.util.LinkedList;

public class Test 
{
    public static void main(String[] args) 
    {
        LinkedList<String> al = new LinkedList<String>();
        //LinkedList al = new LinkedList();
        al.add("ABC");
        al.add("XYZ");
        al.addLast("GHI");
        al.add("MNO");
        al.add("PQR");
        al.addFirst("JKL");
        al.add("DEF");
        
        for(String st : al)
        {
            System.out.println(st);
        }
        
        System.out.println("First Element : "+al.getFirst());
        System.out.println("Last Element : "+al.getLast());
        
        System.out.println("Deleted Element : "+al.peek());
        
        System.out.println("Traversing Iterator in ascending order");
        Iterator itr = al.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
        System.out.println("Traversing Iterator in descending order");
        Iterator it = al.descendingIterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        
        
    }
}