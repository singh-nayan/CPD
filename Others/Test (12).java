package mar1;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Test 
{
    public static void main(String[] args) 
    {
        final String uname = "sainigarimasaini@gmail.com";
        final String password = "";
        
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "465");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        
        Session sess = Session.getInstance(props, new Authenticator() {

            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(uname, password);
            }
            
        });
        
        try
        {
            Message m = new MimeMessage(sess);
            m.setFrom(new InternetAddress(uname));
            m.setRecipients(Message.RecipientType.TO, InternetAddress.parse("samikshachugh@yahoo.co.in, nayansingh92@yahoo.in"));
            m.setSubject("Happy Holi");
            m.setText("Hello Everyone !!");
            Transport.send(m);
            System.out.println("Mail Sent");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}