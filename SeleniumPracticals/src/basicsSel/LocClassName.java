package basicsSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocClassName {

	public static void main(String[] args) {

		WebDriver driver;

		driver = new ChromeDriver();
		String url="https://demowebshop.tricentis.com/";

		//navigating to url
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.partialLinkText("some"));
		element.click();
	}

}
