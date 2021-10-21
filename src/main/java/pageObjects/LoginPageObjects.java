package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Core.Base;

public class LoginPageObjects extends Base {
	
	
	// in this class we will store UI elements of Login page
	// we will implement PageFactory.initElement method to initialize the page elements
	// we will use @FinBy annotations to store UI WebElements
	// we will store UI elements as Private Webelements and access them
	// Through public methods and we will write the function inside the public methods.
	// this contractor will use to initialize the Webelements inside this POM class
	// we will create PageFactory.initElements method inside the constructor
	
	public LoginPageObjects() {
		PageFactory.initElements(driver, this);
		
	}
	// Page factory class provide an annotation @Findby to find UI elements
	// @Faindby = = driver.findElements()
	
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccount;
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement login;
	@FindBy(id = "input-email")
	private WebElement email;
	@FindBy(id = "input-password")
	private WebElement password;
	
	
	public void clickOnMyAccount() {
		myAccount.click();
		
	}

}
