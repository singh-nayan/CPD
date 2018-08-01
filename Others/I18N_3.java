package feb28;

import java.util.Locale;
import java.util.ResourceBundle;

public class I18N_3 
{
    public static void main(String[] args) 
    {
        ResourceBundle rb = ResourceBundle.getBundle("myfile", new Locale("en", "US"));
        String nm1 = rb.getString("name1");
        String nm2 = rb.getString("name2");
        String nm3 = rb.getString("name3");
        System.out.println(nm1+" : "+nm2+" : "+nm3);
        
        ResourceBundle rb1 = ResourceBundle.getBundle("myfile", new Locale("hi", "IN"));
        String nm4 = rb1.getString("name1");
        String nm5 = rb1.getString("name2");
        String nm6 = rb1.getString("name3");
        System.out.println(nm4+" : "+nm5+" : "+nm6);
    }
}