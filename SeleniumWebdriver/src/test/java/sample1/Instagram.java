package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();  //WE WILL OPENING CROME
		
		 driver.manage().window().maximize();  // for maximize the window 
		 
		 driver.get("https://www.instagram.com/"); // for opening the particular browser
		 
		WebElement email = driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));  // we cant use String or int because sendkeys will return void"
		email.sendKeys("rayudu1018@gmail.com");
		email.clear();
		
		WebElement password = driver.findElement(By.xpath("//input[@aria-label='Password']"));  // we cant use String or int because sendkeys will return void"
		password.sendKeys("password123");
		password.clear();
		
		

	}

}