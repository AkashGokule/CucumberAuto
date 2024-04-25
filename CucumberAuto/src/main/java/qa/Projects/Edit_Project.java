package qa.Projects;

import javax.management.loading.PrivateClassLoader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class Edit_Project {

	@FindBy(xpath="//android.view.View[@content-desc=\"DemoProject\"]/android.widget.ImageView[3]")
	private WebElement edit_Project;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]")
	private WebElement name;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]")
	private WebElement deScription;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[5]")
	private WebElement status;
	@FindBy(xpath="//android.widget.Button[@content-desc=\"CANCEL\"]")
	private WebElement cancle;
	@FindBy(xpath="//android.widget.Button[@content-desc=\"SAVE\"]")
	private WebElement save;
	@FindBy(xpath="//android.view.View[@content-desc=\"Project name is empty!\"]")
	private WebElement ErrorProjectName;
	
	AndroidDriver driver;


	public Edit_Project( AndroidDriver driver)
	{
		PageFactory.initElements(driver, this);

		this.driver = driver;

	}
	public String getErrorProjectName() {//Project name is empty!

		String massage = ErrorProjectName.getAttribute("content-desc");
		return massage;
	}
	
	public void clickOn_Edit_Project(String edit_Projecttype) {//DemoProject
		
		 driver.findElement(By.xpath("//android.view.View[@content-desc='"+edit_Projecttype+"']/android.widget.ImageView[3]")).click();
		                            
	}
	public void enter_ProjectName(String name1) {
		Actions a =new Actions(driver);

		a.moveToElement(name).click().perform();
		name.clear();
		name.sendKeys(name1);
		
	}
	public void enter_ProjectdeScription(String name1)  {
		Actions a =new Actions(driver);
		a.moveToElement(deScription).click().perform();
		deScription.clear();
		deScription.sendKeys(name1);
		
	}
	public void clickOn_Status() {
		status.click();
	}
	public void clickOn_Cancle() {
		cancle.click();
	}
	public void clickOn_Save() {
		save.click();
	}
}
