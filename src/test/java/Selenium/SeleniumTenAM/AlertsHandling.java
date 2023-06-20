package Selenium.SeleniumTenAM;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://demo.automationtesting.in/Alerts.html");

		driver.findElement(By.cssSelector("button[onclick='alertbox()']")).click();

		Thread.sleep(2000);

		Alert alertFunction = driver.switchTo().alert();

		alertFunction.accept();

		driver.findElement(By.cssSelector("a[href='#CancelTab']")).click();

		driver.findElement(By.cssSelector("button[onclick='confirmbox()']")).click();

		alertFunction.dismiss();

		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();

		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();

		String promptAlertText = alertFunction.getText();

		System.out.println(promptAlertText);

		alertFunction.sendKeys("Good Morning Everone");

		alertFunction.accept();

	}

}
