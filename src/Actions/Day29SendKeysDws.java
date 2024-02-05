package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day29SendKeysDws {
public static void main(String[] args) {
		String given_url="https://demowebshop.tricentis.com/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		String current_url=driver.getCurrentUrl();
		if(given_url.equals(current_url))
		{
			System.out.println("You are in DWS page");
			WebElement search_field = driver.findElement(By.id("small-searchterms"));
			Actions a=new Actions(driver);
			if(search_field.isEnabled())
			{
				System.out.println("search field is enabled");
				a.moveToElement(search_field).click().sendKeys("Books").build().perform();
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				System.out.println("script is Sucessfull");
				driver.close();
			}
			else
			{
				System.out.println("search field is not enabled");	
				System.out.println("script is Unsucessfull");
			}
		}
		else
		{
			System.out.println("You are not in DWS page");
			driver.close();
		}
		
	}
}
