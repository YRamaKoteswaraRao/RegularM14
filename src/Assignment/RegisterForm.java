package Assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterForm {
	public static void main(String[] args) throws InterruptedException {
		//Open the browser
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("gender-male")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("FirstName")).sendKeys("Rama");
		driver.findElement(By.id("LastName")).sendKeys("Rao");
		driver.findElement(By.id("Email")).sendKeys("ramarao@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("rama1234");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("rama1234");
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
