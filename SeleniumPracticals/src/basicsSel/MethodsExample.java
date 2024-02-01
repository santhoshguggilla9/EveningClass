package basicsSel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsExample {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		String actUrl = "https://www.google.com";
		driver.get(actUrl);
		
		//get the current url of the current page
		String url = driver.getCurrentUrl();
		
		if(actUrl.equals(url))
		System.out.println("Url Verification done.");
		else
		{
			url=actUrl;
			System.out.println(url);
		}
		
		//get the title of the window
		System.out.println(driver.getTitle());
		
		//get the web page source code
//		String source = driver.getPageSource();
//		System.out.println(source);
		
		
		//closes the current opened window
		driver.close();
	}

}
