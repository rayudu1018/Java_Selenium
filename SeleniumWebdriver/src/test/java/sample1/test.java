package sample1;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test {

    public static void main(String[] args) {

        // Set the path to the ChromeDriver executable if not set in system PATH
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the Walmart homepage
            driver.get("https://www.walmart.com/");
            
            // Verify the title of the page
            String act_title = driver.getTitle(); 
            if (act_title.equals("Walmart | Save Money. Live Better.")) {
                System.out.println("Test is passed");
            } else {
                System.out.println("Test is failed");
            }

            // Maximize the browser window
            driver.manage().window().maximize();

            // Create an instance of WebDriverWait with a timeout of 10 seconds
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Locate the search box using an appropriate locator
            WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));

            // Enter the text "mobiles" into the search box and press Enter
            searchBox.sendKeys("mobiles");
            searchBox.sendKeys(Keys.RETURN);

            // Wait for the search results to load and be visible
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".search-result-gridview-items")));

            // Additional logic to verify the search results can be added here
            List<WebElement> searchResults = driver.findElements(By.cssSelector(".search-result-gridview-items .search-result-product-title"));
            if (searchResults.size() > 0) {
                System.out.println("Search results are displayed.");
            } else {
                System.out.println("No search results found.");
            }

        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
