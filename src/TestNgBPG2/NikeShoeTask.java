package TestNgBPG2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NikeShoeTask {
	@Test
	public void nike() {
		String given_title="Nike. Just Do It. Nike IN";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.nike.com/in/");
		String current_title=driver.getTitle();
		if(given_title.equals(current_title)) {
			System.out.println("Your in Sucessfull Nike Home page");
			driver.quit();
		}
		else {
			System.out.println("Your not in Nike Page");
		}
	}
}
