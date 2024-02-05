package Actions;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day29KeyDownAndKeyUp {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.navigate().to("https://demowebshop.tricentis.com/");
	Actions a=new Actions(driver);
	a.keyDown(Keys.PAGE_DOWN).build().perform();
	a.keyUp(Keys.PAGE_DOWN).build().perform();
	a.keyDown(Keys.PAGE_UP).build().perform();
	a.keyUp(Keys.PAGE_UP).build().perform();
}
}
