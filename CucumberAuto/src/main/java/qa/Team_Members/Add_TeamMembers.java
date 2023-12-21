package qa.Team_Members;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class Add_TeamMembers {

	@FindBy(xpath="//android.widget.Button[@content-desc=\"ADD TEAM MEMBER\"]")
	private WebElement addTeamMember;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[2]/android.widget.EditText[1]")
	private WebElement firstName;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[2]/android.widget.EditText[2]")
	private WebElement lastName;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[2]/android.widget.EditText[3]")
	private WebElement email;
	@FindBy(xpath="//android.widget.ImageView[@content-desc=\"+91      \"]")
	private WebElement countrycode;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText")
	private WebElement countrycodesearch;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[2]/android.widget.EditText[4]")
	private WebElement phoneNo;
	@FindBy(xpath="//android.view.View[@content-desc=\"Timezone America/New_York\"]")
	private WebElement timezone;
	@FindBy(xpath="//android.widget.ImageView[@content-desc=\"Full time (W2)\"]")
	private WebElement employmentType;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.ImageView[3]")
	private WebElement startDate;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.EditText[2]")
	private WebElement jobTitle;
	@FindBy(xpath="//android.widget.ImageView[@content-desc=\"satish Kadam\"]")
	private WebElement reportTo;
	@FindBy(xpath="//android.widget.Button[@content-desc=\"CANCEL\"]")
	private WebElement cancle;
	@FindBy(xpath="//android.widget.Button[@content-desc=\"SAVE\"]")
	private WebElement save;
	@FindBy(xpath="//android.view.View[@content-desc=\"America/New_York\"]")
	private WebElement selecttimezone;

	@FindBy(xpath="(//android.view.View[@content-desc=\"Name can't be empty\"])[1]")
	private WebElement ErrorFirstname;
	@FindBy(xpath="(//android.view.View[@content-desc=\"Name can't be empty\"])[2]")
	private WebElement ErrorLastname;
	@FindBy(xpath="//android.view.View[@content-desc=\"Please enter a valid email Address\"]")
	private WebElement ErrorEmail;
	@FindBy(xpath="//android.view.View[@content-desc=\"Start date can't be empty\"]")
	private WebElement ErrorStartDate;
	@FindBy(xpath="//android.view.View[@content-desc=\"Job title can't be empty\"]")
	private WebElement ErrorJobTitle;
	@FindBy(xpath="//android.view.View[@content-desc=\"Please enter valid phone number\"]")
	private WebElement ErrorphoneNumber;
	
	
	AndroidDriver driver;


	public Add_TeamMembers( AndroidDriver driver)
	{
		PageFactory.initElements(driver, this);

		this.driver = driver;

	}
	public void clickOn_AddTeamMember() {
		addTeamMember.click();
	}
	public void enter_FirstName(String name1) {

		Actions a =new Actions(driver);
		a.moveToElement(firstName).click().perform();
		firstName.sendKeys(name1);
	}
	public void enter_LastName(String name1) {

		Actions a =new Actions(driver);
		a.moveToElement(lastName).click().perform();
		lastName.sendKeys(name1);
	}
	public void enter_Mail(String name1) {

		Actions a =new Actions(driver);
		a.moveToElement(email).click().perform();
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
	public void clickOn_ClickOncountry(String contendesc) {
		driver.findElement(By.xpath("//android.view.View[@content-desc='"+contendesc+"']")).click();

	}
	public void clickOn_SelectEmployeeToReport(String contendesc) {
		driver.findElement(By.xpath("//android.view.View[@content-desc='"+contendesc+"']")).click();

	}
	public String getSuccessMassage(String contendesc) {//satish Kadam
		 WebElement Success = driver.findElement(By.xpath("//android.view.View[@content-desc="+contendesc+" has been successfully added.']"));
		 String SuccessMassage = Success.getAttribute("content-desc");
		 return SuccessMassage;
	}
	public void enter_PhoneNo(String name1) {

		Actions a =new Actions(driver);
		a.moveToElement(phoneNo).click().perform();
		phoneNo.sendKeys(name1);
	}
	public void clickOn_Timezone() {
		timezone.click();
	}

	public void clickOn_selecttimezone() {
		selecttimezone.click();
	}
	public void clickOn_EmploymentType() {
		employmentType.click();
	}
	public void clickOn_StartDate() {
		startDate.click();
	}
	public void clickOn_jobTitle(String jobtitle) {
		Actions a =new Actions(driver);
		a.moveToElement(jobTitle).click().perform();
		jobTitle.sendKeys(jobtitle);

	}
	public void clickOn_reportTo() {
		reportTo.click();


	}
	public String getTeamMemberName (String contendesc) {
		WebElement project = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='"+contendesc+"']"));
		
		String massage = project.getAttribute("content-desc");
		return massage;
	}
	
	public String getErrorFirstname() {//Name can't be empty

		String massage = ErrorFirstname.getAttribute("content-desc");
		return massage;
	}
	public String getErrorLastname() {//Name can't be empty

		String massage = ErrorLastname.getAttribute("content-desc");
		return massage;
	}
	public String getErrorEmail() {//Please enter a valid email Address

		String massage = ErrorEmail.getAttribute("content-desc");
		return massage;
	}
	public String getErrorStartDate() {//Start date can't be empty

		String massage = ErrorStartDate.getAttribute("content-desc");
		return massage;
	}
	public String getErrorJobTitle() {//Job title can't be empty

		String massage = ErrorJobTitle.getAttribute("content-desc");
		return massage;
	}
	public String getErrorMoblieNumber() {//Please enter valid phone number

		String massage = ErrorphoneNumber.getAttribute("content-desc");
		return massage;
	}
	public void clickOn_Cancle() {
		cancle.click();
	}
	public void clickOn_Save() {
		save.click();
	}
}
