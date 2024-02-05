package Assignment1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day24Assignment2 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
	Thread.sleep(1000);
	WebElement sort_by = driver.findElement(By.id("products-orderby"));
	Thread.sleep(1000);
	Select s1=new Select(sort_by);
	s1.selectByValue("https://demowebshop.tricentis.com/books?orderby=10");
	Thread.sleep(1000);
	WebElement display = driver.findElement(By.xpath("//select[@name='products-pagesize']"));
	Select s2=new Select(display);
	s2.selectByIndex(2);
	Thread.sleep(1000);
	WebElement view_as= driver.findElement(By.xpath("//select[@id='products-viewmode']"));
	Thread.sleep(1000);
	Select s3 = new Select(view_as);
	s3.selectByVisibleText("List");
	Thread.sleep(1000);
	driver.close();
	
}
}
