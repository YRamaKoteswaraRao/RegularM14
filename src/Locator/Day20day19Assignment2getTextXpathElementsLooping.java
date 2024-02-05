package Locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day20day19Assignment2getTextXpathElementsLooping {
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
			List<WebElement> menu = driver.findElements(By.xpath("/html/body/div[4]/div/div[2]/ul[1]/li"));
			Thread.sleep(1000);
			for (int i = 0; i < menu.size(); i++) {
				String text = menu.get(i).getText();
				Thread.sleep(1000);
				System.out.println(text);	
			}
			driver.close();
		}
		else
			System.out.println("Entering into the DWS page Unsucessfull");
		
	}

}
