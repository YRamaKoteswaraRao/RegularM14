package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day17Example {
	public static void main(String[] args) throws InterruptedException {
	String given_url="https://www.shoppersstack.com/";
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.shoppersstack.com/");
	Thread.sleep(5000);
	String current_url=driver.getCurrentUrl();
	if(given_url.equals(current_url))
	{
		System.out.println("you are in Home Page");
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
	   // WebElement login = driver.findElement(By.xpath("///button[@id='loginBtn']"));
		//if(login.isEnabled())
	    
		{
			System.out.println("Your login button click");
			Thread.sleep(5000);
			login.click();
		}
		else
			System.out.println("your in login button Not click");
	}
	else
		System.out.println("your not in Home page");
	
  }
}

