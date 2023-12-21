package qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class LoginPage {

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[2]")
	private WebElement email;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")
	private WebElement passWord;

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"LOGIN\"]")
	private WebElement Login;

	@FindBy(xpath = "//android.view.View[@content-desc=\"Forgot Password?\"]")
	private WebElement forgotPassword;

	@FindBy(xpath = "//android.view.View[@content-desc=\"Please enter a valid email Address\"]")
	private WebElement ErroremailId;
	
	@FindBy(xpath = "//android.view.View[@content-desc=\"Login Successful\"]")
	private WebElement loginSuccessFullmassage;
	

	@FindBy(xpath = "//android.view.View[@content-desc=\"Password cannot be blank\"]")
	private WebElement Errorepass;
	
	@FindBy(xpath = "//android.view.View[@content-desc=\"Bad credentials!\"]")
	private WebElement badcredentials;
	
	
	AndroidDriver driver;


	public LoginPage( AndroidDriver driver)
	{
		PageFactory.initElements(driver, this);

		this.driver = driver;

	}

	public void enter_email(String emails) {

		Actions a =new Actions(driver);
		a.moveToElement(email).click().perform();
		email.sendKeys(emails);
	}

	public void enter_password(String pass) {
		Actions a =new Actions(driver);
		a.moveToElement(passWord).click().perform();
		passWord.sendKeys(pass);
	}

	public void click_on_login_btn() {
		Login.click();
	}

	public String getLoginButtton() {

		String login = Login.getAttribute("clickable");
		return login;

	}

	//		Actions a =new Actions(driver);
	//		a.moveToElement(ErroremailId).click().perform();
	//		

	public String ErroremailId() {

		String acutalResult = ErroremailId.getAttribute("content-desc");
		return acutalResult;
	}
	public String Errorepass() {

		String acutalResult = 	Errorepass.getAttribute("content-desc");
		return acutalResult;
	}
	public String badCredentials() {

		String acutalResult = 	badcredentials.getAttribute("content-desc");
		return acutalResult;
	}


	public String loginSuccessFullmassage() {

		String acutalResult = loginSuccessFullmassage.getAttribute("content-desc");
		return acutalResult;
	}

}
