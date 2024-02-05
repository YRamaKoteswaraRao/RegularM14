package TestNGPrograms;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderSenderAndReceiver extends BaseClass{
@DataProvider(name="login")
public Object[][] sender(){
	Object[][] obj=new Object[2][2];
	obj[0][0]="yramrao99@gmail.com";
	obj[0][1]="12345";
	obj[1][0]="yramrao99@gmail.com";
	obj[1][1]="1234";
	return obj;
}
@Test(dataProvider = "login")
	public void receiver(String email,String password) {
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
}

