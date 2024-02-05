package Select_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day23IsMultiple {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/Y%20RAMA%20KOTESWARA%20RAO/Downloads/demo-1.html");
		WebElement single_dropdown = driver.findElement(By.xpath("//select[@id='standard_cars']"));
		WebElement multi_DropDwon = driver.findElement(By.xpath("//select[@id='multiple_cars']"));
		Select s1 = new Select(single_dropdown);
		Select s2 = new Select(multi_DropDwon);
		if (s1.isMultiple()) {
			System.out.println("Your in using s1 drop down menu");
			List<WebElement> s1_values = s1.getOptions();
			for (WebElement web : s1_values) {
				web.click();
				Thread.sleep(2000);
			}
			s1.deselectAll();
		}
		else
		{
			System.out.println("Your in using s2 drop down menu");
			List<WebElement> s2_values = s2.getOptions();
			for (WebElement web : s2_values) {
				web.click();
				Thread.sleep(2000);
		}
		s2.deselectAll();	
      }
		driver.close();
}
}	