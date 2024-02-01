package basicsSel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGoogleSearch {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		String url="https://in.search.yahoo.com/";
		
		//navigating to url
		driver.get(url);
		
		//maximizes the window
		driver.manage().window().maximize();
		
		//waits till the web page loaded completely with specified time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//finding the search text box
		WebElement gSearch = driver.findElement(By.id("yschsp"));
		gSearch.sendKeys("Testing" + Keys.ENTER);
		
		//close the current window
		driver.close();
		
		//closes all the opened windows
		driver.quit();
		
		
		//finding the search button
//		WebElement gbtn = driver.findElement(By.name("btnK"));
//		gbtn.click();
		
	}

}
