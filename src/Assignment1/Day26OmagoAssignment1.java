package Assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day26OmagoAssignment1 {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	driver.navigate().to("https://omayo.blogspot.com/");
	driver.findElement(By.xpath("//button[@class='dropbtn']")).click();
	WebElement facebook = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Facebook']")));
	facebook.click();
	WebElement sign_up = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
	if(sign_up.isDisplayed())
	{
		System.out.println("Your in Face Book page");
		driver.navigate().back();
		driver.close();	
	}
	else
	{
		System.out.println("Your not in Face Book Page");
	}
}
}
