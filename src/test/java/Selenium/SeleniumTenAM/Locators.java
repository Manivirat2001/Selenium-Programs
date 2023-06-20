package Selenium.SeleniumTenAM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.google.co.in/");

		WebElement googleSearch = driver.findElement(By.id("APjFqb"));
		googleSearch.sendKeys("Oranium Tech, Velacherry", Keys.ENTER);
	}

}
