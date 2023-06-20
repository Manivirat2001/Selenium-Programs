package Selenium.SeleniumTenAM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SecondDay {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		driver.manage().window().minimize();

		driver.manage().window().maximize();
		
		
		

		Thread.sleep(2000);

		driver.close();
		
		
		WebDriver driver1 = new EdgeDriver();
		driver1.get("https://www.Selenium.dev.com");
		

	}

}
