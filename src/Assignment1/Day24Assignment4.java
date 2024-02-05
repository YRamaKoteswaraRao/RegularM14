package Assignment1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day24Assignment4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		Thread.sleep(1000);
		WebElement sort_by = driver.findElement(By.xpath("//select[@id='products-orderby']"));
		Select s=new Select(sort_by);
		Thread.sleep(1000);
		List<WebElement> options = s.getOptions();
		int i=0;
		for (WebElement web : options) {
			sort_by = driver.findElement(By.id("products-orderby"));
			s=new Select(sort_by);
			s.selectByIndex(i++);
			Thread.sleep(1000);
		}
		driver.close();
	}
}
