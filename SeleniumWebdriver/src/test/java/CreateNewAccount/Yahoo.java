package CreateNewAccount;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Yahoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriver chromeDriver = new ChromeDriver();
		 
		 chromeDriver.manage().window().maximize();
		 
		 chromeDriver.get("https://www.yahoo.com/");
		 
		 chromeDriver.findElement(By.xpath("//a[@class=\"_yb_1gfbpxx _yb_1nwh4ss  _yb_gpejq1\" and contains(text(),'Finance')]")).click();
		 
		 Actions action = new Actions(chromeDriver);
		 WebElement market= chromeDriver.findElement(By.xpath("//div[@id=\"ybar-navigation\"]//span[text()='Markets']"));
		 
		 action.moveToElement(market).perform();
		 
		 chromeDriver.findElement(By.xpath("//div[text()='Top Mutual Funds']")).click();
		 
		// WebElement tr = chromeDriver.findElement(By.xpath("//tr[contains(@class,'simpTblRow')]"));
		 
		 //System.out.print(tr.getText());
		 
		 List<WebElement> tableRows = chromeDriver.findElements(By.xpath("//tr[contains(@class,'simpTblRow')]"));
//		 System.out.println(tableRows);
		 
		for( WebElement tableRow : tableRows) {
//			System.out.println(tableRow);
			List<WebElement> tableDatas = tableRow.findElements(By.xpath(".//td"));
			
			for(WebElement tableData : tableDatas) 
				System.out.print(tableData.getText()+"    ");
			System.out.println();
		}
		 

	}

}
