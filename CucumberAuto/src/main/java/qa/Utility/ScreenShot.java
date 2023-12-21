package qa.Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import qa.TestBase.TestBase;

public class ScreenShot extends TestBase{
	
	
 

		public static void screenShot(String name) {	
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE );
			String path="C:\\AkashWorkspace\\WorkSpaceEclips\\CheckTrack\\ScreenShot\\";
			File des=new File(path+name+".png");
			try {
				FileHandler.copy(src, des);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	public static void scrollUpDown() {
		JavascriptExecutor ak=((JavascriptExecutor)driver);
		ak.executeScript("scrollBy(0,2000)");
	}




	}


