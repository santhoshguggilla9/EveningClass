package basicsSel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessDemo {

	public static void main(String[] args) {

		HtmlUnitDriver driver = new HtmlUnitDriver();

		driver.get("https://www.google.com/");
		System.out.println("The title of page:" + driver.getTitle());


		driver.findElement(By.name("q")).sendKeys("testing");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.google.com/search?q=testing&sca_esv=598472506&source=hp&ei=uqmkZf2FAseGnesPtdqGqA8&iflsig=ANes7DEAAAAAZaS3yqc_7uwYzWDojYpFFYPdoeWpK774&ved=0ahUKEwj9ysv2vN6DAxVHQ2cHHTWtAfUQ4dUDCAo&uact=5&oq=testing&gs_lp=Egdnd3Mtd2l6Igd0ZXN0aW5nMggQABiABBixAzIIEAAYgAQYsQMyBRAAGIAEMggQABiABBixAzIFEAAYgAQyBRAAGIAEMgUQABiABDIFEAAYgAQyBRAAGIAEMgUQABiABEiID1D7BFixDXABeACQAQCYAaQCoAHeC6oBBTAuMi41uAEDyAEA-AEBqAIKwgIQEAAYAxiPARjlAhjqAhiMA8ICEBAuGAMYjwEY5QIY6gIYjAPCAgsQABiABBixAxiDAcICDhAAGIAEGIoFGLEDGIMBwgIOEC4YgAQYigUYsQMYgwHCAhEQLhiABBixAxiDARjHARjRA8ICFBAuGIAEGIoFGLEDGIMBGMcBGNEDwgIFEC4YgATCAggQLhiABBixA8ICDhAuGIAEGLEDGMcBGNEDwgILEAAYgAQYigUYsQM&sclient=gws-wiz");

		String newTitle = driver.getTitle();
		System.out.println("the new title: " +newTitle);

		System.out.println("The Current URL of page:" +driver.getCurrentUrl());


		driver.quit();

	}

}
