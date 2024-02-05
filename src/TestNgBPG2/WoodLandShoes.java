package TestNgBPG2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WoodLandShoes {
	@Test
	public void woodland() {
		String given_title="Welcome to Woodland. One stop for Lifestyle and Sports Wear.";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.woodlandworldwide.com/");
		String current_title=driver.getTitle();
		if(given_title.equals(current_title)) {
			System.out.println("Your in Sucessfull WoodLand Home page");
			driver.quit();
		}
		else {
			System.out.println("Your not in WoodLand Page");
		}
	}
}
