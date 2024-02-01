package basicsSel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestGoogle {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
					
		driver.get("https://www.google.com");
		
		//closes the current opened window
		driver.close();
		
	}

}
