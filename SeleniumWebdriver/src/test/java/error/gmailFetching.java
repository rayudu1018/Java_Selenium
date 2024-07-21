package error;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.MimeMultipart;
import java.io.IOException;

public class gmailFetching {
    public static void main(String[] args) {
        String host = "imap.gmail.com";
        String port = "993";
        String user = "venkataaofficial@gmail.com";
        String password = "Viratkohli18*"; 

        Properties properties = new Properties();
        properties.put("mail.imap.host", host);
        properties.put("mail.imap.port", port);
        properties.put("mail.imap.starttls.enable", "true");
        properties.put("mail.imap.ssl.trust", host);
        properties.put("mail.store.protocol", "imaps");

        Session emailSession = Session.getDefaultInstance(properties);

        try {
            Store store = emailSession.getStore("imaps");
            store.connect(host, user, password);

            Folder emailFolder = store.getFolder("INBOX");
            emailFolder.open(Folder.READ_ONLY);

            Message[] messages = emailFolder.getMessages();

            for (Message message : messages) {
                if (message.getFrom()[0].toString().equals("no-reply@mail.instagram.com") &&
                    message.getSubject().contains("Instagram code")) {
                    
                    String content = getTextFromMessage(message);
                    String otp = extractOtp(message.getSubject());
                    System.out.println("OTP: " + otp);
                }
            }

            emailFolder.close(false);
            store.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String getTextFromMessage(Message message) throws MessagingException, IOException {
        String result = "";
        if (message.isMimeType("text/plain")) {
            result = message.getContent().toString();
        } else if (message.isMimeType("multipart/*")) {
            MimeMultipart mimeMultipart = (MimeMultipart) message.getContent();
            result = getTextFromMimeMultipart(mimeMultipart);
        }
        return result;
    }

    private static String getTextFromMimeMultipart(MimeMultipart mimeMultipart) throws MessagingException, IOException {
        String result = "";
        int count = mimeMultipart.getCount();
        for (int i = 0; i < count; i++) {
            BodyPart bodyPart = mimeMultipart.getBodyPart(i);
            if (bodyPart.isMimeType("text/plain")) {
                result = result + "\n" + bodyPart.getContent();
                break; // without break, same text appears twice in my tests
            } else if (bodyPart.isMimeType("text/html")) {
                String html = (String) bodyPart.getContent();
                result = result + "\n" + org.jsoup.Jsoup.parse(html).text();
            }
        }
        return result;
    }

    private static String extractOtp(String subject) {
        // Extract the 6-digit OTP from the subject
        String otp = subject.replaceAll("[^0-9]", "");
        if (otp.length() == 6) {
            return otp;
        }
        return "No OTP found";
    }
}
