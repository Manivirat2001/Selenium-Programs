package Selenium.SeleniumTenAM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.amazon.in/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		Actions ac = new Actions(driver);

		ac.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList"))).perform();

		Thread.sleep(2000);

		WebElement yourOrders = driver.findElement(By.xpath("//*[contains(text(),'Your Order')]"));

		yourOrders.click();
	}

}
