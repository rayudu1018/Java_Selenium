package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Captcha{
    
    public static void main(String[] args) {
        // Set the path to the tessdata directory
        File tessDataFolder = new File("tessdata");
        System.setProperty("TESSDATA_PREFIX", tessDataFolder.getAbsolutePath() + File.separator);

        WebDriver chrome = new ChromeDriver();
        chrome.get("https://www.amazon.com/?tag=amazusnavi-20&hvadid=675149237887&hvpos=&hvnetw=g&hvrand=17905362592075682672&hvpone=&hvptwo=&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9016910&hvtargid=kwd-10573980&ref=pd_sl_7j18redljs_e&hydadcr=28883_14649097&gad_source=1");

        // Identify the CAPTCHA image element
        WebElement captchaImgElement = chrome.findElement(By.xpath("//img[contains(@src, 'captcha')]")); // Adjust locator as needed
        String captchaImgSrc = captchaImgElement.getAttribute("src");

        // Download the CAPTCHA image
        try {
            BufferedImage captchaImage = ImageIO.read(new URL(captchaImgSrc));
            File outputfile = new File("captcha.png");
            ImageIO.write(captchaImage, "png", outputfile);

            // Use Tesseract to perform OCR on the downloaded image
            ITesseract tesseract = new Tesseract();
            tesseract.setDatapath(tessDataFolder.getAbsolutePath());
            String captchaText = tesseract.doOCR(outputfile);
            System.out.println("CAPTCHA Text: " + captchaText);

            // Enter the solved CAPTCHA text into the input field (adjust locator as needed)
            WebElement captchaInput = chrome.findElement(By.id("captchacharacters"));
            captchaInput.sendKeys(captchaText.trim());

            // Continue with your automation logic (example: searching for an iPhone)
            WebElement search = chrome.findElement(By.id("twotabsearchtextbox"));
            search.sendKeys("iphone");
            search.submit();
            
        } catch (IOException | TesseractException e) {
            e.printStackTrace();
        }

        chrome.quit();
    }
}
