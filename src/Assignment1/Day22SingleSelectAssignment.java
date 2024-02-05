package Assignment1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Day22SingleSelectAssignment {
public static void main(String[] args) throws InterruptedException {
	String given_url="https://en-gb.facebook.com/";
	String given_signup_page="Sign Up";
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://en-gb.facebook.com/");
	String current_url=driver.getCurrentUrl();
	if(given_url.equals(current_url))  {
		System.out.println("Your in FaceBook Home page");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(1000);
		WebElement signup_page = driver.findElement(By.xpath("//div[text()='Sign Up']"));
		Thread.sleep(1000);
		String current_signup_page=signup_page.getText();
		Thread.sleep(1000);
		if(given_signup_page.equals(current_signup_page)) {
			System.out.println("Your in Create a new account page");
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("[name='firstname']")).sendKeys("Ram");
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("[name='lastname']")).sendKeys("Rao");
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("[name='reg_email__']")).sendKeys("987654321");
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("[id='password_step_input']")).sendKeys("123456789");
			Thread.sleep(1000);
			WebElement day_select = driver.findElement(By.cssSelector("select[id='day']"));
			Thread.sleep(1000);
			Select s_ref=new Select(day_select);
			Thread.sleep(1000);
			s_ref.selectByIndex(10);
			Thread.sleep(1000);
			WebElement month_select = driver.findElement(By.cssSelector("select[id='month']"));
			Thread.sleep(1000);
			Select s_ref1=new Select(month_select);
			Thread.sleep(1000);
			s_ref1.selectByVisibleText("Nov");
			Thread.sleep(1000);
			WebElement year_select = driver.findElement(By.cssSelector("select[id='year']"));
			Thread.sleep(1000);
			Select s_ref2=new Select(year_select);
			Thread.sleep(1000);
			s_ref2.selectByValue("2003");
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("input[value='2']")).click();
			Thread.sleep(5000);
			driver.findElement(By.cssSelector("button[name='websubmit']")).click();
			Thread.sleep(1000);
			driver.close();		
		}
		else
			System.out.println("Your not in Create a new account page");
	}
	else
		System.out.println("Your not in FaceBook Home page");	
}
}
