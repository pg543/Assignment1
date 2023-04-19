import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class MailSender {

    public static void main(String[] args) {

        // Sender's email credentials
        String senderEmail = "pooja.gupta@ahinfotech.in";
        String senderPassword = "password";

        // Recipient's email address
        String recipientEmail = "sumit.raj.ahi@sonymusic.com";

        // Email subject and body
        String subject = "Ignore - Mail from Eclipse";
        String body = "Hello, sending this email from Eclipse\n\nSincerely,\nYour Pooja";

        

        // Create properties for the session
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", smtpHost);
        props.put("mail.smtp.port", smtpPort);

       
    }   
}
