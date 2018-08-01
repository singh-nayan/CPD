package apr10;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test3 
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        FileInputStream fin = new FileInputStream("f1.txt");
        BufferedInputStream bin = new BufferedInputStream(fin);
        int x;
        while((x=bin.read())!=-1)
            System.out.print((char)x);
        bin.close();
        fin.close();
    }
}