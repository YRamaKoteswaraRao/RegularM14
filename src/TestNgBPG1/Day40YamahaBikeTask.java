package TestNgBPG1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day40YamahaBikeTask {
	@Test
	public void Yamaha() {
		String given_url="https://yamaha-motor.com/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://yamaha-motor.com/");
		String current_url=driver.getCurrentUrl();
		if(given_url.equals(current_url)) {
			System.out.println("Your in Sucessfull Home page");
			driver.quit();
		}
		else {
			System.out.println("Your not in UnSuccessfull Page");
		}
	}
}
