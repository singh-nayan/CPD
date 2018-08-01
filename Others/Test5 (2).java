package feb12;

import java.io.Console;

public class Test5 
{
    public static void main(String[] args) 
    {
        //System class is a factory of Console class
        Console c = System.console();   //factory pattern
        System.out.println("Enter name : ");
        String str = c.readLine();
        System.out.println("Enter password : ");
        char[] pwd = c.readPassword();
        String pass = String.valueOf(pwd);  //to convert char array into string
        System.out.println("Welcome "+str);
        System.out.println("Your password is : "+pass);
    }
}