package Selenium.SeleniumTenAM;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.amazon.in/");

		Date d = new Date();
		String a = d.toString();
		String a1 = a.replace(" ", "_");
		String date = a1.replace(":", "_");
		System.out.println(date);

		TakesScreenshot tks = (TakesScreenshot) driver; // type casting
		File temp = tks.getScreenshotAs(OutputType.FILE);

		File perm = new File("C:/Users/THIS PC/eclipse-workspace/SeleniumTenAM/Screenshots/proof_" + date + ".png");

		FileUtils.copyFile(temp, perm);
	}

}
