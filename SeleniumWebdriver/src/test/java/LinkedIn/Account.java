package LinkedIn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver linkedin = new ChromeDriver();
		
		linkedin.get("https://www.linkedin.com/uas/login?session_redirect=https%3A%2F%2Fwww.linkedin.com%2Fnotifications%2F%3Ffilter%3Dall");
		linkedin.findElement(By.id("username")).sendKeys("adapasrinivasu1810@gmail.com");
		linkedin.findElement(By.id("password")).sendKeys("Viratkohli18*");
		linkedin.findElement(By.xpath("//button[@data-litms-control-urn='login-submit']")).click();
		linkedin.findElement(By.xpath("//span[@title='Jobs']")).click();
		//WebDriverWait wait = new WebDriverWai)
		linkedin.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		linkedin.findElement(By.xpath("//button[@id='ember45']")).click();
		linkedin.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//WebElement search = linkedin.findElement(By.xpath("//input[@id='jobs-search-box-keyword-id-ember69']"));
		WebElement search = linkedin.findElement(By.xpath("//input[@placeholder='Title, skill or company']"));
		search.sendKeys("Testing");
		search.sendKeys(Keys.RETURN);
		linkedin.findElement(By.xpath("//div[@class='search-reusables__filter-binary-toggle']")).click();
		
	}

}
