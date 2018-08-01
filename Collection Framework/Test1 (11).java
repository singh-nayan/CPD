package mar20;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Test1 
{
    public static void main(String[] args) 
    {
        Vector al = new Vector();
        
        al.add("ABC");
        al.add("XYZ");
        al.add("MNO");
        al.add("PQR");
        al.add("DEF");
        
        for(Object ob : al)
        {
            System.out.println(ob);
        }
        
        System.out.println("Traverse using Enumeration");
        Enumeration e = al.elements();
        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }
        
        System.out.println("Traverse using Iterator");
        Iterator itr = al.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}