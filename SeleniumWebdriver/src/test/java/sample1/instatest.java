package sample1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class instatest {


	    public static void main(String[] args) {
	        // Setting the path to the chromedriver executable
	       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	        // Initializing the ChromeDriver
	        WebDriver driver = new ChromeDriver();
	        
	        // Maximizing the window
	        driver.manage().window().maximize();
	        
	        // Opening Instagram
	        driver.get("https://www.instagram.com/");

	        // Setting up WebDriverWait
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        
	        // Waiting for the email input field to be visible and then sending keys
	        WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
	        email.sendKeys("shivashankarvaraprasad123@gmail.com");
	        
	        // Clearing the email field
	        email.clear();
	        
	        // Waiting for the password input field to be visible and then sending keys
	        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
	        password.sendKeys("Shiva@123");
	        
	        // Clearing the password field
	       // password.clear();
	        
	        WebElement login = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
	        
	        
	        WebElement loginButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='Log in']")));

	        // Perform actions on the "Log in" button
	        loginButton.click();
	        
	        //WebElement actual_element = " ";
	        
	     
		   
		   if(email.equals("shivashankarvaraprasad123@gmail.com") && password.equals("Shiva@123") ){
			   WebElement loginButton1 = wait.until(
	                    ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@type='submit']"))); 
			   loginButton.click();
			   
			   System.out.println("test passed");
		   }else {
			   System.out.println("test passed");
		   }
		   
		   
		   WebElement notNowButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(), 'Not now')]")));
	          
		   notNowButton.click();
		   
		   WebElement NowButton = driver.findElement(By.className("_a9_1"));
		   NowButton.click(); 
		   
		   String act_title = driver.getTitle(); 
		   
		  // System.out.println(act_title);
		   
		   if (act_title.equals("Instagram")){
				
				System.out.println("Test is passed");
				
			}
			else {
				
				System.out.println("Test is failed");
				
			}
	        
	        // Closing the browser
	        //driver.quit();
	    }
	}


