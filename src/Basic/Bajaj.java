package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Bajaj {
	public static void main(String[] args) {
		String b="https://www.bajajauto.com/";
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bajajauto.com/");
		driver.getCurrentUrl();
		//System.out.println(driver.getCurrentUrl());
		String b1=driver.getCurrentUrl();
		if(b.equals(b1))
		{
			System.out.println("URL is same");
		}
		else
			System.out.println("URL is not same");
		driver.close();
	}

}