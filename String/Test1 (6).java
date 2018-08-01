package feb14;

public class Test1 
{
    public static void main(String[] args) 
    {
        String str = "Amar Prasad Sharma";
        String st[] = str.split(" ");
        for(int i=0;i<st.length;i++)
        {
            System.out.print(st[i].charAt(0)+".");
        }
        System.out.println();
        
        for(int i=0;i<st.length-1;i++)
        {
            System.out.print(st[i].charAt(0)+".");
        }
        System.out.println(st[st.length-1]);
    }
}