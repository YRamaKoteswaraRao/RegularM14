package PopUP;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day32PromptAlert {
public static void main(String[] args) throws InterruptedException {
	    String given_text="Hello Rama Koti How are you today";
		//open the browser
		WebDriver driver=new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//enter into Automation Demo page
		driver.get("https://demo.automationtesting.in/Alerts.html");
		//click the alert with ok and cancel button
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Alert a= driver.switchTo().alert();
		a.sendKeys("Rama Koti");
		a.accept();
		String current_text=driver.findElement(By.id("demo1")).getText();
		if(given_text.contains(current_text))
		{
			System.out.println("you have successsfully entered the data inside the pop-Up");
			System.out.println(current_text);
			driver.close();
		}
		else
		{
			System.out.println("Data is Successful");
			driver.close();
		}
}
}
