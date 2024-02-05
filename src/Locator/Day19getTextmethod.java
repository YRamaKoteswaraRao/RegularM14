package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day19getTextmethod {
	public static void main(String[] args) throws InterruptedException {
		String given_url ="https://demowebshop.tricentis.com/";
		//String given_Title="Demo Web Shop. Digital downloads";
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String current_url=driver.getCurrentUrl();
		if(given_url.equals(current_url))
		{
			System.out.println("Your in DWS page");
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//a[contains(text(),'Digital downloads')])[1]")).click();
			WebElement register_text = driver.findElement(By.xpath("//a[@class='ico-register']"));
			System.out.println(register_text.getText());
			
		}
	}
}
