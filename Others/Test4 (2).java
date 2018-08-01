package feb12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable
{
    int roll;
    transient String name;
    public Student(int roll, String name) 
    {
        this.roll = roll;
        this.name = name;
    }
    void show()
    {
        System.out.println(roll+" : "+name);
    }
}
public class Test4 
{
    public static void main(String[] args)throws Exception
    {
        /*
        FileOutputStream fout = new FileOutputStream("data1.txt");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        Student st = new Student(65, "Samiksha");
        out.writeObject(st);
        System.out.println("Object saved in file");
        out.close();
        fout.close();
        */
        
        FileInputStream fin = new FileInputStream("data1.txt");
        ObjectInputStream in = new ObjectInputStream(fin);
        while(true)
        {
            try
            {
                Student s = (Student)in.readObject();       //downcasting
                s.show();
            }
            catch(Exception e)
            {
                //System.out.println(e);
                break;
            }
        }
        in.close();
        fin.close();
         
    }
}