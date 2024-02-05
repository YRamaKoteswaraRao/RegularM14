package Assignment1;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day35RedbusAssignment2 {
	public static void main(String[] args){
		ChromeOptions chrome_options=new ChromeOptions();
		chrome_options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(chrome_options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.get("https://www.redbus.in/");
		Actions act=new Actions(driver);
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Guntur");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//text[text()='Guntur (Andhra Pradesh)']")));
		act.keyDown(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Bengalore");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//text[text()='Bangalore']")));
		act.keyDown(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//span[text()='Date']")).click();
		driver.findElement(By.xpath("//span[text()='20']")).click();
		driver.findElement(By.id("search_button")).click();
	}
}
