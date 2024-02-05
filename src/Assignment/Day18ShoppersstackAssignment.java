package Assignment;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day18ShoppersstackAssignment {
		static WebDriver driver;
		static String given_url="https://www.shoppersstack.com/";
		static String given_Title="Demo Web Shop. $25 Virtual Gift Card";
		public static void OpenBrowser() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		public static void CloseBrowser() {
			driver.close();
		}
		public static void OpenDWS() {
			driver.navigate().to("https://www.shoppersstack.com/");
		}
		public static void SuperLogin() throws InterruptedException
		{
		OpenDWS();
		String current_url=driver.getCurrentUrl();
		//String[] name= {"Ram","Ramrao123@gmail.com","Prasad","Prasad116@gmail.com"};
		if(given_url.equals(current_url))
		{
			System.out.println("you are in Home Page");
			Thread.sleep(5000);
			WebElement login = driver.findElement(By.xpath("//button[@id='loginBtn']"));
			login.click();
			if(login.isSelected())
			{
				System.out.println("Your login button click");
			}
			else
				System.out.println("your in login button Not click");
			/*driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
			Thread.sleep(1000);
			String current_Title=driver.getTitle();
			if(given_Title.contains(current_Title))
			{
				System.out.println("Your in $25 Gift Cart Page");
				Thread.sleep(1000);
			    List<WebElement> gift_field=driver.findElements(By.xpath("//div[@class='giftcard']/div/input"));
			    Thread.sleep(1000);
			    int i=0;
			    for (WebElement web : gift_field)
			    {
					web.sendKeys(name[i++]);
					Thread.sleep(1000);
				}
				driver.findElement(By.xpath("//textarea[@class='message']")).sendKeys("Hi Hello");
				WebElement qty=driver.findElement(By.xpath("//input[@data-val-number='The field Qty must be a number.']"));
				qty.clear();
				Thread.sleep(1000);
				qty.sendKeys("3");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@id='add-to-cart-button-2']")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
				WebElement checkBox=driver.findElement(By.xpath("//input[@name='removefromcart']"));
				checkBox.click();
				if(checkBox.isSelected())
				{
					System.out.println("Your checkBox is Selected");
					WebElement update_Cart = driver.findElement(By.xpath("//input[@name='updatecart']"));
					if(update_Cart.isEnabled())
					{
						System.out.println("update_Cart is sucessfull");
						update_Cart.click();
						Thread.sleep(1000);
					}
					else
						System.out.println("update_Cart is Unsucessfull");
				}
				else
					System.out.println("Your checkBox is not selected");
			}
			else
				System.out.println("Your not in Gift Page");*/
		}
		else
			System.out.println("your not in Home page");
		}
		public static void main(String[] args) throws InterruptedException {
			OpenBrowser();
			SuperLogin();
			Thread.sleep(2000);
			CloseBrowser();	
		}
}
