package Selenium.SeleniumTenAM;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#Open%20New%20Tab");

		String parentWindow = driver.getWindowHandle();

		driver.findElement(By.xpath("//div[@style='display:block']/a[@href='#']")).click();

		Set<String> multiWindows = driver.getWindowHandles();

		for (String mWindow : multiWindows) {

			if (parentWindow.equals(mWindow)) {

			} else {
				driver.switchTo().window(mWindow);
				driver.findElement(By.xpath("(//a[text()='Home'])[1]")).click();
			}
		}

		driver.switchTo().window(parentWindow);

		driver.findElement(By.xpath("(//a[text()='CheatSheets'])[1]")).click();

		Thread.sleep(2000);

		// driver.close();

		driver.quit();

	}

}
