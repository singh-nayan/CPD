package feb6;

import java.io.FileOutputStream;

public class Test 
{
    public static void main(String[] args)
    {
        try
        {
            //FileOutputStream fout = new FileOutputStream("f.txt");
            FileOutputStream fout = new FileOutputStream("f.txt", true);        //open file in append mode
            int x = 65;
            fout.write(x);
            System.out.println("Data Saved in File");
            fout.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}