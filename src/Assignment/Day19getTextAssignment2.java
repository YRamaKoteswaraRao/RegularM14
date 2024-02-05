package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day19getTextAssignment2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		WebElement header_menu = driver.findElement(By.xpath("//div[@class='header-menu']"));
		System.out.println(header_menu.getText());
		Thread.sleep(1000);
		driver.close();
		 
	}

}
