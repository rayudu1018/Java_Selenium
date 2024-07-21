package TestNg;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MainMethod extends CandEdge {

    @Test
    public void testInstagramLogin() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.instagram.com/");

        WebElement username = wait.until(ExpectedConditions
                .presenceOfElementLocated(By.xpath("//input[@aria-label='Phone number, username, or email']")));
        username.sendKeys("shivashankarvaraprasad123@gmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@aria-label='Password']"));
        password.sendKeys("Shiva@124");

        WebElement login = driver.findElement(By.xpath("//button[@class=' _acan _acap _acas _aj1- _ap30']"));
        login.click();

        String actual_title = driver.getTitle();

        if (actual_title.equals("Instagram1")) {
            System.out.println("Test is passed");
        } else {
            System.out.println("Test is failed//login details are incorrect**create New Account**");

            WebElement signup = driver.findElement(By.xpath("//span[@class='_ap3a _aaco _aacw _aad0 _aad7']"));
            signup.click();

            wait.until(ExpectedConditions.titleContains("Sign up • Instagram"));
            String signupTitle = driver.getTitle();
            System.out.println("Sign Up Page Title: " + signupTitle);

            if (signupTitle.equals("Sign up • Instagram")) {
                System.out.println("inside test is passed");

                driver.manage().window().maximize();

                WebElement signupEmail = driver.findElement(By.xpath("//input[@aria-label='Mobile Number or Email']"));
                signupEmail.sendKeys("av7480321@gmail.com");

                WebElement signupPassword = driver.findElement(By.xpath("//input[@aria-label='Password']"));
                signupPassword.sendKeys("testuser1267");

                WebElement signupFullName = driver.findElement(By.xpath("//input[@aria-label='Full Name']"));
                signupFullName.sendKeys("TestUser");

                WebElement signupUserName = driver.findElement(By.xpath("//input[@aria-label='Username']"));
                signupUserName.sendKeys("av7480321");

                WebElement newAccountCreation = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(text(), 'Sign up')]")));
                newAccountCreation.click();

                System.out.println("***************************************");

                WebElement DobMonth = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//option[@title='February']")));
                WebElement Dobdate = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//option[@title='2']")));
                WebElement Dobyear = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//option[@title='1998']")));
                DobMonth.click();
                Dobdate.click();
                Dobyear.click();

                WebElement next = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(text(), 'Next')]")));
                next.click();

            } else {
                System.out.println("inside test is failed");
            }
        }
    }
}
