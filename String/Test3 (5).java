package feb14;

import java.util.Scanner;

public class Test3 
{
    public static void main(String[] args) 
    {
        Character ch1 = new Character('A');
        Character ch2 = new Character('a');
        
        System.out.println(ch1.charValue());            //A
        System.out.println(ch1.compareTo(ch2));     //-32
        System.out.println(ch1.equals(ch2));            //false
        System.out.println(Character.toTitleCase(ch2));           //A
        System.out.println(Character.isUpperCase(ch2));         //false
        System.out.println(ch2);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character : ");
        char ch = sc.next().charAt(0);
        if(ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U' ||ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u')
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
    }
}