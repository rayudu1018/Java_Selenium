package error;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.search.FlagTerm;
import java.util.Properties;

public class sample_test {
    // Other methods and imports remain unchanged

    private static String readOtpFromEmail() throws Exception {
        final String username = "av7480321@gmail.com"; // Replace with your email
        final String password = "Viratkohli18*"; // Replace with your email password

        Properties properties = new Properties();
        properties.put("mail.store.protocol", "imaps");

        Session session = Session.getDefaultInstance(properties, null);
        Store store = session.getStore("imaps");
        store.connect("imap.gmail.com", username, password); // imap.example.com should be replaced with your email provider's IMAP server

        Folder inbox = store.getFolder("INBOX");
        inbox.open(Folder.READ_ONLY);

        // Corrected usage of Flags and FlagTerm
        Message[] messages = inbox.search(new FlagTerm(new Flags(Flags.Flag.SEEN), false));
        for (int i = messages.length - 1; i >= 0; i--) {
            Message message = messages[i];
            if (message.getSubject().contains("OTP")) { // Adjust based on your OTP email subject
                Object content = message.getContent();
                if (content instanceof String) {
                    String body = (String) content;
                    // Extract OTP from the email body. This part depends on how the OTP is formatted in your email.
                    // For demonstration, let's assume the OTP is the first 6 digits of the email body.
                    String otp = body.substring(0, Math.min(body.length(), 6));
                    return otp;
                } else if (content instanceof Multipart) {
                    Multipart multipart = (Multipart) content;
                    for (int j = 0; j < multipart.getCount(); j++) {
                        BodyPart bodyPart = multipart.getBodyPart(j);
                        if (bodyPart.isMimeType("text/plain")) {
                            String body = (String) bodyPart.getContent();
                            // Extract OTP from the email body. This part depends on how the OTP is formatted in your email.
                            // For demonstration, let's assume the OTP is the first 6 digits of the email body.
                            String otp = body.substring(0, Math.min(body.length(), 6));
                            return otp;
                        }
                    }
                }
            }
        }

        return null; // Return null if OTP is not found
    }

    public static void main(String[] args) {
        try {
            String otp = readOtpFromEmail();
            System.out.println("OTP: " + otp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
