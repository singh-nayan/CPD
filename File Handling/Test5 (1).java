package feb6;

import java.io.FileWriter;

public class Test5 
{
    public static void main(String[] args) throws Exception
    {
        FileWriter fw = new FileWriter("f5.txt");
        String str = "Tata Bye Bye";
        fw.write(str);                          //writing string directly onto stream
        fw.flush();
        System.out.println("Data saved in file");
        fw.close();
    }
}