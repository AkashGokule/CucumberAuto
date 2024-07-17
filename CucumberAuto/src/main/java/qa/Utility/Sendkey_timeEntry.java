package qa.Utility;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import qa.TestBase.TestBase;


public class Sendkey_timeEntry extends TestBase {


	String currentTime = driver.getDeviceTime();
	LocalDateTime dateTime = LocalDateTime.parse(currentTime, DateTimeFormatter.ISO_DATE_TIME);

	public void clickOn_from_Am_pm(String contentdesc_fampm) {
		
		WebElement from_Am_pm=driver.findElement(By.xpath("(//android.view.View[@content-desc='"+contentdesc_fampm+"'])[1]"));
		Actions a =new Actions(driver);
		a.moveToElement(from_Am_pm).click().perform();
		from_Am_pm.sendKeys(contentdesc_fampm);
	}
	public void clickOn_to_Am_pm(String contentdesc_tampm) {
		
		WebElement	to_Am_pm=driver.findElement(By.xpath("(//android.view.View[@content-desc='"+contentdesc_tampm+"'])[2]"));
		Actions a =new Actions(driver);
		a.moveToElement(to_Am_pm).click().perform();
		to_Am_pm.sendKeys(contentdesc_tampm);
		
	}

	public  void first_Hourse(String hourse1) throws InterruptedException  {
		Actions a =new Actions(driver);
		String hours = dateTime.format(DateTimeFormatter.ofPattern("hh", Locale.getDefault()));
		//			enter hours in from field
		String xpathhours = "//android.view.View[@content-desc='" + hours + "']";	        
		WebElement fromhr = driver.findElement(By.xpath(xpathhours));
		a.click(fromhr).perform();

		String inputValue = hours;
		if (inputValue.startsWith("0") && inputValue.length() > 1) {
			inputValue = inputValue.substring(1);
		}
		WebElement minute = driver.findElement(By.xpath("//android.widget.EditText[@text='" + inputValue + "']"));

		minute.sendKeys(Keys.BACK_SPACE);	
		Thread.sleep(2000);
		minute.sendKeys(hourse1);
		



	}
	public   void first_minute(String minute1) throws InterruptedException {
	
		Actions a =new Actions(driver);
		String hours = dateTime.format(DateTimeFormatter.ofPattern("mm", Locale.getDefault()));
		String inputValue = hours;
		if (inputValue.startsWith("0") && inputValue.length() > 1) {
			inputValue = inputValue.substring(1);
		}
		WebElement minute = driver.findElement(By.xpath("//android.widget.EditText[@text='" + inputValue + "']"));
		a.click(minute).perform();
		minute.sendKeys(Keys.BACK_SPACE);	
		Thread.sleep(2000);
		minute.sendKeys(minute1);
		


	}
	public  void second_Hourse(String hourse2) throws InterruptedException {
		Actions a =new Actions(driver);
		String hours = dateTime.format(DateTimeFormatter.ofPattern("hh", Locale.getDefault()));
		//			enter hours in from field
		String xpathhours = "//android.view.View[@content-desc='" + hours + "']";	        
		WebElement fromhr = driver.findElement(By.xpath(xpathhours));
		a.click(fromhr).perform();

		String inputValue = hours;
		if (inputValue.startsWith("0") && inputValue.length() > 1) {
			inputValue = inputValue.substring(1);
		}
		WebElement minute = driver.findElement(By.xpath("//android.widget.EditText[@text='" + inputValue + "']"));
		
		minute.sendKeys(Keys.BACK_SPACE);	
		Thread.sleep(2000);
		minute.sendKeys(hourse2);	
	



	}

	public  void second_minute(String minute2) throws InterruptedException {
		Actions a =new Actions(driver);
		String hours = dateTime.format(DateTimeFormatter.ofPattern("mm", Locale.getDefault()));
		String inputValue = hours;
		if (inputValue.startsWith("0") && inputValue.length() > 1) {
			inputValue = inputValue.substring(1);
		}
		WebElement minute = driver.findElement(By.xpath("//android.widget.EditText[@text='" + inputValue + "']"));
		a.click(minute).perform();
		minute.sendKeys(Keys.BACK_SPACE);	
		Thread.sleep(2000);
		minute.sendKeys(minute2);
		
		




	}

}



