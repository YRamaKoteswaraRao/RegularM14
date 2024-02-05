package Locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day21IndependentAndDependent {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/digital-downloads");
		Thread.sleep(1000);
		WebElement price = driver.findElement(By.xpath("//a[text()='3rd Album']/parent::h2/parent::div/child::div[3]/child::div[1]/span"));
		System.out.println(price.getText());
		WebElement price2 = driver.findElement(By.xpath("(//a[text()='Music 2'])[1]/parent::h2/parent::div/child::div[3]/child::div[1]/span"));
		System.out.println(price2.getText());
		WebElement price3 = driver.findElement(By.xpath("(//a[text()='Music 2'])[2]/parent::h2/parent::div/child::div[3]/child::div[1]/span"));
		System.out.println(price3.getText());
		
	}
}