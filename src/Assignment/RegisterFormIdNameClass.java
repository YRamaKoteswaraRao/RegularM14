package Assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class RegisterFormIdNameClass {
	public static void main(String[] args) throws InterruptedException {
		//opening the browser
		WebDriver driver = new ChromeDriver();
		//enter into the demo workshop page
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//click the register button
		driver.findElement(By.className("ico-register")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("gender-male")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys("Rama Rao");
		Thread.sleep(2000);
		driver.findElement(By.name("LastName")).sendKeys("Y");
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("yramarao99@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("Password")).sendKeys("rama1234");
		Thread.sleep(2000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("rama1234");
		Thread.sleep(2000);
		driver.findElement(By.id("register-button")).click();
	}
}
