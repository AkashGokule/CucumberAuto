package utilityClass;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageLayer.OHRMLoginPage;
import pageLayer.RecruitmentPage;
import pageLayer.DashBoardPage;
public class BaseClass {
	
	public static  WebDriver driver;
//	public CheckoutPage CheckoutPage;
//	public S_Login s_Login;
//	public S_Inventory s_Inventory;
	
	public static OHRMLoginPage OHRMLoginPage;
	public static DashBoardPage DashBoardPage;
	public  static RecruitmentPage recruitmentPage;
	public static Logger logger;
	
	public void browserLaunch(){
		 logger= LogManager.getLogger(this.getClass());
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();	
		 // driver.navigate().to("https://www.facebook.com/login/"); 
		//   driver.navigate().to("https://www.saucedemo.com/");
		 driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		 recruitmentPage = new RecruitmentPage();
		 OHRMLoginPage = new OHRMLoginPage();
		 DashBoardPage = new DashBoardPage();
		
		 
//		 s_Login = new S_Login();
//		 s_Inventory = new S_Inventory();
//		 CheckoutPage=new CheckoutPage();
		
	}

}
