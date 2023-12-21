package pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilityClass.BaseClass;

public class OHRMLoginPage extends BaseClass{

	
	         @FindBy (xpath="//input[@name='username']")
			 private WebElement UsernameField ;

			@FindBy (xpath="//input[@name='password']")
			 private WebElement PasswordField ;

			 @FindBy (xpath ="//button[@type='submit']")
			 private WebElement LoginButton; 

			 @FindBy (xpath="//span[text()='Required']")
			 private WebElement ErrorMassage ;

	
	
	
	
	 public OHRMLoginPage()
	 {

	     PageFactory.initElements(driver, this); // Initialize the elements
	 }


	 public void EnterUsername(String username)
	 {
	     UsernameField.sendKeys(username);
	 }

	 public void EnterPassword(String password)
	 {
	     PasswordField.sendKeys(password);
	 }

	 public void ClickLoginButton()
	 {
	     LoginButton.click();
	 }

	 public String GetErrormassageU()
	 {
	     return ErrorMassage.getText();

	 }
	
	
	
	
	
	
}
