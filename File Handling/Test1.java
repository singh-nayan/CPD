package apr9;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        FileOutputStream fout1 = new FileOutputStream("f1.txt");
        FileOutputStream fout2 = new FileOutputStream("f2.txt");
        FileOutputStream fout3 = new FileOutputStream("f3.txt");
        
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        
        String str = "I am learning IO in Java";
        byte b[] = str.getBytes();
        
        bout.write(b);          //writes data into byte array
        
        bout.writeTo(fout1);    //writes byte array into stream
        bout.writeTo(fout2);
        bout.writeTo(fout3);
        
        System.out.println("Data Saved in all Files");
        bout.close();
    }
}