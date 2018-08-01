package apr9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test 
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        //FileOutputStream fout = new FileOutputStream("f1.txt");           //write mode
        FileOutputStream fout = new FileOutputStream("f1.txt", true);     //append mode
        fout.write(65);
       
        String str = "Hello World";
        byte b[] = str.getBytes();
        fout.write(b);
        System.out.println("Data Saved in File");
        fout.close();
    }
}