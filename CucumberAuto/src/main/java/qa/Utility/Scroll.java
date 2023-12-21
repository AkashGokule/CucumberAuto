package qa.Utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;


import com.google.common.collect.ImmutableList;


import io.appium.java_client.AppiumDriver;
import qa.TestBase.TestBase;

public class Scroll extends TestBase {

		public static void scrollUp() {
	
			Dimension size = driver.manage().window().getSize();
	
	
			Point midpoint =new Point((int)(size.width*0.5),(int)(size.height*0.5));
	
			int bottom = midpoint.y+(int)(midpoint.y*1.100);
			int top = midpoint.y-(int)(midpoint.y*1.100);
	
			Point start =new Point(midpoint.x,bottom);
			Point end =new Point(midpoint.x,top);
	
			swipeup(start,end,Duration.ofMillis(300));
		}
	
		public static void swipeup (Point start,Point end, Duration duration) {
	
			PointerInput input = new PointerInput(PointerInput.Kind.TOUCH,"finger1");
			Sequence swipe =new Sequence(input, 0);
	
			swipe.addAction(input.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), start.x, start.y));
			swipe.addAction(input.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
	
	
			swipe.addAction(input.createPointerMove(duration, PointerInput.Origin.viewport(), end.x, end.y));
			swipe.addAction(input.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
	
			((AppiumDriver)Scroll.driver).perform(ImmutableList.of(swipe));
	
	
		}
	
	static double SCROLL_RATIO=0.5;
	public static void scrollNclick(By listitem,String attrName, String text) throws InterruptedException {
		
		String  prepageSource ="";
		boolean flag=false;
		while (!isEndofPage(prepageSource)) {
			prepageSource =TestBase.driver.getPageSource();
		
		for (WebElement el:TestBase.driver.findElements(listitem)) {
			
			if(el.getAttribute(attrName).equalsIgnoreCase(text)) {
				el.click();
				flag=true;
				break;
			}
		}
		
		if(flag) 
			break;
		
		else 
			scroll(ScrollDiretion.DOWN,SCROLL_RATIO);
			
		Thread.sleep(2000);
		
		}
		
	}
	
	//for perticular element
	
    public static void scrolltil(By ele) {
    	
    
    	String  prepageSource ="";
	//	boolean flag=false;
		while (!isEndofPage(prepageSource)) {
			prepageSource =TestBase.driver.getPageSource();
			
			try {
				TestBase.driver.findElement(ele).click();
				
			}
			catch(org.openqa.selenium.NoSuchElementException e) {
				scroll(ScrollDiretion.DOWN,SCROLL_RATIO);
			}
			
	}
    }
    
    
    public static boolean isEndofPage(String pageSource) {
    	return pageSource.equals(TestBase.driver.getPageSource());
    }

	public enum ScrollDiretion{
		Up,DOWN,LEFT,RIGHT
	}


	public static void scroll(ScrollDiretion dir,double scrollRatio) {
		Duration SCROLL_DUR= Duration.ofMillis(300);

		if(scrollRatio<0||scrollRatio>1) {
			throw new Error("Scroll distance must be Between 0 And 1");
		}

		Dimension size = driver.manage().window().getSize();

		Point midpoint =new Point((int)(size.width*0.5),(int)(size.height*0.5));

		int bottom = midpoint.y+(int)(midpoint.y*scrollRatio);
		int top = midpoint.y-(int)(midpoint.y*scrollRatio);

		int left = midpoint.x-(int)(midpoint.y*scrollRatio);
		int right = midpoint.x+(int)(midpoint.y*scrollRatio);

		if(dir==ScrollDiretion.Up) {
			swipe(new Point(midpoint.x,top),new Point(midpoint.x,bottom),SCROLL_DUR);
		}
		else if(dir==ScrollDiretion.DOWN) {
			swipe(new Point(midpoint.x,bottom),new Point(midpoint.x,top),SCROLL_DUR);
		}
		else if(dir==ScrollDiretion.LEFT) {
			swipe(new Point(left ,midpoint.y),new Point(right ,midpoint.y),SCROLL_DUR);
		}
		else{
			swipe(new Point(right,midpoint.y),new Point(left,midpoint.y),SCROLL_DUR);
		}

		Point start =new Point(right,midpoint.y);
		Point end =new Point(left,midpoint.y);

		swipe(start,end,Duration.ofMillis(300));
	}

	public static void swipe (Point start,Point end, Duration duration) {

		PointerInput input = new PointerInput(PointerInput.Kind.TOUCH,"finger1");
		Sequence swipe =new Sequence(input, 0);

		swipe.addAction(input.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), start.x, start.y));
		swipe.addAction(input.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));


		swipe.addAction(input.createPointerMove(duration, PointerInput.Origin.viewport(), end.x, end.y));
		swipe.addAction(input.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

		((AppiumDriver)Scroll.driver).perform(ImmutableList.of(swipe));


	}

}
