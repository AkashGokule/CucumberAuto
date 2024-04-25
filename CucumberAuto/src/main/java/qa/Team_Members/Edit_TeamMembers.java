package qa.Team_Members;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class Edit_TeamMembers {


	@FindBy(id="//android.view.View[@content-desc=\"My profile\"]")
	private WebElement my_profile;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[2]/android.widget.EditText[1]")
	private WebElement firstName;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[2]/android.widget.EditText[2]")
	private WebElement lastName;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[2]/android.widget.EditText[3]")
	private WebElement email;
	@FindBy(xpath="//android.widget.ImageView[@index='6']")
	private WebElement countrycode;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText")
	private WebElement countrycodesearch;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[2]/android.widget.EditText[4]")
	private WebElement phoneNo;
	@FindBy(xpath="//android.widget.ImageView[@content-desc=\"America/New_York\"]")
	private WebElement timezone;
	@FindBy(xpath="//android.widget.ImageView[@content-desc=\"Full time (W2)\"]")
	private WebElement employmentType;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.ImageView[4]")
	private WebElement startDate;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.EditText[2]")
	private WebElement jobTitle;
	@FindBy(xpath="//android.widget.ImageView[@content-desc=\"satish kadam\"]")
	private WebElement reportTo;
	@FindBy(xpath="//android.widget.Button[@content-desc=\"CANCEL\"]")
	private WebElement cancle;
	@FindBy(xpath="//android.widget.Button[@content-desc=\"SAVE\"]")
	private WebElement save;
	
	@FindBy(xpath="//android.view.View[@index='0']")
	private WebElement ClickOncountry;

	
	AndroidDriver driver;


	public Edit_TeamMembers( AndroidDriver driver)
	{
		PageFactory.initElements(driver, this);

		//this.driver = driver;

	}
	
	public void clickOn_My_profile() {
		my_profile.click();
	}
	public void enter_FirstName(String name1) {
		
		Actions a =new Actions(driver);
		a.moveToElement(firstName).click().perform();
		firstName.clear();
		firstName.sendKeys(name1);
	}
	public void enter_LastName(String name1) {
		
		Actions a =new Actions(driver);
		a.moveToElement(lastName).click().perform();
		lastName.clear();
		lastName.sendKeys(name1);
	}
	public void enter_Mail(String name1) {
		
		Actions a =new Actions(driver);
		a.moveToElement(email).click().perform();
		email.clear();
		email.sendKeys(name1);
	}
	public void clickOn_Countrycode() {
		countrycode.click();
	}
	public void clickOn_countrycodesearch(String contrycode) {
		Actions a =new Actions(driver);
		a.moveToElement(countrycodesearch).click().perform();
		countrycodesearch.sendKeys(contrycode);
	}
	public void clickOn_ClickOncountry() {
		ClickOncountry.click();
	}
	
	public void enter_PhoneNo(String name1) {
		
		Actions a =new Actions(driver);
		a.moveToElement(phoneNo).click().perform();
		phoneNo.clear();
		phoneNo.sendKeys(name1);
	}
	public void clickOn_Timezone() {
		timezone.click();
	}
	public void clickOn_EmploymentType() {
		employmentType.click();
	}
	public void clickOn_StartDate() {
		startDate.click();
	}
	public void clickOn_jobTitle() {
		jobTitle.click();
	}
	public void clickOn_reportTo() {
		reportTo.click();
	}
	public void clickOn_Cancle() {
		cancle.click();
	}
	public void clickOn_Save() {
		save.click();
	}
}
