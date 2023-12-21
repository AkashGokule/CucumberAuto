package qa.Utility;

import java.util.Calendar;

import org.openqa.selenium.By;

import qa.TestBase.TestBase;


public class Calendors extends TestBase{

	public static int targetDay=0, targetMonth=0, targetYear=0;

	public static int currentDay=0,currentMonth=0, currentYear=0;

	public static int jumpToMonth=0;
	

	public static boolean increment=true;




	public static void calendorForTimeSheet(String dateToSet , String Contentdese) throws InterruptedException  {
		
		//String dateToSet = "26/06/2623";
	
	      getCurrentDateMonthAndYear();

		System.out.println(currentDay +" " + currentMonth +" "+ currentYear);

		getTargetDateMonthAndYear(dateToSet) ;

		System.out.println(targetDay +" "+ targetMonth +" "+ targetYear);


		calculateHowManyMonthsToJump();

		System.out.println(jumpToMonth);

		//driver.findElement(By.xpath("")).click();//click on date button


		for (int i=0 ;i<jumpToMonth; i++) {

			if (increment) {
				driver. findElement (By. xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.ImageView[4]")).click();//forword arrow xpath
			}
			else
			{
				driver.findElement(By. xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.ImageView[3]")).click();//backword arrow xpath
			}
			Thread.sleep(1000);
		}
			//driver.findElement(By.id("12, Thursday, October 12, 2023")).click(); //target element xpath
		 driver. findElement (By.xpath("//android.view.View[@content-desc='"+Contentdese+"']")).click();
		 
	}

	public static void calendorForLeaves(String dateToSet , String Contentdese) throws InterruptedException  {
		
		//String dateToSet = "26/06/2623";
	
	      getCurrentDateMonthAndYear();

		System.out.println(currentDay +" " + currentMonth +" "+ currentYear);

		getTargetDateMonthAndYear(dateToSet) ;

		System.out.println(targetDay +" "+ targetMonth +" "+ targetYear);


		calculateHowManyMonthsToJump();

		System.out.println(jumpToMonth);

		//driver.findElement(By.xpath("")).click();//click on date button


		for (int i=0 ;i<jumpToMonth; i++) {

			if (increment) {
				driver. findElement (By. xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.ImageView[5]")).click();//forword arrow xpath
			}
			else
			{
				driver.findElement(By. xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.ImageView[4]")).click();//backword arrow xpath
			}
			Thread.sleep(1000);
		}
			//driver.findElement(By.id("12, Thursday, October 12, 2023")).click(); //target element xpath
		 driver. findElement (By.xpath("//android.view.View[@content-desc='"+Contentdese+"']")).click();
		 
	}
public static void calendorForWeeklyAndDailyFilter(String dateToSet , String Contentdese) throws InterruptedException  {
		
		//String dateToSet = "26/06/2623";

		getCurrentDateMonthAndYear();

		System.out.println(currentDay +" " + currentMonth +" "+ currentYear);

		getTargetDateMonthAndYear(dateToSet) ;

		System.out.println(targetDay +" "+ targetMonth +" "+ targetYear);


		calculateHowManyMonthsToJump();

		System.out.println(jumpToMonth);

		//driver.findElement(By.xpath("")).click();//click on date button


		for (int i=0 ;i<jumpToMonth; i++) {

			if (increment) {
				driver. findElement (By. xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.Button[2]")).click();//forword arrow xpath
			}
			else
			{
				driver.findElement(By. xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.Button[1]")).click();//backword arrow xpath
			}
			Thread.sleep(1000);
		}
			//driver.findElement(By.id("12, Thursday, October 12, 2023")).click(); //target element xpath
		 driver. findElement (By.xpath("//android.view.View[@content-desc='"+Contentdese+"']")).click();
		 
	}


	public static void calculateHowManyMonthsToJump() {


		if ((targetMonth-currentMonth)>0) {

			jumpToMonth= targetMonth-currentMonth ;
		}

		else {

			jumpToMonth = currentMonth-targetMonth;

			increment = false;
		}
	}

	public static void getTargetDateMonthAndYear (String dateToset) {

		int firstIndex= dateToset.indexOf("/");
		int lastIndex= dateToset.lastIndexOf("/");
		String day=dateToset.substring(0, firstIndex);
		String month=dateToset.substring(firstIndex+1, lastIndex);
		String year = dateToset.substring(lastIndex+1,dateToset.length());
		targetDay= Integer.parseInt(day);
		targetMonth= Integer.parseInt(month);
		targetYear= Integer.parseInt(year);
	}

	public static void getCurrentDateMonthAndYear() {

		Calendar cal= Calendar.getInstance();
		currentDay= cal. get (Calendar.DAY_OF_MONTH);
		currentMonth= cal.get (Calendar.MONTH) +1;
		currentYear= cal.get (Calendar.YEAR);
	}
	
	
	public static void monthlyCalender(int monthindex) {//Index start :0 For jan
		
	driver.findElement(By.xpath("//android.view.View[@index='"+ monthindex +"']")).click();
		
		
	}
	
	
}


