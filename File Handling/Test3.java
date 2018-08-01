package apr9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test3 
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        FileInputStream fin = new FileInputStream("f1.txt");
        int x;
        /*
        while(true)
        {
            x = fin.read();
            if(x == -1)
                break;
            System.out.print((char)x);
        }
        */
        while((x = fin.read()) != -1)
        {
            System.out.print((char)x);
        }
        fin.close();
    }
}