package feb28;

import java.util.Locale;

public class I18N_1 
{
    public static void main(String[] args) 
    {
        Locale lc = Locale.getDefault();
        System.out.println("Country Name : "+lc.getDisplayCountry());
        System.out.println("Country Code : "+lc.getCountry());
        System.out.println("Language Name : "+lc.getDisplayLanguage());
        System.out.println("Language Code : "+lc.getLanguage());
        
        Locale lc1[] = Locale.getAvailableLocales();
        for(int i=0;i<lc1.length;i++)
        {
            System.out.println(lc1[i].getDisplayCountry()+" : "+lc1[i].getCountry()
                +" : "+lc1[i].getDisplayLanguage()+" : "+lc1[i].getLanguage());
        }
    }
}