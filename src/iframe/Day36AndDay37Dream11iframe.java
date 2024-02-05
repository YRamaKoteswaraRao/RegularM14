package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day36AndDay37Dream11iframe {
		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://www.dream11.com/");
			//switch my controller to embedded page
			//driver.switchTo().frame(0);
			//driver.switchTo().frame("send-sms-iframe");
			WebElement Element = driver.findElement(By.xpath("//iframe[@id='send-sms-iframe']"));
			driver.switchTo().frame(Element);
			driver.findElement(By.cssSelector("input[placeholder='Enter Mobile Number']")).sendKeys("987654321");
		    //switch my controller to parent page
			driver.switchTo().parentFrame();//or .defaultContent();
			//driver.findElement(By.id("hamburger")).click();  or
			driver.findElement(By.xpath("//div[@id='hamburger']")).click();
		}
}
