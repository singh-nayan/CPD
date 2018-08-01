package area;

public class Test 
{
    public static void main(String[] args) 
    {
        Square sq = new Square();
        Rect r = new Rect();
        Circle c = new Circle();
        
        sq.calArea(5);
        r.calArea(5, 5);
        c.calArea(5.0);
    }
}