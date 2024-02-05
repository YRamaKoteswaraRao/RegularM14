package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toyotabharat.com/");
		String get_title = "Toyota India | Official Website";
		System.out.println(driver.getTitle());
		if(given)
	}

}
