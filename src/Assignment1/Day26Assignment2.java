package Assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day26Assignment2 {
	public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://omayo.blogspot.com/");
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	WebElement enabled_button = wait.until(ExpectedConditions.elementToBeClickable(By.id("timerButton")));
	enabled_button.click();
	driver.close();
}
}
