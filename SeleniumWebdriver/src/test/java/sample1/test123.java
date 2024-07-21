package sample1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();//WE WILL OPENING CROME
		//EdgeDriver driver1 = new EdgeDriver();
		
		driver.get("https://www.instagram.com/"); //IT WILL OPEN THE INSTAGRAM URL
		
		//driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("rrrr");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		  //driver.findElement(By.className("_ab32")).sendKeys("rr");
	      //driver.findElement(By.name("Phone number, username, or email")).sendKeys("rayudu1018@gmail.com");
		  //driver.findElement(By.name("password")).sendKeys("rayudu1018@gmail.com");
	  WebElement usernameField = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@aria-label='Phone number, username, or email']")));
      WebElement userpasswordField = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@aria-label='Password']")));
		   
		   String username = "shivashankarvaraprasad123@gmail.com";
	        String password = "Shiva@123";
		   
		  usernameField.sendKeys("shivashankarvaraprasad123@gmail.com");
		   userpasswordField.sendKeys("Shiva@123");
		   
		   if(username.equals("shivashankarvaraprasad123@gmail.com") && password.equals("Shiva@123") ){
			   WebElement loginButton = wait.until(
	                    ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@type='submit']"))); 
			   loginButton.click();
			   
			   System.out.println("test passed");
		   }else {
			   System.out.println("test failed");
		   }
		   
		   WebElement notNowButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(), 'Not now')]")));
          
		   notNowButton.click();
		   
		   WebElement NowButton = driver.findElement(By.className("_a9_1"));
		   NowButton.click(); 
		   
		   String act_title = driver.getTitle(); 
		   
		  // System.out.println(act_title);
		   
		   if (act_title.equals("Instagrami")){
				
				System.out.println("Test is passed");
				
			}
			else {
				
				System.out.println("Test is failed");
				
			}
		   
      // for serching the name in the serchbar
		   
		   WebElement svgElement = driver.findElement(By.cssSelector("svg[aria-label='Search']"));

		   svgElement.click();
		   
		   WebElement inputElement = driver.findElement(By.cssSelector("input[aria-label='Search input']"));
		   inputElement.sendKeys("rayudu1018");
		   inputElement.sendKeys(Keys.RETURN);
		   
					  

	}

}