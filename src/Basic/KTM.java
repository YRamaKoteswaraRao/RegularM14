package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class KTM {
	public static void main(String[] args) {
		String k="https://www.ktmindia1.com/";
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ktmindia.com/");
		String k1=driver.getCurrentUrl();
		if(k.equals(k1))
		{
			System.out.println("URL is same");
		}
		else
			System.out.println("Url is not same");
		driver.close();
	}
}
