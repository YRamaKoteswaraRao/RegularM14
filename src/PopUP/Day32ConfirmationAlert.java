package PopUP;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day32ConfirmationAlert {
public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver=new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//enter into Automation Demo page
		driver.get("https://demo.automationtesting.in/Alerts.html");
		//click the alert with ok and cancel button
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
		Thread.sleep(2000);
		Alert a=driver.switchTo().alert();
		a.dismiss();
		Thread.sleep(2000);
		driver.close();
	}
}
