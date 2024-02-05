package TestNgBPG2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PumaShoes {
	@Test
	public void puma() {
		String given_url="https://in.puma.com/in/en";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://in.puma.com/in/en");
		String current_url=driver.getCurrentUrl();
		if(given_url.equals(current_url)) {
			System.out.println("Your in Sucessfull Puma Home page");
			driver.quit();
		}
		else {
			System.out.println("Your not in Puma Page");
		}
	}
}
