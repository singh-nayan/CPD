package apr9;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        FileOutputStream fout = new FileOutputStream("f4.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        String str = "I love Java";
        byte b[] = str.getBytes();
        bout.write(b);                  //writes data into buffer
        bout.flush();                   //empty the buffer
        System.out.println("data saved");
        bout.close();
        fout.close();
    }
}