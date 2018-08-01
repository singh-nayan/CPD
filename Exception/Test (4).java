package feb2;
class InvaliAgeException extends Exception              //custom exception
{
    public InvaliAgeException(String message) {
        super(message);
        System.out.println(message);
    }
    
}
class ValidateAge{
    void valid(int age)throws InvaliAgeException
    {
        if(age<18){
            throw new InvaliAgeException("invalid age");
        }
        else System.out.println("welcome vote");
    }
}
public class Test {

    public static void main(String[] args) throws InvaliAgeException
    {
        ValidateAge ag=new ValidateAge();
        //try{
            ag.valid(15);
        /*}
        catch(Exception e){
            System.out.println(e);
        }*/
    }
}