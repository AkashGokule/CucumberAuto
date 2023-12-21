package qa.Team_Members;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import qa.Utility.Scroll;

public class Associated_WorkSchedule {
	@FindBy(xpath="//android.widget.ImageView[@index='5']")
	private WebElement workschedule;
	@FindBy(xpath="//android.widget.ImageView[@content-desc=\"Regular\"]")
	private WebElement workSchedule;
	@FindBy(xpath="//android.widget.Button[@content-desc=\"CANCEL\"]")
	private WebElement cancle;
	@FindBy(xpath="//android.widget.Button[@content-desc=\"SAVE\"]")
	private WebElement save;
	@FindBy(xpath="//android.view.View[@content-desc=\"Changed selection of work schedule will not be applied to existing time-entries!\"]")
	private WebElement InfoMassage;
	
	AndroidDriver driver;


	public Associated_WorkSchedule( AndroidDriver driver)
	{
		PageFactory.initElements(driver, this);

		this.driver = driver;

	}
	public String getInfoMassage() {//Changed selection of work schedule will not be applied to existing time-entries!

		String massage = InfoMassage.getAttribute("content-desc");
		return massage;
	}
	public void Select_Workschedule() {
		workschedule.click();
	}
	public void clickOn_WorkSchedule() {
		Scroll.scrolltil(By.xpath("//android.view.View[@content-desc=\"Marvel\"]"));
	}
	public void clickOn_Cancle() {
		cancle.click();
	}
	public void clickOn_Save() {
		save.click();
	}
}
