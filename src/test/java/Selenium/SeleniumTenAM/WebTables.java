package Selenium.SeleniumTenAM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		
		WebElement datas = driver.findElement(By.xpath("//table[@id = 'customers']/tbody"));
		
		System.out.println(datas.getText());
		
		List<WebElement> theadings = driver.findElements(By.xpath("//table[@id = 'customers']//th"));
		
		for(WebElement th:theadings)
		{
			System.out.println(th.getText());
		}
		
		List<WebElement> trows = driver.findElements(By.xpath("//table[@id = 'customers']/tbody/tr/td[contains(text(),'Yoshi')]/parent::tr/td"));
	
		for(WebElement tr:trows)
		{
			System.out.println(tr.getText());
		}
	
		WebElement tdata = driver.findElement(By.xpath("//table[@id = 'customers']/tbody/tr/td[text()='Island Trading']"));
	
		System.out.println(tdata.getText());
	}

}
