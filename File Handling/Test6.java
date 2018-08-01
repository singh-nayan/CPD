package apr10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;
//reading from 3 files
public class Test2
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        FileInputStream fin1 = new FileInputStream("f1.txt");
        FileInputStream fin2 = new FileInputStream("f3.txt");
        FileInputStream fin3 = new FileInputStream("f2.txt");
        
        Vector v = new Vector();
        v.add(fin1);
        v.add(fin3);
        v.add(fin2);
        Enumeration e = v.elements();
        SequenceInputStream sis = new SequenceInputStream(e);
        
        int x;
        while((x=sis.read())!=-1)
        {
            System.out.print((char)x);
        }
        fin1.close();
        fin2.close();
        fin3.close();
    }
}