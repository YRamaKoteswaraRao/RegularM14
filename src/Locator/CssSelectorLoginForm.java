package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLoginForm {
	public static void main(String[] args) throws InterruptedException {
		String given_url= "https://demowebshop.tricentis.com/";
		String given_registerTitle="Demo Web Shop. Login";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		String current_url=driver.getCurrentUrl();
		if(given_url.equals(current_url))
		{
			System.out.println("Sucessufull Enterd Url");
			driver.findElement(By.className("ico-login")).click();
			String currentRegisterTitle=driver.getTitle();
			if(given_registerTitle.contains(currentRegisterTitle))
			{
				System.out.println("Your In Login Page");
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("#Email")).sendKeys("Ramrao123@gmail.com");
				driver.findElement(By.cssSelector("input[type='password']")).sendKeys("ram1234");
				driver.findElement(By.cssSelector(".button-1.login-button")).click();
				Thread.sleep(3000);
				driver.findElement(By.cssSelector("[class='ico-logout']")).click();
				driver.close();
			}
			else
				System.out.println("Your not in Login page");
		}
		else
			System.out.println("Unsucessfull url");
	}
}


