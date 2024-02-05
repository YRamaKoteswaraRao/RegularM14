package Locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day20day19Assignment3getTextXpathElementsLooping {
	public static void main(String[] args) throws InterruptedException {
		String given_text="Featured products";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement featured_product = driver.findElement(By.xpath("//strong[text()='Featured products']"));
		String current_text=featured_product.getText();
		System.out.println(current_text);
		if(given_text.equalsIgnoreCase(current_text))
		{
			System.out.println("Entering into the DWS page Sucessfull");
			Thread.sleep(1000);
			List<WebElement> list = driver.findElements(By.xpath("/html/body/div[4]/div/div[4]/div[1]/div[1]/div[2]/ul/li"));
			Thread.sleep(1000);
			for (int i = 0; i < list.size(); i++) {
				String text = list.get(i).getText();
				Thread.sleep(1000);
				System.out.println(text);	
			}
			driver.close();
		}
		else
			System.out.println("Entering into the DWS page Unsucessfull");
		
	}
}
