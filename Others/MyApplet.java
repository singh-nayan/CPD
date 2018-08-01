package mar28;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class MyApplet extends Applet 
{
    public void paint(Graphics g)
    {
        Font f = new Font("Lucida Handwriting", Font.ITALIC, 40);
        g.setFont(f);
        g.setColor(Color.red);
        g.drawString("Hello World", 100, 200);
        g.drawLine(200, 100, 400, 400);
        g.drawRect(100, 300, 300, 100);
        g.setColor(Color.green);
        g.fillRect(100, 500, 300, 100);
        g.drawRect(400, 100, 100, 100);
        g.fillRect(600, 100, 100, 100);
        g.setColor(Color.blue);
        g.drawOval(500, 300, 100, 200);
        g.fillOval(700, 300, 200, 100);
        g.drawOval(400, 500, 100, 100);
        g.setColor(Color.cyan);
        g.fillOval(500, 500, 100, 100);
        int x[] = {900, 1000, 1100, 1100, 900};
        int y[] = {300, 100, 300, 500, 500};
        g.drawPolygon(x, y, 5);
        g.fillPolygon(x, y, 5);
    }
}