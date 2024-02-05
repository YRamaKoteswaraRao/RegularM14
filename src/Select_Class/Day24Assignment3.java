package Select_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day24Assignment3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		Thread.sleep(1000);
	  /*  WebElement sort_by = driver.findElement(By.id("products-orderby"));
		Thread.sleep(1000);
		Select s=new Select(sort_by);*/
		Thread.sleep(1000);
		List<WebElement> options = driver.findElements(By.xpath("(//select[@id='products-orderby'])[option]"));
		for (WebElement web : options) {
		    if (web.getText().contains("value")) {
		    	Thread.sleep(1000);
		        web.click();
		    }
		}
		
	/*	List<WebElement> web = s.getAllSelectedOptions();
		Thread.sleep(1000);
		for (WebElement sort: web) {
			sort.getText();
			Thread.sleep(1000);
		}*/
		driver.close();
	}
}
	
