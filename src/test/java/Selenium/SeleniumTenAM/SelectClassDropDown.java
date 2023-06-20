package Selenium.SeleniumTenAM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassDropDown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.facebook.com/");

		driver.findElement(By.cssSelector("a[role='button'][data-testid='open-registration-form-button']")).click();

		Thread.sleep(3000);

		WebElement day = driver.findElement(By.id("day"));

		Select s1 = new Select(day);
		s1.selectByIndex(7);

		Select s2 = new Select(driver.findElement(By.id("month")));
		s2.selectByValue("12");

		Select s3 = new Select(driver.findElement(By.id("year")));
		s3.selectByVisibleText("2000");

	}

}
