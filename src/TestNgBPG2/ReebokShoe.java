package TestNgBPG2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReebokShoe {
	@Test
	public void reebok() {
		String given_url="https://reebok.abfrl.in/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://reebok.abfrl.in/");
		String current_url=driver.getCurrentUrl();
		if(given_url.equals(current_url)) {
			System.out.println("Your in Sucessfull Reebok Home page");
			driver.quit();
		}
		else {
			System.out.println("Your not in Reebk Page");
		}
	}
}
