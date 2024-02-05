package Assignment;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFindElements {
	public static void main(String[] args) throws InterruptedException {
		String given_Url="https://demowebshop.tricentis.com/"; 
		String given_Digital_download_Title="Demo Web Shop. Digital downloads";		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		if(given_Url.equals(driver.getCurrentUrl()))
		{
			System.out.println("Your in Demowebshop page");
		    driver.findElement(By.partialLinkText("Digital downloads")).click();
			//(or) driver.findElement(By.cssSelector("a[href='/digital-downloads']")).click();
			if(given_Digital_download_Title.contains(driver.getTitle()))
			{
				System.out.println("Your in Digital downloads page");
				//List<WebElement>digital_download= driver.findElements(By.cssSelector("input[value='Add to cart']"));
				//for (WebElement web : digital_download)
				//  (OR)
				List<WebElement> Add_to_cart = driver.findElements(By.cssSelector("input[value='Add to cart']"));
				//Add the Digital download products
				for (WebElement web : Add_to_cart)	
				{
					web.click();
					Thread.sleep(2000);
				}
				//Enter into the shopping cart
				driver.findElement(By.cssSelector("span[class='cart-label']")).click();
				WebElement shopping_Cart = driver.findElement(By.cssSelector("div[class='page-title']"));
				if(shopping_Cart.isDisplayed())
				{
					System.out.println("Your in shopping Cart Page");
					Thread.sleep(2000);
					driver.close();
				}
				else
					System.out.println("Your not in Shopping Cart Page");
			}
		    else
				System.out.println("Your noi in Digital downloads page");
		}
		else
		   System.out.println("Your not in Demowebpage");
	}
}
