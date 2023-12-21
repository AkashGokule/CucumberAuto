package pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilityClass.BaseClass;

public class RecruitmentPage extends BaseClass{
	
	         @FindBy(xpath = "//span[text()='Recruitment']")
			 private WebElement Recruitment ;
			 @FindBy(xpath = "//input[@placeholder='Type for hints...']")
			 private WebElement  CandidateName;
			 @FindBy(xpath = "//div[text()='Christopher  Bui']")
			 private WebElement Name;
			 @FindBy(xpath = "//button[text()=' Search ']")
			 private WebElement Search ;
			 @FindBy(xpath = "(//div[text()='-- Select --'])[4]")
			 private WebElement Status ;
			 @FindBy(xpath="(//div[text()='Application Initiated'])[1]")
			 private WebElement ApplicationInitiated ; 

			 public RecruitmentPage()
			 {
			     PageFactory.initElements(driver, this);
			 }

			 public void enterCandidateName(String candidateName)
			 {
			     CandidateName.sendKeys(candidateName);
			 }

			 public void ClickRecruitment()
			 {
			     Recruitment.click();
			 }
			 public void ClickSearch()
			 {
			     Search.click();
			 }
			 public String GetSearchName()
			 {
			     String name = Name.getText();
			    
			     return name;
			 }
			 public void clickonStatus()
			 {
			     Status.click();
			 }
			 public void clickonApplicationInitiated()
			 {
			     ApplicationInitiated.click();
			 }
}
