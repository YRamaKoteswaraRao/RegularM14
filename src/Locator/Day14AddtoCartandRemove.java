package Locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day14AddtoCartandRemove {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement wellcome_to_our_store = driver.findElement(By.cssSelector("div[class='topic-html-content-title']"));
		if(wellcome_to_our_store.isDisplayed())
		{Thread.sleep(2000);
			System.out.println("Your in Wellcome to our store Page");
			driver.findElement(By.partialLinkText("Digital downloads")).click();
			WebElement Digital_downloads= driver.findElement(By.cssSelector("div[class='page-title']"));
			if(Digital_downloads.isDisplayed())
			{
				System.out.println("Your in Digital downloads Page");
				List<WebElement>digital_download= driver.findElements(By.cssSelector("input[value='Add to cart']"));
				for (WebElement web : digital_download)
				{
					web.click();
					Thread.sleep(2000);
				}
				driver.findElement(By.cssSelector("span[class='cart-label']")).click();
				WebElement shopping_Cart = driver.findElement(By.cssSelector("div[class='page-title']"));
				if(shopping_Cart.isDisplayed())
				{
					System.out.println("Your in shopping Cart Page");
					List<WebElement> remove_checkBox = driver.findElements(By.cssSelector("input[type='checkbox']"));
					remove_checkBox.add(wellcome_to_our_store)
					for (WebElement web : remove_checkBox)
					{
						web.click();
						Thread.sleep(1000);	
					} 
					driver.findElement(By.cssSelector("input[class='button-2 update-cart-button']")).click();	
					Thread.sleep(2000);
					driver.close();
				}
				else
					System.out.println("Your not in Shopping Cart Page");
			}
			else
				System.out.println("Your not in Digital downloads Page");
		}
		else
			System.out.println("Your not in Wellcome to our store Page");
	}
}
