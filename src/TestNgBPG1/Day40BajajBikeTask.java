package TestNgBPG1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day40BajajBikeTask {
	@Test(groups = {"smoke","regression"})
	public void Bajaj() {
		String given_title="Leading manufacturer of bikes & 3-wheelers | Bajaj Auto";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.bajajauto.com/");
		String current_title=driver.getTitle();
		if(given_title.equals(current_title)) {
			System.out.println("Your in Sucessfull Bajaj Home page");
			driver.quit();
		}
		else {
			System.out.println("Your not in Bajaj Page");
		}
	}
}
