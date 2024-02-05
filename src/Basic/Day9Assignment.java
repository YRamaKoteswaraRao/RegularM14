package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day9Assignment {
	public static void main(String[] args) throws InterruptedException {
		String a = "https://demowebshop.tricentis.com/";
		//Open the browser
		WebDriver driver = new ChromeDriver();
		//browser maximize
		driver.manage().window().maximize();
		//webpage open
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.get("https://www.abhibus.com/");
		Thread.sleep(2000);
        //navigate back to demo web shop
		driver.navigate().back();
		String a1=driver.getCurrentUrl();
				if(a.equals(a1))
				  {
					System.out.println("Url is same");
				  }
				else
					System.out.println("Url is not same");
		Thread.sleep(2000);
		driver.findElement(By.id("small-searchterms")).sendKeys("Mobile");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		//Forward to webpage
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.close();
	}
}
