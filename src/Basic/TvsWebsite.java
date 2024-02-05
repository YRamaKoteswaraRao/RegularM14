package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TvsWebsite {
	public static void main(String[] args) {
		String t="https://www.tvsmotorvehical.com//";
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tvsmotor.com/");
		driver.getCurrentUrl();
		//System.out.println(driver.getCurrentUrl());
		String t1=driver.getCurrentUrl();
		if(t.equals(t1))
		{
			System.out.println("URL is same");
		}
		else
			System.out.println("URL is not same");
		driver.close();
	}

}