package pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilityClass.BaseClass;

public class DashBoardPage extends BaseClass {
	
	        @FindBy(xpath="//h6[text()='Dashboard']")
			private WebElement dashboard;     
			@FindBy(xpath="//button[text()='Open Menu']")
			private WebElement menuButton;
			@FindBy(xpath="//a[text()='Logout']")
			private WebElement Logout;

			public DashBoardPage ()
			{
			    PageFactory.initElements(driver, this);
			}
			public String dashboardTitle()
			{
			    return dashboard.getText();
			}
			public void ClickOnMenu()
			{
			    menuButton.click();
			}
			public void ClickOnLogout()
			{
			    Logout.click();
			}
           }
