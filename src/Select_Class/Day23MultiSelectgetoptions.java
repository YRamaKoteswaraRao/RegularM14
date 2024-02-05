package Select_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day23MultiSelectgetoptions {
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("file:///C:/Users/Y%20RAMA%20KOTESWARA%20RAO/Downloads/demo-1.html");
	WebElement multiDropDwon = driver.findElement(By.id("multiple_cars"));
	Select s_ref = new Select(multiDropDwon);
	List<WebElement> web = s_ref.getOptions();
	for (WebElement a : web) {
		a.click();
	}
}
}
