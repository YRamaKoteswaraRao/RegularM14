package Assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Day16XpathAttributeAssignment {
	public static WebDriver driver;
	public static void ChromeBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	public static void CloseBrowser() {
		driver.close();
	}
	public static void OpenDWS() {
		driver.get("https://demowebshop.tricentis.com/");
	}
public static void main(String[] args) throws InterruptedException {
	String given_Url="https://demowebshop.tricentis.com/";
    String given_VirtualGift_CartTitle="Demo Web Shop. $25 Virtual Gift Card";
    String given_Shopping_CartTitle="Demo Web Shop. Shopping Cart";
	ChromeBrowser();
	OpenDWS();
	String current_Url=driver.getCurrentUrl();
	if(given_Url.equals(current_Url))
	{
		System.out.println("Your in Demo Web Shop page");
		driver.findElement(By.xpath("(//a[@title='Show details for $25 Virtual Gift Card'])[1]")).click();
		String current_VirtualGift_CartTitle=driver.getTitle();
		if(given_VirtualGift_CartTitle.contains(current_VirtualGift_CartTitle))
				{
			       System.out.println("Your in the Gift Cart Page");
			       driver.findElement(By.xpath("//input[@class='recipient-name']")).sendKeys("Ram");
       			   Thread.sleep(1000);
			       driver.findElement(By.xpath("//input[@class='recipient-email']")).sendKeys("Ramrao123@gmail.com");
			       Thread.sleep(1000);
			       driver.findElement(By.xpath("//input[@name='giftcard_2.SenderName']")).sendKeys("Prasad");
			       Thread.sleep(1000);
			       driver.findElement(By.xpath("//input[@id='giftcard_2_SenderEmail']")).sendKeys("Prasad116@gmail.com");
			       Thread.sleep(1000);
			       driver.findElement(By.xpath("//textarea[@class='message']")).sendKeys("Hello");
			       Thread.sleep(1000);
			       driver.findElement(By.xpath("//input[@id='addtocart_2_EnteredQuantity']")).sendKeys("");
			       Thread.sleep(1000);
			       driver.findElement(By.xpath("//input[@class='button-1 add-to-cart-button']")).click();
			       driver.findElement(By.xpath("//span[@class='cart-label']")).click();
			       String current_Shopping_CartTitle=driver.getTitle();
			       if(given_Shopping_CartTitle.contains(current_Shopping_CartTitle))
			       {
			    	   System.out.println("Your in Shopping Cart Page");
			    	   driver.findElement(By.xpath("//input[@name='removefromcart']")).click();
			    	   Thread.sleep(1000);
			    	   driver.findElement(By.xpath("//input[@name='updatecart']")).click();
			    	   Thread.sleep(1000);
			    	   CloseBrowser();
			       }
			       else
			    	   System.out.println("Your not in Shopping Cart Page");
				}
		else
			System.out.println("Your not in the Gift Cart Page");
	}
	else
		System.out.println("Your not in Demo Web Shop page");
}
}
