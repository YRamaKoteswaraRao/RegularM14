package Assignment1;

import java.time.Duration;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day37SpeedTestAssignment {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
		driver.get("https://www.speedtest.net/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		Thread.sleep(1000);
		//WebElement Element = driver.findElement(By.xpath("//iframe[@id='google_ads_iframe_/6692/speedtest.net/stnext_skyscraper_0']"));
		WebElement Element = driver.findElement(By.xpath("(//iframe[@scrolling='no'])[4]"));
		driver.switchTo().frame(Element);
	}

}
