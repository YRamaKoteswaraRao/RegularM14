package Select_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day22SingleSelect {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Y%20RAMA%20KOTESWARA%20RAO/Downloads/demo-1.html");
		Thread.sleep(2000);
		WebElement single_Select = driver.findElement(By.cssSelector("select[id='standard_cars']"));
		Thread.sleep(2000);
		Select s_ref=new Select(single_Select);
		Thread.sleep(2000);
	    s_ref.selectByVisibleText("Land Rover");
	    Thread.sleep(2000);
	    s_ref.selectByValue("toy");
	    Thread.sleep(2000);
	    s_ref.selectByIndex(5);
	    Thread.sleep(2000);
	    driver.close();
	
	}
}
