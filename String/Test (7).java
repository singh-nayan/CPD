package feb13;

public class Test 
{
    public static void main(String[] args) 
    {
        String str = new String("Welcome to string handling in Java");          //using new keyword
        String str1 = "Java";                   //using literal
        String str2 = "java";
        
        System.out.println(str.charAt(13));                                     //r
        
        System.out.println(str1.compareTo(str2));                           //-32
        System.out.println(str1.compareToIgnoreCase(str2));         //0
        System.out.println(str1.equals(str2));                              //false
        System.out.println(str1.equalsIgnoreCase(str2));                //true
        
        System.out.println(str.concat("Programming"));                  //Welcome to string handling in JavaProgramming
        //str = str.concat("Programming");
        System.out.println(str);                                                    //Welcome to string handling in Java
        
        System.out.println(str.endsWith("java"));                           //false
        System.out.println(str.startsWith("Wel"));                          //true
        
        System.out.println(str.indexOf("in"));                                  //14
        System.out.println(str.lastIndexOf("in"));                              //27
        System.out.println(str.indexOf("in", 15));                              //23
        
        System.out.println(str.length());                                           //34
        
        System.out.println(str.replace("in", str1));                        //Welcome to strJavag handlJavag Java Java
        System.out.println(str.replaceFirst("in", "IN"));                   //Welcome to strINg handling in Java
        
        System.out.println(str.substring(15));                              //ng handling in Java
        System.out.println(str.substring(15, 25));                          //ng handlin
        
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        
        char ch[] = str.toCharArray();
        for(int i=0;i<ch.length; i++)
        {
            System.out.print(ch[i]+" ");
        }
        System.out.println();
        
        String st[] = str.split(" ");           //split on sbasis of space
        for(int i=0;i<st.length;i++)
        {
            System.out.println(st[i]);
        }
        
        String s[] = str.split("in");           //split on sbasis of 'in'
        for(int i=0;i<s.length;i++)
        {
            System.out.println(s[i]);
        }
    }
}