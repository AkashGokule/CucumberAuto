package qa.Work_Schedules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.android.AndroidDriver;

public class Edit_WorkSchedule {

	@FindBy(xpath = "(//android.view.View[@content-desc=\"akash\"])[1]/android.widget.ImageView[2]")
	private WebElement edit_WorkSchedule;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText")
	private WebElement name;
	
	@FindBy(xpath = "//android.widget.ImageView[@index='4']")
	private WebElement Hours;
	
	@FindBy(xpath = "//android.widget.ImageView[@index='5']")
	private WebElement minute;
	
	@FindBy(xpath = "")
	private WebElement perDay;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"CANCEL\"]")
	private WebElement cancle;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"SAVE\"]")
	private WebElement save;
	
	@FindBy(xpath="//android.view.View[@content-desc=\"5h\"]")
	private WebElement HourseList;
	
	@FindBy(xpath="//android.view.View[@content-desc=\"30m\"]")
	private WebElement minuteList;
	@FindBy(xpath="//android.view.View[@content-desc=\"Name can't be empty\"]")
	private WebElement ErrorName;
	
	AndroidDriver driver;


	public Edit_WorkSchedule( AndroidDriver driver)
	{
		PageFactory.initElements(driver, this);

		this.driver = driver;

	}
	public String getErrorName() {//Name can't be empty

		String massage = ErrorName.getAttribute("content-desc");
		return massage;
	}
	public void clickOn_Edit_WorkSchedule() {
		edit_WorkSchedule.click();
		//driver.findElement(By.xpath("(//android.view.View[@content-desc='"+workschedule+"'])[1]/android.widget.ImageView[2]")).click();
	}
	public String getWorkScheduleName (String contendesc) {
		WebElement workSchedule = driver.findElement(By.xpath("(//android.view.View[@content-desc='"+contendesc+"'])[1]"));
		
		String massage = workSchedule.getAttribute("content-desc");
		return massage;
	}
	public void enter_WorkScheduleName(String name1) {
		Actions a =new Actions(driver);

		a.moveToElement(name).click().perform();
		name.clear();
		
		name.sendKeys(name1);
		
	}
	
	public void clickOn_Hoursbox() {
		Hours.click();
		
		HourseList.click();
	}
	
	public void clickOn_Minute() {
		minute.click();
		
		minuteList.click();
	}
	public void clickOn_perday() {
		perDay.click();
	}
	
	public void clickOn_Cancle() {
		cancle.click();
	}
	
	public void clickOn_save() {
		save.click();
	}
	
	
	
	
}
