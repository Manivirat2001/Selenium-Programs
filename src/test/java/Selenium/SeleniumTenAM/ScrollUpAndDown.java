package Selenium.SeleniumTenAM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpAndDown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.amazon.in/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,6000)");

		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,-3000)");

		Thread.sleep(2000);

		WebElement footerEle = driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));

		js.executeScript("arguments[0].scrollIntoView(true)", footerEle);

	}

}
