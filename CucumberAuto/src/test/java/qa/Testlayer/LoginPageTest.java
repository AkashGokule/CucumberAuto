package qa.Testlayer;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import qa.TestBase.TestBase;


public class LoginPageTest extends TestBase{

	@Test(priority = 1)
	public void loginPageTest_WithvalidCredential() {

		login.enter_email("akashgokule12345@mailinator.com");
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();

		
		String Actualresult = login.loginSuccessFullmassage();
		String expexted ="Login Successful";
		System.out.println(Actualresult);
		assertEquals(Actualresult , expexted);}

	@Test(priority = 6, groups = "regression")
	public void loginPageTest_invalidEmailCredential() {

		login.enter_email("gokuleakash12@mailinator.com");
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();

		String Actualresult =	login.badCredentials();
		System.out.println(Actualresult);
		String expexted1 = "Bad credentials!";	
		assertEquals(Actualresult , expexted1);
	}

	@Test(priority = 5)
	public void loginPageTest_invalidpassCredential() throws InterruptedException {

		login.enter_email("akashgokule12345@mailinator.com");
		login.enter_password("abc13");
		login.click_on_login_btn();

		String Actualresult =	login.badCredentials();
		System.out.println(Actualresult);
		String expexted1 = "Bad credentials!";
		assertEquals(Actualresult , expexted1);
	}
	
	@Test(priority = 4)
	public void loginPageTest_EmptyInpute() throws InterruptedException {

		login.enter_email("");
		login.enter_password("");
		login.click_on_login_btn();

		String Actualresult =login.ErroremailId();
		String expexted = "Please enter a valid email Address";
		System.out.println(Actualresult);
		assertEquals(Actualresult, expexted);

		String expexted1 = "Password cannot be blank";	
		String Actualresult1 = login.Errorepass();
		System.out.println(Actualresult1);
		assertEquals(Actualresult1 , expexted1);


	}
	@Test(priority = 3)
	public void loginPageTest_EmptyPassword() throws InterruptedException {

		login.enter_email("akashgokule12345@mailinator.com");
		login.enter_password("");
		login.click_on_login_btn();

		String expexted1 = "Password cannot be blank";	
		String Actualresult1 = login.Errorepass();
		System.out.println(Actualresult1);
		assertEquals(Actualresult1 , expexted1);


	}
	@Test(priority = 2)
	public void loginPageTest_EmptyEmail() throws InterruptedException {

		login.enter_email("");
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
		
		String Actualresult =login.ErroremailId();
		String expexted = "Please enter a valid email Address";
		System.out.println(Actualresult);
		assertEquals(Actualresult , expexted);


	}
}
