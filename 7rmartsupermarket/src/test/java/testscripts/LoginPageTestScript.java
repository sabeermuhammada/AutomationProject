package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import constants.Constants;
import ultilies.ExcelUtility;

public class LoginPageTestScript extends BaseClassTestScript {

	HomePage home;
	@Test(priority = 1,retryAnalyzer = retry.Retry.class, description ="Login Page Testcase")
	public void verifyusernameandpassword() throws IOException {

		LoginPage loginpageobj = new LoginPage(driver);
		String username = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password = ExcelUtility.getStringData(1, 1, "LoginPage");
		loginpageobj.enterusernameandpassword(username,password);
		home = loginpageobj.clickloginbutton();
		System.out.println("Verify user name and password execute sucessfully completed");
		boolean dashboarddisplayed = loginpageobj.isverifydashboard();
		Assert.assertTrue(dashboarddisplayed, Constants.ERRORMESSAGEFORLOGIN);
	}

	@Test(priority = 2)
	public void verifycurrectusernameandwrongpassword() {
		LoginPage loginpageobj = new LoginPage(driver);
		loginpageobj.enterusernameandpassword("admin", "Admin");
		loginpageobj.clickloginbutton();
		System.out.println("Verify currect user name and wrong password execute sucessfully completed");
	}

	@Test(priority = 3)
	public void verifywrongusernameandcurrectpassword() {
		LoginPage loginpageobj = new LoginPage(driver);
		loginpageobj.enterusernameandpassword("sabeer", "admin");
		loginpageobj.clickloginbutton();
		System.out.println("Verify wrong user name and currect password execute sucessfully completed");
	}

	@Test(priority = 4)
	public void verifywrongusernameandwrongpassword() {
		LoginPage loginpageobj = new LoginPage(driver);
		loginpageobj.enterusernameandpassword("sabeer", "1234");
		loginpageobj.clickloginbutton();
		System.out.println("Verify wrong user name and wrong password execute sucessfully completed");
	}

	@DataProvider(name = "credentials")
	public Object[][] testData() {
		Object datas[][] = { { "admin", "admin" }, { "admin", "Admin" }, { "sabeer", "admin" }, { "sabeer", "1234" } };
		return datas;
	}

	@Test(priority = 5, dataProvider = "credentials")
	public void verifyDataProviderExecution(String userid, String passcode) {

		LoginPage loginpageobj = new LoginPage(driver);
		loginpageobj.enterusernameandpassword(userid, passcode);
		loginpageobj.clickloginbutton();
		System.out.println("Verify user name and password execute with data provider sucessfully completed");
	}

}
