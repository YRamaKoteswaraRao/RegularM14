package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class New1123 {
	static WebDriver driver;
	static String given_url="https://www.shoppersstack.com/";
	public static void OpenBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	public static void CloseBrowser() {
		driver.close();
	}
	public static void OpenSS() {
		driver.get("https://www.shoppersstack.com/");
	}
public static void SuperLogin()
	{
	OpenSS();
	String current_url=driver.getCurrentUrl();
	if(given_url.equals(current_url))
	{
		System.out.println("you are in Home Page");
		driver.findElement(By.xpath("//button[@name='loginBtn']")).click();
	}
	else
		System.out.println("your not in Home page");
	}
public static void main(String[] args) throws InterruptedException {
		OpenBrowser();
		SuperLogin();
		Thread.sleep(2000);
		CloseBrowser();	
	}
}



