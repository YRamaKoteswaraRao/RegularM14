

package TestNGPrograms;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day40BataShoesAssigenment {
@Test	
public void bata() {
	String given_url="https://www.bata.com/in/";
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.bata.com/in/");
	String current_url=driver.getCurrentUrl();
	if(given_url.equals(current_url)) {
		System.out.println("Your in Sucessfull Bata Home page");
		driver.quit();
	}
	else {
		System.out.println("Your not in Bata Page");
	}
}
}
