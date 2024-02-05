package PopUP;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day32SimpleAlert {
public static void main(String[] args) throws InterruptedException {
	//open the browser
	WebDriver driver=new ChromeDriver();
	//maximize
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	//enter into DWS page
	driver.get("https://demowebshop.tricentis.com/");
	//click the search button
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(2000);
	Alert a=driver.switchTo().alert();
	System.out.println("Your alert text is:"+a.getText());
	a.accept();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Register")).click();
	Thread.sleep(2000);
	driver.close();
}
}
