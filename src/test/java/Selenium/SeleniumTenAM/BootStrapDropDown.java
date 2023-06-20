package Selenium.SeleniumTenAM;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BootStrapDropDown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.hdfcbank.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//a[text()='Select Product Type Selenium AND JAVA']")).click();
		
		List<WebElement> productOptions = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfAllElements(productOptions));

		
		
		Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(30))
			       .pollingEvery(Duration.ofSeconds(5))
			       .ignoring(NoSuchElementException.class);

			


		System.out.println("Number of products available ===> " + productOptions.size());

		for (WebElement option : productOptions) {
			// System.out.println(option.getText());

			if (option.getText().equals("Invest")) {
				option.click();
			}
		}

		driver.findElement(By.xpath("//a[text()='Select Product']")).click();

		List<WebElement> products = driver.findElements(By.cssSelector("ul[class='dropdown2 dropdown-menu']>li"));

		for (int i = 0; i < products.size(); i++) {
			System.out.println(products.get(i).getText());

			/*
			 * if(products.get(i).getText().equalsIgnoreCase("Demat Account")) {
			 * products.get(i).click(); }
			 */

			products.get(3).click();

		}

	}

}
