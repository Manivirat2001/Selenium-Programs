package Selenium.SeleniumTenAM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablesTask {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.tnstc.in/home.html");

		WebElement destinations = driver
				.findElement(By.xpath("//td[@background='images/td_bg.jpg']/ancestor::table[@width='92%']//table"));

		System.out.println(destinations.getText());
	}

}
