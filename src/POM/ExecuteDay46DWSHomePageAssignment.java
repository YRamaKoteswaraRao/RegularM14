package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExecuteDay46DWSHomePageAssignment {
	@Test
	public void reciever() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		DWSHomePageTest1 execute = new DWSHomePageTest1(driver);
		//execute.dwsimg.click();
		//execute.registerlink.click();
		//execute.loginlink.click();
		//execute.shoppingcart.click();
		//execute.wishlist.click();
		//execute.searchField.sendKeys("ram");
		//execute.searchbutton.click();
		execute.books.click();
		//execute.computers.click();
	//	execute.electronics.click();
		//execute.apparelandshoes.click();
	//	execute.digitdownloads.click();
		//execute.jewelry.click();
		//execute.giftcards.click();
		//execute.subscribe.click();
		//execute.communitypollexcelent.click();
		//execute.communitypollgood.click();
		//execute.communitypollpoor.click();
		//execute.communitypollverybad.click();
		driver.quit();
}
}
