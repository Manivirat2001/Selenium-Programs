package Selenium.SeleniumTenAM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://demo.automationtesting.in/Frames.html");

		driver.switchTo().frame("singleframe");

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Good Morning ");

		driver.switchTo().parentFrame();

		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();

		WebElement outerFrame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));

		driver.switchTo().frame(outerFrame);

		driver.switchTo().frame(
				driver.findElement(By.xpath("//iframe[contains(@style,'float: left;height: 250px;width: 400px')]")));

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("HelloWorld");

	}

}
