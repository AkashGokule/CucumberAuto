package qa.Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class Add_TimeEntry {
	
	
	
	@FindBy(xpath="//android.view.View[@content-desc=\"DemoTask\"]/android.widget.ImageView[2]")
	private WebElement view_task;
	
	@FindBy(xpath="//android.widget.ImageView[@content-desc=\"ADD\"]")
	private WebElement add_button;
	
	@FindBy(xpath="//android.widget.Button[@content-desc=\"CANCEL\"]")
	private WebElement cancle;
	
	@FindBy(xpath="//android.widget.Button[@content-desc=\"SAVE\"]")
	private WebElement save;
	
	//private WebElement EditTimeEntry;
	@FindBy(xpath="//android.widget.Button[@content-desc=\"SUBMIT\"]")
	private WebElement submit;
	@FindBy(xpath="//android.view.View[@content-desc=\"Your draft timesheet for the selected period has been submitted!\"]")
	private WebElement InfomassageInMyTimeSheet;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[7]")
	private WebElement InfomassageInProject;
	AndroidDriver driver;
	
	public Add_TimeEntry( AndroidDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;

	}
	public void clickOn_EditTimeEntry(String contendesc) {

			driver.findElement(By.xpath("//android.view.View[@content-desc='"+contendesc+"']/android.widget.ImageView[1]")).click();
		
	}
public String getSubmitInfomassageInProject() {
	
	//Your draft timesheet for "DemoTask" has been submitted! 
	 String massage = InfomassageInProject.getAttribute("content-desc");
	 return massage;
	}
public String getSubmitInfomassageInMyTimeSheet() {// Your draft timesheet for the selected period has been submitted!
	 String massage = InfomassageInMyTimeSheet.getAttribute("content-desc");
	 return massage;
	}
	public void clickOn_view_task() {
		view_task.click();
		
	}
	public void clickOn_add_button() {
		add_button.click();
	}
	public void clickOn_SubmitButton() {
		submit.click();
	}
	public void clickOn_Cancle() {
		cancle.click();
	}
	public void clickOn_Save() {
    save.click();
    
	}
}
