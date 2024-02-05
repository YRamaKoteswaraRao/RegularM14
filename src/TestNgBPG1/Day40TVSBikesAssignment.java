package TestNgBPG1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day40TVSBikesAssignment {
	@Test(groups = "smoke")	
	public void TVS() {
		String given_url="https://www.tvsmotor.com/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.tvsmotor.com/");
		String current_url=driver.getCurrentUrl();
		if(given_url.equals(current_url))
		{
			System.out.println("Your in Sucessfull Home page");
			driver.quit();
		}
		else
		{
			System.out.println("Your not in UnSucessfull Page");
		}
	}
}
