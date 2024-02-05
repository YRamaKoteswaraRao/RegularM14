package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HondaWebsite {
	public static void main(String[] args) {
		String s="https://www.hondawheelers.com/";
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.honda2wheelersindia.com/");
		driver.getCurrentUrl();
		//System.out.println(driver.getCurrentUrl());
		String s1=driver.getCurrentUrl();
		if(s.equals(s1))
		{
			System.out.println("URL is same");
		}
		else
			System.out.println("URL is not same");
		driver.close();
	}

}
