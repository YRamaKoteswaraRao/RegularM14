package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Royalenfield {
		public static void main(String[] args) {
			String r="https://www.royalenfield.com/in/en/home/";
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.royalenfield.com/in/en/home/");
			driver.getCurrentUrl();
			//System.out.println(driver.getCurrentUrl());
			String r1=driver.getCurrentUrl();
			if(r.equals(r1))
			{
				System.out.println("URL is same");
			}
			else
				System.out.println("URL is not same");
			driver.close();
		}

	}

