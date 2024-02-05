package Assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestUtilityDWSRegisterForm {
	public static WebDriver driver;
	public static void ChromeBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	public static void CloseBrowser() {
		driver.close();
	}
	public static void openDWS()  {
		driver.get("https://demowebshop.tricentis.com/");
	}
public static void main(String[] args) throws InterruptedException {
	String given_url= "https://demowebshop.tricentis.com/";
	String given_registerTitle="Demo Web Shop. Register";
	ChromeBrowser();
	openDWS();
	String current_url=driver.getCurrentUrl();
	if(given_url.equals(current_url))
	{
		System.out.println("Sucessufull Enterd Demo web page");
		driver.findElement(By.className("ico-register")).click();
		String currentRegisterTitle=driver.getTitle();
		if(given_registerTitle.contains(currentRegisterTitle))
		{
			System.out.println("Your In Register Page");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[value='M']")).click();
			driver.findElement(By.cssSelector("input[id='FirstName']")).sendKeys("Rama Rao");
			driver.findElement(By.cssSelector("input[name='LastName']")).sendKeys("Y");
			driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("Ramrao123@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[id='Password']")).sendKeys("ram1234");
			driver.findElement(By.cssSelector("input[name='ConfirmPassword']")).sendKeys("ram1234");
			driver.findElement(By.cssSelector("input[value='Register']")).click();
			Thread.sleep(2000);
			CloseBrowser();
		}
		else
			System.out.println("Your not in register page");
	}
	else
		System.out.println("Your not in Demo web page");
}
}	

