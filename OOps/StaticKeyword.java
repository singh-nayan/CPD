public class StaticKeyword 
{
    int id;
    String name;
    static String college;                  //static variable
    static                                        //static block
    {
        System.out.println("Static Block Executed");
        college = "ABC college";
    }
    void setValue(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    void show()
    {
        System.out.println("Id : "+id);
        System.out.println("Name : "+name);
        System.out.println("College : "+college);
    }
    static void display()               //static method
    {
        //System.out.println("Id : "+id);                               //static cannot access non static members
        //System.out.println("Name : "+name);
        System.out.println("Static College : "+college);
    }
    public static void main(String[] args) 
    {
        System.out.println("hello");
        StaticKeyword s1=new StaticKeyword();
        StaticKeyword s2=new StaticKeyword();
        s1.setValue(234, "nayan");
        s2.setValue(567, "ankit");
        s1.show();
        s2.show();
        StaticKeyword.display();
    }
    
}