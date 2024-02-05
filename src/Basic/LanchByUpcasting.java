package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LanchByUpcasting {
	public static void main(String[] args) {
		String s="https://www.qspiders1.com/";//given URL
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.qspiders.com/");
		String s1=driver.getCurrentUrl(); //current URL.
		if(s.equals(s1))
		{
			System.out.println("Url is same");
		}
		else
			System.out.println("Url is not same");
		driver.close();
	}
	

}
