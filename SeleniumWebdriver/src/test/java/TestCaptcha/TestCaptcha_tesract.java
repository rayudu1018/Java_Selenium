package TestCaptcha;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class TestCaptcha_tesract {

    public static void main(String[] args) throws IOException, InterruptedException, TesseractException {
        // Set the TESSDATA_PREFIX environment variable
        String tessDataPath = "C:\\Users\\rayud\\eclipse-workspace\\SeleniumWebdriver\\tessdata";
        System.setProperty("TESSDATA_PREFIX", tessDataPath);

        WebDriver driver = new ChromeDriver();

        
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://www.amazon.com/");

         
            WebElement image1 = driver.findElement(By.xpath("//div[@class='a-row a-text-center']/img"));

     
            File src = image1.getScreenshotAs(OutputType.FILE);
            String path = "C:\\Users\\rayud\\eclipse-workspace\\SeleniumWebdriver\\captchaimages\\captcha.png";
            FileHandler.copy(src, new File(path));

            Thread.sleep(2000);

            ITesseract image = new Tesseract();
            image.setDatapath(tessDataPath);
            String str = image.doOCR(new File(path));

            System.out.println("image OCR Done");
            System.out.println(str);

            WebElement captchaInput = driver.findElement(By.xpath("//input[@class='a-span12']"));
            captchaInput.sendKeys(str.trim());
            
             driver.findElement(By.xpath("//a[contains(text(), 'Try different image')]")).click();

       
    }
}
