package Locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day17GiftcartAssignmentAttributeXpath {
	static WebDriver driver;
    static String given_url="https://demowebshop.tricentis.com/";
    static String given_Title="Demo Web Shop. $25 Virtual Gift Card";
public static void OpenBrowser() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
}
public static void CloseBrowser() {
	driver.close();
  }
public static void OpenDWS() {
	driver.get("https://demowebshop.tricentis.com/");
}
public static void giftCart() throws InterruptedException
   {
     OpenDWS();
     String current_url=driver.getCurrentUrl();
     String[] name= {"Ram","Ramrao123@gmail.com","Prasad","Prasad116@gmail.com"};
     if(given_url.equals(current_url))
     {
	    System.out.println("you are in Home Page");
	    driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
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
	    	driver.findElement(By.xpath("//input[@id='add-to-cart-button-2']")).click();
	    	Thread.sleep(5000);
	    	driver.findElement(By.xpath("(//span[@class='cart-label'])[1]")).click();
	    	Thread.sleep(1000);
	    }
	    else
	    	System.out.println("Your not in Gift Page");
     }
     else
    	 System.out.println("your not in Home page");
   }
public static void main(String[] args) throws InterruptedException {
	OpenBrowser();
	giftCart();
	Thread.sleep(2000);
	CloseBrowser();	
}
}
