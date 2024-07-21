package CreateNewAccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewSignUp {

  
		
	public void signUp() {	
		
		WebDriver instagram = new ChromeDriver();
		
		instagram.get("https://www.instagram.com/");
		
		
        instagram.findElement(By.xpath("//button[@class=' _acan _acap _acas _aj1- _ap30']")).click();
		
		instagram.findElement(By.xpath("//span[@class='_ap3a _aaco _aacw _aad0 _aad7']")).click();
				
	    instagram.findElement(By.xpath("//input[@aria-label='Mobile Number or Email']")).sendKeys("av7480321@gmail.com");
	    
	    instagram.findElement(By.xpath("//input[@aria-label='Full Name']")).sendKeys("Venkata");
	    
	    instagram.findElement(By.xpath("//input[@aria-label='Username']")).sendKeys("av74");
	    
	    instagram.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("Viratkohli18*");
	    
	    
	    instagram.findElement(By.xpath("//button[contains(@class, '_acan _acap _acas _aj1- _ap30') and @type='submit']")).click();
	    
	    
	}
	

}
