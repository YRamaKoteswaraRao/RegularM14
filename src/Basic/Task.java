package Basic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
		public static void main(String[] args) {
			//open the browser
			WebDriver driver=new ChromeDriver();
			//maximize the browser
			driver.manage().window().maximize();
			driver.navigate().to("https://demowebshop.tricentis.com/");
			String current_titleKtm=driver.getTitle();
			System.out.println((current_titleKtm));
			driver.get("http://www.redbus.in/");
			
			
		}

	}



