package mar17;

import java.util.ArrayList;
import java.util.Iterator;


class Student
{
    int roll;
    String name;

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
    void show()
    {
        System.out.println(roll+" : "+name);
    }
}
public class Test 
{
    public static void main(String[] args) 
    {
        ArrayList al = new ArrayList();
        //ArrayList<String> al = new ArrayList<String>();         //generic array list
        
        //insertion
        al.add(101);
        al.add("ABC");
        al.add(5);
        al.add(45.9F);
        al.add(new Student(112, "Ram"));
        al.add(new String("XYZ"));
        al.add(new Integer(111));
        al.add(new String("ABC"));
        al.add(new Student(222, "Shyam"));
        al.add(56.7);
        al.add("MNO");
        al.add(4, "JKL");
        
        //traversing (display)
        System.out.println("Traversing using For Loop");
        for(int i=0;i<al.size();i++)
            System.out.println(al.get(i));
        
        //for each loop
        System.out.println("Traversing using for each loop");
        for(Object ob : al)
        {
            if(ob instanceof Student)
            {
                Student s = (Student)ob;
                s.show();
            }
            else
                System.out.println(ob);
        }
        
        //Iterator
        System.out.println("Iterator");
        Iterator itr = al.iterator();
        while(itr.hasNext())
        {
            Object ob = itr.next();
            if(ob instanceof Student)
            {
                Student s = (Student)ob;
                s.show();
            }
            else
                System.out.println(ob);
        }
        
        //searching
        System.out.println(al.contains("ABC"));
        System.out.println(al.indexOf("ABC"));
        System.out.println(al.lastIndexOf("ABC"));
        System.out.println("ABC Deleted : "+al.remove("ABC"));
        System.out.println("Position 5 Deleted : "+al.remove(5));
        
        //Iterator
        System.out.println("Iterator");
        Iterator it = al.iterator();
        while(it.hasNext())
        {
            Object ob = it.next();
            if(ob instanceof Student)
            {
                Student s = (Student)ob;
                s.show();
            }
            else
                System.out.println(ob);
        }
    }
}