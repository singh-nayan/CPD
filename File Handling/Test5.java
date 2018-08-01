package apr10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;
//reading from 3 files
public class Test1
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        FileInputStream fin1 = new FileInputStream("f1.txt");
        FileInputStream fin2 = new FileInputStream("f3.txt");
        FileInputStream fin3 = new FileInputStream("f2.txt");
        
        SequenceInputStream sis = new SequenceInputStream(fin2, fin1);
        SequenceInputStream sis1 = new SequenceInputStream(sis, fin3);
        int x;
        while((x=sis1.read())!=-1)
        {
            System.out.print((char)x);
        }
        fin1.close();
        fin2.close();
    }
}