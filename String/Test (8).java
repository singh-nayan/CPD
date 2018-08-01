package feb14;

public class Test 
{
    public static void main(String[] args) 
    {
        String str="Amit Prasad Sharma";
        char ch[]=str.toCharArray();
        System.out.print(ch[0]+".");
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]==' ')
                System.out.print(ch[i+1]+".");
        }
    }
}