package Selenium.SeleniumTenAM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionDragAndDropManual {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

		Thread.sleep(3000);

		WebElement dragMe = driver.findElement(By.id("box7"));
		

		WebElement dropLocation = driver.findElement(By.id("box107"));

		Actions a = new Actions(driver);

		a.clickAndHold(dragMe).moveToElement(dropLocation).release(dropLocation).perform();

		Thread.sleep(2000);

		a.dragAndDrop(driver.findElement(By.id("box6")), driver.findElement(By.id("box106"))).perform();

	}

}
