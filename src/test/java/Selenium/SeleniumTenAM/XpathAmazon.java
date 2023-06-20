package Selenium.SeleniumTenAM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAmazon {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.amazon.in/");

		// driver.findElement(By.xpath("/html/body/div/header/div/div/div[2]/div/form/div[2]/div/input")).
		// sendKeys("Lenovo Laptops");

		driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("Iphone");

	}

}
