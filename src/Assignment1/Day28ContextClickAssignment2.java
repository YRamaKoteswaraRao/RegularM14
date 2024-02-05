package Assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day28ContextClickAssignment2 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	WebElement context_click = driver.findElement(By.xpath("//span[text()='right click me']"));
	Actions a= new Actions(driver);
	a.contextClick(context_click).build().perform();
    WebElement select = driver.findElement(By.xpath("//span[text()='Delete']"));
    select.click();
	Thread.sleep(2000);
	try {
		select.isEnabled();
		System.out.println("my script is Unsucessfull");
	} catch (Exception e) {
		System.out.println("my script is sucessfull");
		driver.close();
	}
	
}
}
