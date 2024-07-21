package error;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InstaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver c = new ChromeDriver();

		c.get("https://www.instagram.com/");

		/*
		 * here we cant use findElement here buz if the element is not found immediately
		 * it will through no such element found exception(NoSuchElementException.)
		 * 
		 * for this issue we use waits and ExpectedConditions.presenceOfElementLocated
		 * 
		 */
		
		// WebElement login = c.findElement(By.xpath("//input[@aria-label='Phone number,
		// username, or email']"));

		// WebDriverWait wait = new WebDriverWait(c,10);// This is deprecated and
		// removed in Selenium 4.x

		WebDriverWait wait = new WebDriverWait(c, Duration.ofSeconds(10)); // this is the correct method from selenium 4.x

		WebElement username = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//input[@aria-label='Phone number, username, or email']")));
		username.sendKeys("shivashankarvaraprasad123@gmail.com");

		WebElement password = c.findElement(By.xpath("//input[@aria-label='Password']"));

		password.sendKeys("Shiva@123");
		/*
		 * for login i have tried for both div and button tag
		 * 
		 */


		WebElement login = c.findElement(By.xpath("//button[@class=' _acan _acap _acas _aj1- _ap30']"));
		login.click();

		// WebElement act = c.findElement(By.tagName("Instagram"));

		String actual_title = c.getTitle();

		if (actual_title.equals("Instagram1")) {
			System.out.println("Test is passed");
		} else {
			System.out.println("Test is failed//login details are incorrect**create New Account**");

			WebElement signup = c.findElement(By.xpath("//span[@class='_ap3a _aaco _aacw _aad0 _aad7']"));

			signup.click();

			/*
			 * i have use wait here because page have to load completely if i take getTtile
			 * insted of (ExpectedConditions and waits) i will take the uloaded title means
			 * prious page title
			 * 
			 */

			// String SignupTitle = c.getTitle();
			
			System.out.println("***************************************");
			
			wait.until(ExpectedConditions.titleContains("Sign up • Instagram"));

			// Get the new page title after Sign Up
			String signupTitle = c.getTitle();

			System.out.println("Sign Up Page Title: " + signupTitle);

			if (signupTitle.equals("Sign up • Instagram")) {

				System.out.println("inside test is passed");
                
				c.manage().window().maximize();
				
				WebElement signupEmail = c.findElement(By.xpath("//input[@aria-label='Mobile Number or Email']"));
				signupEmail.sendKeys("av7480321@gmail.com");

				WebElement signupPassword = c.findElement(By.xpath("//input[@aria-label='Password']"));
				signupPassword.sendKeys("testuser1267");

				WebElement signupFullName = c.findElement(By.xpath("//input[@aria-label='Full Name']"));
				signupFullName.sendKeys("TestUser");

				WebElement signupUserName = c.findElement(By.xpath("//input[@aria-label='Username']"));
				signupUserName.sendKeys("av7480321");
				
				WebElement newAccountCreation = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(text(), 'Sign up')]")));
				newAccountCreation.click();
				
				//c.manage().window().minimize();
				
				System.out.println("***************************************");
				
				//html[@class='_9dls js-focus-visible _aa4c'] i need check page here
				//span[contains(text(), 'Add Your Birthday')]
				//WebElement DOB = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(), 'Add Your Birthday')]")));
				
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
