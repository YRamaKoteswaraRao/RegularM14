package PopUP;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day35CalenderPopUp {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	driver.get("https://www.agoda.com/");
	WebElement no_thanks = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='No thanks']")));
	no_thanks.click();
	driver.findElement(By.xpath("//div[@data-selenium='checkInText']")).click();
	driver.findElement(By.xpath("//span[@data-selenium-date='2024-01-20']")).click();
	driver.findElement(By.xpath("//div[@data-selenium='checkOutBox']")).click();
	driver.findElement(By.xpath("//div[@data-selenium='checkOutBox']")).click();
	/*WebElement next_month = driver.findElement(By.xpath("//button[@aria-label='Next Month']"));
	try {
		driver.findElement(By.xpath("//div[@data-date='2024-05-23']")).click();
		System.out.println("script is sucessfull");
	} catch (Exception e) {
		next_month.click();
	}
*/
	Thread.sleep(5000);
	List<WebElement> next_month = driver.findElements(By.xpath("//button[@aria-label='Next Month']"));
	Thread.sleep(1000);
	for (WebElement web : next_month) {
		String Date = web.getText();
		Thread.sleep(1000);
		if (Date.equals("2024-05-23")) {
			web.click();
			Thread.sleep(1000);
			break;
		}
	}
}
}
