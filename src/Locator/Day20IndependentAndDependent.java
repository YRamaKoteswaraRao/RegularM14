package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day20IndependentAndDependent {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/digital-downloads");
	    WebElement web = driver.findElement(By.xpath("(//a[text()='Music 2'])[1]/../../div[3]/div[1]/span"));
		System.out.println(web.getText());
		driver.close();
	}
}
