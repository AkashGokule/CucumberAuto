package qa.Utility;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.appium.java_client.android.AndroidDriver;
import qa.TestBase.TestBase;

public class TimePickerWheelEdit extends TestBase{

	String contentdesc_fh;
	String contentdesc_fm;
	String contentdesc_fampm;
	String contentdesc_th;
	String contentdesc_tm;
	String contentdesc_tampm;

	private WebElement from_Hourse;
	private WebElement from_minute;
	private WebElement from_Am_pm;
	private WebElement to_Hourse;
	private WebElement to_minute;
	private WebElement to_Am_pm ;

	AndroidDriver driver;
	
public TimePickerWheelEdit (AndroidDriver driver) {
	this.driver=driver;
	

}




	public void clickOn_from_Hourse(String contentdesc_fh ,String savehours) {
		
		
		  
		  int i=0;
	        String leftStopHour=contentdesc_fh;
	        while(true) {
	        	
	        	int fromHour = (Integer.parseInt(savehours) + i) % 12;
	        	if (fromHour == 0) {
	        	    fromHour = 12;
	        	}
	        	String fromHourStr = String.format("%02d", fromHour);
	        	System.out.println("hour hand: " + fromHourStr);
	    		from_Hourse=driver.findElement(By.xpath("(//android.view.View[@content-desc='"+fromHourStr+"'])[1]"));
	    		Actions a =new Actions(driver);
	    		a.moveToElement(from_Hourse).click().perform();
	           
	            i++;
	            System.out.print("left"+leftStopHour+"from"+fromHourStr+leftStopHour.equals(fromHourStr));
	            System.out.println();
	            if(leftStopHour.equals(fromHourStr)) break;
	        }
	        
//		this. contentdesc_fh= contentdesc_fh;
//		from_Hourse=driver.findElement(By.xpath("(//android.view.View[@content-desc='"+contentdesc_fh+"'])[1]"));
//		Actions a =new Actions(driver);
//		a.moveToElement(from_Hourse).click().perform();		
//      from_Hourse.sendKeys(contentdesc_fh);
	}
	public void clickOn_from_minute(String contentdesc_fm ,String saveMin) {
		
		
		  int i=0;
	        String leftStopHour=contentdesc_fm;
	        
	        while(true) {
	        	
	        	int fromHour = (Integer.parseInt(saveMin) + i) % 60;
     	
	        	String fromHourStr = String.format("%02d", fromHour);
	        	System.out.println("hour hand: " + fromHourStr);

	        	
	    		from_Hourse=driver.findElement(By.xpath("(//android.view.View[@content-desc='"+fromHourStr+"'])[1]"));
	    		Actions a =new Actions(driver);
	    		a.moveToElement(from_Hourse).click().perform();
	           
	            i++;
	            System.out.print("left"+leftStopHour+"from"+fromHourStr+leftStopHour.equals(fromHourStr));
	            
	            System.out.println();
	            if(leftStopHour.equals(fromHourStr)) break;
	        }
		

		
//		from_minute=driver.findElement(By.xpath("(//android.view.View[@content-desc='"+contentdesc_fm+"'])[1]"));
//		Actions a =new Actions(driver);
//		a.moveToElement(from_minute).click().perform();
		//from_minute.sendKeys(contentdesc_fm);
	}
	public void clickOn_from_Am_pm(String contentdesc_fampm) {
		this. contentdesc_fampm= contentdesc_fampm;
		from_Am_pm=driver.findElement(By.xpath("(//android.view.View[@content-desc='"+contentdesc_fampm+"'])[1]"));
		Actions a =new Actions(driver);
		a.moveToElement(from_Am_pm).click().perform();
		from_Am_pm.sendKeys(contentdesc_fampm);
	}
	public void clickOn_to_Hourse(String contentdesc_th ,String savehours) {
		
		
		 
		
		  int i=1;
	        String RightStopHour=contentdesc_th;
	        
	        while(true) {
	        	
	        	int fromHour = (Integer.parseInt(savehours) + i) % 12;
	        	
	        	if (fromHour == 0) {
	        	    fromHour = 12;
	        	}
	        	String fromHourStr = String.format("%02d", fromHour);
	        	
	        	System.out.println("hour hand: " + fromHourStr);

	        	to_Hourse=driver.findElement(By.xpath("(//android.view.View[@content-desc='"+fromHourStr+"'])[2]"));
	    		Actions a =new Actions(driver);
	    		a.moveToElement(to_Hourse).click().perform();
	           
	    		
	            i++;
	            
	            System.out.print("Right"+RightStopHour+"from"+fromHourStr+RightStopHour.equals(fromHourStr));
	            System.out.println();
	            if(RightStopHour.equals(fromHourStr)) break;
	            
	            
	        }
		
//		this. contentdesc_th= contentdesc_th;
//		to_Hourse=driver.findElement(By.xpath("(//android.view.View[@content-desc='"+contentdesc_th+"'])[2]"));
//		Actions a =new Actions(driver);
//		a.moveToElement(to_Hourse).click().perform();
//		to_Hourse.sendKeys(contentdesc_th);
	}
	public void clickOn_to_minute(String TargetTime ,String saveMin) {
		
		
		  int i=0;
	        String RightStopHour=TargetTime;
	        
	        while(true) {
	        	
	        	int fromMin = (Integer.parseInt(saveMin) +i) % 60;
	        	
	        	String fromminStr = String.format("%02d", fromMin);
	        	System.out.println("hour hand: " + fromminStr);

	        	
	    		from_Hourse=driver.findElement(By.xpath("(//android.view.View[@content-desc='"+fromminStr+"'])[2]"));
	    		Actions a =new Actions(driver);
	    		a.moveToElement(from_Hourse).click().perform();
	           
	            i++;
	            System.out.print("Right"+RightStopHour+"from"+fromminStr+RightStopHour.equals(fromminStr));
	            System.out.println();
	            if(RightStopHour.equals(fromminStr)) break;
	        }
		
		
		
		
		
//		this. contentdesc_tm= contentdesc_tm;
//		to_minute=driver.findElement(By.xpath("(//android.view.View[@content-desc='"+contentdesc_tm+"'])[2]"));
//		Actions a =new Actions(driver);
//		a.moveToElement(to_minute).click().perform();
//		to_minute.sendKeys(contentdesc_tm);
	}
	public void clickOn_to_Am_pm(String contentdesc_tampm) {
		this. contentdesc_tampm= contentdesc_tampm;
		to_Am_pm=driver.findElement(By.xpath("(//android.view.View[@content-desc='"+contentdesc_tampm+"'])[2]"));
		Actions a =new Actions(driver);
		a.moveToElement(to_Am_pm).click().perform();
		to_Am_pm.sendKeys(contentdesc_tampm);
	}


	

	
	
	
}

