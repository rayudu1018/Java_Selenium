package com.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dtcc.com/");
		
		// Accept allow cookie pop up
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement cookiesPopup = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("onetrust-group-container")));
		WebElement acceptButton = driver.findElement(By.id("onetrust-accept-btn-handler"));
		acceptButton.click();
		
		
		
		WebElement productServiceElement = driver.findElement(By.xpath("//a[contains(text(),'Products & Services')]"));
		
		
		//Actions actions=new Actions(driver);

		//actions.moveToElement(productServiceElement).perform();
		
		productServiceElement.click();
		
		
	
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Products & Services')]//parent::li/ul/li")));
		
		List<WebElement> dropdownlink = driver.findElements(By.xpath("//a[contains(text(),'Products & Services')]//parent::li/ul/li"));
		
		System.out.println("Number of links in the dropdown : "+dropdownlink.size());
		
		WebElement newsANDEvents = driver.findElement(By.xpath("//a[contains(text(),'News & Events')]"));
		
		newsANDEvents.click();
		
      
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'News & Events')]//parent::li/ul/li")));
		
		List<WebElement> dropdownlink2 = driver.findElements(By.xpath("//a[contains(text(),'News & Events')]//parent::li/ul/li"));
		
		System.out.println("Number of links in the dropdown : "+dropdownlink2.size());
		
		findMenuCountBasedOnText(driver, "News & Events");
		
		//WebElement cookie
		//findMenuCountBasedOnText(driver, "Products & Services");
		//findMenuCountBasedOnText(driver, "News & Events");

	}

	public static void findMenuCountBasedOnText(WebDriver driver, String text) {
		
		

//		WebElement productServiceElement = driver.findElement(By.xpath("//a[text()='" + text + "']"));
//
//		List<WebElement> liElements = productServiceElement.findElements(By.xpath("//li"));
//
//		System.out.println(liElements.size());
		
		WebElement productServiceElement = driver.findElement(By.xpath("//a[contains(text(),'"+text+"')]//parent::li/ul"));
		
		List<WebElement> liElements = productServiceElement.findElements(By.xpath("/li"));
		
		System.out.println(liElements.size());

	}
	
	

}
