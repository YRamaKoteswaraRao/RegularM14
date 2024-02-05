package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v114.page.Page.GetAppIdResponse;

public class Day19getTextXpathAbsoluteEntelementsLoopingAssignment1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		List<WebElement> header_links = driver.findElements(By.xpath("/html/body/div[4]/div/div[1]/div[2]/div/ul/li/a"));
		for (WebElement web : header_links)
		{
			System.out.println(web.getText());
		}
	       driver.close();
 }
		
}
