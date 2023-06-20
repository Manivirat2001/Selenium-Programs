package Selenium.SeleniumTenAM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.facebook.com/");

		driver.findElement(By.name("email")).sendKeys("Sunflower@gmail.com");

		driver.findElement(By.id("pass")).sendKeys("1234567890");

		//driver.findElement(By.tagName("button")).click();
		
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.partialLinkText("Forgotten")).click();

	}

}
