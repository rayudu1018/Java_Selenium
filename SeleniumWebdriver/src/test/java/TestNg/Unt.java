package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Unt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://my.unt.edu/psp/ps/?cmd=login&languageCd=ENG&");

	}

}
