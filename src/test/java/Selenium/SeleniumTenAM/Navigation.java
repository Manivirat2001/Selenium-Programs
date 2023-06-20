package Selenium.SeleniumTenAM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.hdfcbank.com/");
		driver.get("https://www.amazon.in/");
		driver.get("https://www.instagram.com/");
		driver.navigate().back();
		driver.navigate().forward();

		Thread.sleep(3000);
		driver.navigate().refresh();

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String title =driver.getTitle();
		
		System.out.println(title);
		
		if(title.equals("OrangeHRM"))
		{
			System.out.println("Test case pass");
		}
		else
		{
			System.out.println("Test case failed");
		}
		
		
		String url = driver.getCurrentUrl();
		
		System.out.println("Url of website = " + url);
		
		String pageSource = driver.getPageSource();
		
		System.out.println(pageSource);
		
		
	}

}
