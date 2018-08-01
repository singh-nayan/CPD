package feb14;

public class Test2 
{
    public static void main(String[] args) 
    {
        //StringBuffer obj is mutable
        StringBuffer str = new StringBuffer("Welcome to String handling in Java");
        System.out.println(str.append("Programming"));
        System.out.println(str);
        
        System.out.println(str.deleteCharAt(15));              //Welcome to Strig handling in Java
        System.out.println(str.delete(11, 19));                 //Welcome to ndling in Java
        System.out.println(str.insert(11, "JAVA"));          //Welcome to JAVAndling in JavaProgramming
        System.out.println(str.replace(12, 14, "HELLO"));   //Welcome to JHELLOAndling in JavaProgramming
        str.setCharAt(12, 'm');                                         //return type is void
        System.out.println(str);                                        //Welcome to JmELLOAndling in JavaProgramming
        System.out.println(str.length());                           //43
        str.setLength(45);                                              //return type is void
        System.out.println(str.append("Bye"));                  //Welcome to JmELLOAndling in JavaProgramming  Bye
        
        StringBuffer st1 = new StringBuffer();
        StringBuffer st2 = new StringBuffer("Java");
        
        System.out.println("Original Capacity : "+st1.capacity());          //16
        System.out.println("Original Capacity : "+st2.capacity());          //20
        
        st1.ensureCapacity(15);
        st2.ensureCapacity(25);
        
        System.out.println("New Capacity : "+st1.capacity());          //15
        System.out.println("New Capacity : "+st2.capacity());          //42         (twice old capacity plus 2)
        
        st2.ensureCapacity(100);
        System.out.println("New Capacity : "+st2.capacity());          //100
        System.out.println();
       
    }
}