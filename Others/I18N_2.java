package feb28;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class I18N_2 
{
    public static void main(String[] args) 
    {
        Date d = new Date();
        System.out.println("Current Date & Time : "+d);
        
        //formatting date
        DateFormat df1 = DateFormat.getDateInstance();      //formats the date as default locale
        String str1 = df1.format(d);
        System.out.println("Formatted Date according to Default Locale : "+str1);
        
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.SHORT, new Locale("hi", "IN"));
        //formats the date as 'IN' locale
        String str2 = df2.format(d);
        System.out.println("Formatted Date according to 'IN' Locale : "+str2);
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String str = sdf.format(d);
        System.out.println("Formatted Date according to 'yyyy-mm-dd' format : "+str);
        
        //formatting time
        DateFormat df3 = DateFormat.getTimeInstance();      //formats the date as default locale
        String str3 = df3.format(d);
        System.out.println("Formatted Time according to Default Locale : "+str3);
        
        DateFormat df4 = DateFormat.getTimeInstance(DateFormat.SHORT, new Locale("hi", "IN"));
        //formats the time as 'IN' locale
        String str4 = df4.format(d);
        System.out.println("Formatted Time according to 'IN' Locale : "+str4);
    }
}