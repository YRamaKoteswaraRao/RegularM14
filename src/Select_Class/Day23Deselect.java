package Select_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day23Deselect {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/Y%20RAMA%20KOTESWARA%20RAO/Downloads/demo-1.html");
		WebElement multiDropDwon = driver.findElement(By.id("multiple_cars"));
		Select s_ref = new Select(multiDropDwon);
		s_ref.selectByIndex(4);
		Thread.sleep(2000);
		s_ref.deselectByIndex(4);
}
}
