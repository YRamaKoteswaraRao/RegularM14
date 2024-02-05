package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
	public static void main(String[] args) {
		//open the browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		driver.navigate().to("https://www.ktmindia.com/");
		String current_titleKtm=driver.getTitle();
		System.out.println((current_titleKtm));
		driver.get("https://www.royalenfield.com/");
		driver.navigate().back();
		String given_titleKtm="KTM | READY TO RACE | Explore the range in India – Models, Features, Price, Colors ";
		if(given_titleKtm.contains(current_titleKtm))
		{
			System.out.println("you are in KTM WebPage");
		}
		else
			System.out.println("You are in RoyalEnfield webpage");
		driver.navigate().forward();
	}

}
