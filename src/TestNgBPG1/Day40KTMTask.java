package TestNgBPG1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day40KTMTask {
	@Test
	public void KTM() {
		String given_url="https://www.ktmindia.com/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.ktmindia.com/");
		String current_url=driver.getCurrentUrl();
		if(given_url.equals(current_url)) {
			System.out.println("Your in Sucessfull KTM Home page");
			driver.quit();
		}
		else {
			System.out.println("Your not in KTM Page");
		}
	}
}
