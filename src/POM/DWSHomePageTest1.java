package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWSHomePageTest1 {
	public DWSHomePageTest1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//img[@alt='Tricentis Demo Web Shop']")
	    WebElement dwsimg;
	@FindBy(linkText = "Register")
		WebElement registerlink;
	@FindBy(linkText = "Log in")
		WebElement loginlink;
	@FindBy(linkText = "Shopping cart")
		WebElement shoppingcart;
	@FindBy(linkText = "Wishlist")
		WebElement wishlist;
	@FindBy(id="small-searchterms")
		WebElement searchField;
	@FindBy(xpath = "//input[@type='submit']")
		WebElement searchbutton;
	@FindBy(xpath = "(//a[@href='/books'])[1]")
		WebElement books;
	@FindBy(xpath = "(//a[@href='/computers'])[1]")
		WebElement computers;
	@FindBy(xpath = "(//a[@href='/electronics'])[1]")
		WebElement electronics;
	@FindBy(linkText = "Apparel & Shoes")
		WebElement apparelandshoes;
	@FindBy(xpath = "(//a[@href='/digital-downloads'])[1]")
		WebElement digitdownloads;
	@FindBy(xpath = "(//a[@href='/jewelry'])[1]")
		WebElement jewelry;
	@FindBy(linkText = "Gift Cards")
		WebElement giftcards;
	@FindBy(id = "newsletter-subscribe-button")
		WebElement subscribe;
	@FindBy(id = "pollanswers-1")
		WebElement communitypollexcelent;
	@FindBy(id = "pollanswers-2")
		WebElement communitypollgood;
	@FindBy(id = "pollanswers-3")
		WebElement communitypollpoor;
	@FindBy(id = "pollanswers-4")
		WebElement communitypollverybad;
}
