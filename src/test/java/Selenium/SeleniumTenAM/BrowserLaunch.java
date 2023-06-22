package Selenium.SeleniumTenAM;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		// WebDriverManager.edgedriver().setup();
		// EdgeDriver driver = new EdgeDriver();

		// WebDriverManager.firefoxdriver().setup();
		// FirefoxDriver driver = new FirefoxDriver();

		// SafariDriver driver = new SafariDriver();

	}

}
