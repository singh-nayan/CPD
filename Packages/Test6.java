package jan30;

//import area.Square;                 //importing single package member
import area.*;

public class Test6
{
    public static void main(String[] args) 
    {
        Square sq = new Square();
        area.Rect r = new area.Rect();                  //accessing through fully qualified name
        Circle c = new Circle();
        
        sq.calArea(5);
        //r.calArea(5, 5);                //default method cannot be accessed outside package
        //c.calArea(5.0);                   //protected method cannot be accessed outside package  
    }
}