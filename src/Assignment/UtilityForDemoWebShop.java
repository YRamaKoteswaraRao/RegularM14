package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UtilityForDemoWebShop {
		public static WebDriver driver;
		public static void ChromeBrowser()
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		public static void EdgeBrowser() 
		{
			driver=new EdgeDriver();
			driver.manage().window().maximize();	
		}
		public static void FireFoxBrowser()
		{
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
		}
		public static void CloseBrowser() {
			driver.close();
		}
		public static void openDWS()
		{
			driver.get("https://demowebshop.tricentis.com/");
		}
		//WebDriver driver=new ChromeDriver();//Pre-condition
		//driver.manage().window().maximize();//Pre-condition
		//driver.get("https://demowebshop.tricentis.com/");//test script
	    //driver.close();//Post-condition
		public static void main(String[] args) {
			ChromeBrowser();
			openDWS();
			CloseBrowser();
			
		}
	}
    

