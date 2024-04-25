package qa.Work_Schedules;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import io.appium.java_client.android.AndroidDriver;
import qa.Utility.Scroll;
import qa.Utility.Scroll.ScrollDiretion;


public class Add_WorkSchedule {
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"ADD WORK SCHEDULE\"]")
	private WebElement Add_WorkSchedule;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText")
	private WebElement name;
	
	@FindBy(xpath ="//android.widget.ImageView[@content-desc=\"0m\r\n"
			+ "8h\"]")
	private WebElement Hours1;
	
	@FindBy(xpath ="//android.widget.ImageView[@index='4']")
	private WebElement minute1;
	
	@FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Per day\r\n"
			+ "Per day\"]")
	private WebElement perDay;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"CANCEL\"]")
	private WebElement cancle;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"SAVE\"]")
	private WebElement save;
	
	@FindBy(xpath="//android.view.View[@content-desc=\"6h\"]")
	private WebElement HourseList1;
	
	@FindBy(xpath="//android.view.View[@content-desc=\"30m\"]")
	private WebElement minuteList1;
	
	@FindBy(xpath="//android.view.View[@content-desc=\"Name can't be empty\"]")
	private WebElement ErrorName;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.ImageView[1]")
	private WebElement effectivestartdate;
	
	AndroidDriver driver;


	public Add_WorkSchedule( AndroidDriver driver)
	{
		PageFactory.initElements(driver, this);

		this.driver = driver;

	}
	public String getErrorName() {//Name can't be empty

		String massage = ErrorName.getAttribute("content-desc");
		return massage;
	}
	public void clickOn_Add_WorkSchedule() {
		Add_WorkSchedule.click();
	}
	
	public void enter_WorkScheduleName(String name1) {
		Actions a =new Actions(driver);

		a.moveToElement(name).click().perform();
		
		name.sendKeys(name1);
		
	}
	
	public void clickOn_Hoursbox()  {
		
		Hours1.click();
		
		HourseList1.click();
		//Scroll.scrolltil(By.xpath("//android.view.View[@content-desc=\"12h\"]"));
		//Scroll.scrollNclick(By.xpath("//android.view.View"), "content-desc", "12h");
	}
	
	public void clickOn_Minute() {
		minute1.click();
		
		minuteList1.click();
		
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
	public void effectivestartdate() {
		effectivestartdate.click();
	}
	
	public void selectweekday(String contentdesc) {//Sun,Mon,Tue,Wed,Thu,Fri,Sat
		driver.findElement(By.xpath("//android.view.View[@content-desc='"+contentdesc+"']")).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
