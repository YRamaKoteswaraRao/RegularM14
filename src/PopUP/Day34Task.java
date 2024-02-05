package PopUP;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Day34Task {
	public static void main(String[] args) throws AWTException, InterruptedException {
		String given_url="https://the-internet.herokuapp.com/basic_auth";
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		Robot r=new Robot();
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_A);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_D);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_M);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_I);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_N);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_A);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_D);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_M);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_I);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_N);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_D);
		r.keyRelease(KeyEvent.VK_M);
		r.keyRelease(KeyEvent.VK_I);
		r.keyRelease(KeyEvent.VK_N);;
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_ENTER);
		String current_url=driver.getCurrentUrl();
		if (given_url.equals(current_url)) {
			System.out.println("Congratulations! You must have the proper credentials.");
		} else {
            System.out.println("You not Proper credentials.");
		}
	}

}
