package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day19getTextAssignment3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		WebElement listbox = driver.findElement(By.xpath("(//div[@class='listbox'])[1]"));
		System.out.println(listbox.getText());
		Thread.sleep(1000);
		driver.close();
	}

}
