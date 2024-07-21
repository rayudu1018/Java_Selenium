package error;

import java.time.Duration;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.MimeMultipart;
import org.jsoup.Jsoup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OPT {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:/path/to/chromedriver.exe"); // Replace with the actual path

        WebDriver c = new ChromeDriver();

        c.get("https://www.instagram.com/");

        WebDriverWait wait = new WebDriverWait(c, Duration.ofSeconds(10));

        WebElement username = wait.until(ExpectedConditions
                .presenceOfElementLocated(By.xpath("//input[@aria-label='Phone number, username, or email']")));
        username.sendKeys("shivashankarvaraprasad123@gmail.com");

        WebElement password = c.findElement(By.xpath("//input[@aria-label='Password']"));
        password.sendKeys("Shiva@123");

        WebElement login = c.findElement(By.xpath("//button[@class=' _acan _acap _acas _aj1- _ap30']"));
        login.click();

        String actual_title = c.getTitle();

        if (actual_title.equals("Instagram1")) {
            System.out.println("Test is passed");
        } else {
            System.out.println("Test is failed//login details are incorrect**create New Account**");

            WebElement signup = c.findElement(By.xpath("//span[@class='_ap3a _aaco _aacw _aad0 _aad7']"));
            signup.click();

            wait.until(ExpectedConditions.titleContains("Sign up • Instagram"));

            String signupTitle = c.getTitle();
            System.out.println("Sign Up Page Title: " + signupTitle);

            if (signupTitle.equals("Sign up • Instagram")) {

                System.out.println("inside test is passed");

                c.manage().window().maximize();

                WebElement signupEmail = c.findElement(By.xpath("//input[@aria-label='Mobile Number or Email']"));
                signupEmail.sendKeys("venkataaofficial@gmail.com");

                WebElement signupPassword = c.findElement(By.xpath("//input[@aria-label='Password']"));
                signupPassword.sendKeys("testuser1234");

                WebElement signupFullName = c.findElement(By.xpath("//input[@aria-label='Full Name']"));
                signupFullName.sendKeys("TestUser");

                WebElement signupUserName = c.findElement(By.xpath("//input[@aria-label='Username']"));
                signupUserName.sendKeys("testuser4791");

                WebElement newAccountCreation = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(text(), 'Sign up')]")));
                newAccountCreation.click();

                System.out.println("***************************************");

                // Wait for the OTP input field to be present
                WebElement otpField = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@aria-label='Enter the code']")));

                // Retrieve the OTP from the email
                String otp = getOtpFromEmail("venkataaofficial@gmail.com", "Viratkohli18*");

                // Enter the OTP into the input field
                otpField.sendKeys(otp);

                WebElement nextButton = c.findElement(By.xpath("//button[contains(text(), 'Next')]"));
                nextButton.click();

                System.out.println("***************************************");

                WebElement dobMonth = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//option[@title='February']")));
                WebElement dobDate = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//option[@title='2']")));
                WebElement dobYear = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//option[@title='1998']")));
                dobMonth.click();
                dobDate.click();
                dobYear.click();

                WebElement next = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(text(), 'Next')]")));
                next.click();

            } else {
                System.out.println("inside test is failed");
            }
        }
    }

    private static String getOtpFromEmail(String email, String password) {
        String host = "imap.gmail.com";
        Properties properties = new Properties();
        properties.put("mail.store.protocol", "imaps");
        try {
            Session emailSession = Session.getDefaultInstance(properties);
            Store store = emailSession.getStore();
            store.connect(host, email, password);

            Folder inbox = store.getFolder("INBOX");
            inbox.open(Folder.READ_ONLY);

            Message[] messages = inbox.getMessages();
            for (int i = messages.length - 1; i >= 0; i--) {
                Message message = messages[i];
                if (message.getSubject().contains("Your OTP Code")) {
                    String otp = getTextFromMessage(message);
                    return otp.replaceAll("\\D", "");
                }
            }
            inbox.close(false);
            store.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String getTextFromMessage(Message message) throws Exception {
        String result = "";
        if (message.isMimeType("text/plain")) {
            result = message.getContent().toString();
        } else if (message.isMimeType("multipart/*")) {
            MimeMultipart mimeMultipart = (MimeMultipart) message.getContent();
            result = getTextFromMimeMultipart(mimeMultipart);
        }
        return result;
    }

    private static String getTextFromMimeMultipart(MimeMultipart mimeMultipart) throws Exception {
        StringBuilder result = new StringBuilder();
        int count = mimeMultipart.getCount();
        for (int i = 0; i < count; i++) {
            BodyPart bodyPart = mimeMultipart.getBodyPart(i);
            if (bodyPart.isMimeType("text/plain")) {
                result.append(bodyPart.getContent());
            } else if (bodyPart.isMimeType("text/html")) {
                String html = (String) bodyPart.getContent();
                result.append(Jsoup.parse(html).text());
            } else if (bodyPart.getContent() instanceof MimeMultipart) {
                result.append(getTextFromMimeMultipart((MimeMultipart) bodyPart.getContent()));
            }
        }
        return result.toString();
    }
}