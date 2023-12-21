package qa.Team_Members;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class Leaves {
	@FindBy(xpath="//android.widget.Button[@content-desc=\"ASSIGN LEAVE TYPE\"]")
	private WebElement assignLeaveType;
	@FindBy(xpath="//android.widget.ImageView[@index='0']")
	private WebElement leaveType;
	@FindBy(xpath="//android.view.View[@index='1']/android.widget.EditText")
	private WebElement leaveBalance;
	@FindBy(xpath="//android.view.View[@content-desc=\"Paid Leave\"]")
	private WebElement leavesdetails;
	
	@FindBy(xpath="//android.widget.Button[@content-desc=\"CANCEL\"]")
	private WebElement cancle;
	@FindBy(xpath="//android.widget.Button[@content-desc=\"SAVE\"]")
	private WebElement save;
	@FindBy(xpath="//android.view.View[@content-desc=\"Leave type can't be empty\"]")
	private WebElement ErrorLeaveBalance;
	
	AndroidDriver driver;


	public Leaves( AndroidDriver driver)
	{
		PageFactory.initElements(driver, this);

		this.driver = driver;

	}
	public String getErrorLeaveBalance() {//Leave type can't be empty

		String massage = ErrorLeaveBalance.getAttribute("content-desc");
		return massage;
	}
	public void clickOn_assignLeaveType() {
		assignLeaveType.click();
	}

	public void clickOn_selectleaveType(String contendesc) {
		driver.findElement(By.xpath("//android.view.View[@content-desc='"+contendesc+"']")).click();
		
	}
	
	public void enter_leaveBalance(String name1) {
		Actions a =new Actions(driver);
		a.moveToElement(leaveBalance).click().perform();
		leaveBalance.sendKeys(name1);

	}
	
	public void clickOn_leavesdetails(String contendesc ) {
		driver.findElement(By.xpath("//android.view.View[@content-desc='"+contendesc+"']")).click();//Paid Leave ,Unpaid Leave Used: 0.00d ,	
		// is negative balance allowed , is balance tracked
		
	}
	public void clickOn_Cancle() {
		cancle.click();
	}
	public void clickOn_Save() {
		save.click();
	}
	
	
}
