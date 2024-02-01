package basicsSel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagLocator {

	public static void main(String[] args) {
		
		WebDriver driver;

		driver = new ChromeDriver();
		String url="https://demowebshop.tricentis.com/";

		//navigating to url
		driver.get(url);
		driver.manage().window().maximize();
		
		List<WebElement> LinkElements = driver.findElements(By.tagName("a"));

		for(WebElement link : LinkElements)
		{
			System.out.println(link.getText());
		}
		System.out.println(LinkElements.size());
	}

}
